
package Interfaz;

import Dominio.Autor;
import Dominio.Editorial;
import Dominio.Genero;
import Dominio.Sistema;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author pipetorrendell
 */
public class VentanaRegistroLibro extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form VentanaRegistroLibro
     */
    public VentanaRegistroLibro(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        inicializarListas();
    }

    private void inicializarListas() {
        // Poblar lista de Editoriales
        DefaultListModel<Editorial> modeloEditorial = new DefaultListModel<>();
        sistema.getEditoriales().forEach(modeloEditorial::addElement);
        lstEditorial.setModel(modeloEditorial);
        lstEditorial.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JLabel label = new JLabel(value.getNombre());
            if (isSelected) {
                label.setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
                label.setOpaque(true);
            }
            return label;
        });

        // Poblar lista de Géneros
        DefaultListModel<Genero> modeloGenero = new DefaultListModel<>();
        sistema.getGeneros().forEach(modeloGenero::addElement);
        lstGenero.setModel(modeloGenero);
        lstGenero.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JLabel label = new JLabel(value.getNombre());
            if (isSelected) {
                label.setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
                label.setOpaque(true);
            }
            return label;
        });

        // Configurar cambio dinámico de autores basado en género seleccionado
        lstGenero.addListSelectionListener(e -> actualizarListaAutores());
    }

    private void actualizarListaAutores() {
        Genero generoSeleccionado = lstGenero.getSelectedValue();
        if (generoSeleccionado != null) {
            DefaultListModel<Autor> modeloAutor = new DefaultListModel<>();
            sistema.getAutores().stream()
                    .filter(autor -> autor.getGeneros().contains(generoSeleccionado))
                    .forEach(modeloAutor::addElement);
            lstAutor.setModel(modeloAutor);

            // Configurar cómo se muestra el autor en la lista
            lstAutor.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
                JLabel label = new JLabel(value.getNombre());
                if (isSelected) {
                    label.setBackground(list.getSelectionBackground());
                    label.setForeground(list.getSelectionForeground());
                    label.setOpaque(true);
                }
                return label;
            });

            // Habilitar selección única
            lstAutor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        } else {
            lstAutor.setModel(new DefaultListModel<>()); // Vacía la lista si no hay género seleccionado
        }
    }

    private void guardarLibro(java.awt.event.ActionEvent evt) {
        String isbn = txtISBN.getText().trim();
        String titulo = txtTituloLibro.getText().trim();
        Editorial editorialSeleccionada = lstEditorial.getSelectedValue();
        Genero generoSeleccionado = lstGenero.getSelectedValue();
        Autor autorSeleccionado = lstAutor.getSelectedValue();
        String precioCostoStr = txtPrecioCosto.getText().trim();
        String precioVentaStr = txtPrecioVenta.getText().trim();
        String stockStr = txtStock.getText().trim();
        String foto = lblFoto.getText().equals("Sin Foto") ? null : lblFoto.getText();

        // Validar datos
        if (isbn.isEmpty() || titulo.isEmpty() || editorialSeleccionada == null
                || generoSeleccionado == null || autorSeleccionado == null
                || precioCostoStr.isEmpty() || precioVentaStr.isEmpty() || stockStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        try {
            double precioCosto = Double.parseDouble(precioCostoStr);
            double precioVenta = Double.parseDouble(precioVentaStr);
            int stock = Integer.parseInt(stockStr);

            // Copiar foto si existe
            if (foto != null) {
                copiarFoto(foto, isbn);
            }

            // Guardar el libro en el sistema
            if (!sistema.guardarLibro(isbn, titulo, editorialSeleccionada, generoSeleccionado,
                    autorSeleccionado, precioCosto, precioVenta, stock, foto)) {
                JOptionPane.showMessageDialog(this, "No se pudo guardar el libro. Verifique los datos.");
                return;
            }

            // Limpiar formulario
            txtISBN.setText("");
            txtTituloLibro.setText("");
            txtPrecioCosto.setText("");
            txtPrecioVenta.setText("");
            txtStock.setText("");
            lblFoto.setText("Sin Foto");
            lstEditorial.clearSelection();
            lstGenero.clearSelection();
            lstAutor.clearSelection();

            JOptionPane.showMessageDialog(this, "Libro guardado con éxito.");

            // Guardar datos en archivo
            sistema.saveData("data/sistema.ser");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos en los campos de precio y stock.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la foto: " + e.getMessage());
        }
    }

    private void copiarFoto(String fotoPath, String isbn) throws IOException {
        File archivoFuente = new File(fotoPath);

        // Validar la extensión del archivo
        String extension = getFileExtension(archivoFuente);

        // Crear la carpeta "imagenes" si no existe
        File destino = new File("imagenes");
        if (!destino.exists() && !destino.mkdirs()) {
            throw new IOException("No se pudo crear la carpeta 'imagenes'.");
        }

        // Crear el archivo destino con el nombre basado en el ISBN
        File fotoDestino = new File(destino, isbn + "." + extension);

        // Copiar el archivo
        Files.copy(archivoFuente.toPath(), fotoDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);

        // Actualizar la ruta en el JLabel (opcional, para verificar)
        lblFoto.setText(fotoDestino.getAbsolutePath());
    }

    private String getFileExtension(File file) {
        String nombreArchivo = file.getName();
        int lastDotIndex = nombreArchivo.lastIndexOf(".");
        if (lastDotIndex == -1 || lastDotIndex == nombreArchivo.length() - 1) {
            return ""; // Sin extensión
        }
        return nombreArchivo.substring(lastDotIndex + 1).toLowerCase(); // Retorna la extensión en minúsculas
    }

    private void mostrarImagenEnLabel(String rutaImagen) {
        ImageIcon icon = new ImageIcon(rutaImagen);
        Image img = icon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
        lblFoto.setIcon(new ImageIcon(img));
        lblFoto.setText(""); // Limpia el texto del JLabel
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistroLibro = new javax.swing.JPanel();
        jblTituloRegistroEditoriales = new javax.swing.JLabel();
        lblTituloLibro = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblPrecioCosto = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPrecioCosto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        lblEditorial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        lblGenero = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        btnCargarFoto = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnGuardarLibro = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstGenero = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAutor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Registro Libro");

        jPanelRegistroLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTituloRegistroEditoriales.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jblTituloRegistroEditoriales.setText("Registro de Libros");
        jblTituloRegistroEditoriales.setToolTipText("");
        jPanelRegistroLibro.add(jblTituloRegistroEditoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 23, -1, -1));

        lblTituloLibro.setText("Titulo");
        jPanelRegistroLibro.add(lblTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 81, -1, -1));

        lblISBN.setText("ISBN");
        jPanelRegistroLibro.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 119, -1, -1));

        lblPrecioCosto.setText("Precio de Costo");
        jPanelRegistroLibro.add(lblPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, -1, -1));

        lblPrecioVenta.setText("Precio de Venta");
        jPanelRegistroLibro.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 201, -1, -1));

        lblStock.setText("Stock");
        jPanelRegistroLibro.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 242, -1, -1));

        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });
        jPanelRegistroLibro.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 78, 126, -1));
        jPanelRegistroLibro.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 119, 128, -1));
        jPanelRegistroLibro.add(txtPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 160, 60, -1));
        jPanelRegistroLibro.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 201, 60, -1));
        jPanelRegistroLibro.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 242, 124, -1));

        lblEditorial.setText("Editorial");
        jPanelRegistroLibro.add(lblEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 70, -1, -1));

        jScrollPane1.setViewportView(lstEditorial);

        jPanelRegistroLibro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 93, 100, 172));

        lblGenero.setText("Genero");
        jPanelRegistroLibro.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 70, -1, -1));

        lblAutor.setText("Autor");
        jPanelRegistroLibro.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 70, -1, -1));

        btnCargarFoto.setText("Cargar Foto");
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });
        jPanelRegistroLibro.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 303, -1, -1));

        lblFoto.setText("Sin Foto");
        lblFoto.setToolTipText("");
        jPanelRegistroLibro.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 299, 220, 270));

        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });
        jPanelRegistroLibro.add(btnGuardarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 379, -1, -1));

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jPanelRegistroLibro.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 517, -1, -1));

        lstGenero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setViewportView(lstGenero);

        jPanelRegistroLibro.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 93, 100, 172));

        lstAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setViewportView(lstAutor);

        jPanelRegistroLibro.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 93, 100, 172));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistroLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistroLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Validar que el archivo tenga una extensión de imagen válida
                String fotoPath = selectedFile.getAbsolutePath();
                String extension = getFileExtension(selectedFile);
                if (!extension.matches("jpg|jpeg|png|gif|bmp")) {
                    throw new IOException("El archivo seleccionado no es una imagen válida.");
                }

                // Mostrar la imagen en el JLabel
                mostrarImagenEnLabel(fotoPath);

                // Guardar temporalmente la ruta del archivo seleccionado
                lblFoto.setText(fotoPath);

                JOptionPane.showMessageDialog(this, "Foto cargada con éxito.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar la foto: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        VentanaMenu menu = new VentanaMenu(sistema);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        guardarLibro(evt);
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = Sistema.loadData("data/sistema.ser");
                new VentanaRegistroLibro(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JPanel jPanelRegistroLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jblTituloRegistroEditoriales;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblPrecioCosto;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTituloLibro;
    private javax.swing.JList<Autor> lstAutor;
    private javax.swing.JList<Editorial> lstEditorial;
    private javax.swing.JList<Genero> lstGenero;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
