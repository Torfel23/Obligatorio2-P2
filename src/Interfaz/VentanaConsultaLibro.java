package Interfaz;

import Dominio.Libro;
import Dominio.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author pipetorrendell
 */
public class VentanaConsultaLibro extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form VentanaConsultaLibro
     */
    public VentanaConsultaLibro(Sistema sistema) {
        this.sistema = sistema;

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblTituloConsultaLibro = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtGener = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnVolverMenu = new javax.swing.JButton();
        grid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Libros");

        jblTituloConsultaLibro.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jblTituloConsultaLibro.setText("Consulta de Libros");

        lblGenero.setText("Genero");

        txtGener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenerActionPerformed(evt);
            }
        });

        lblTitulo.setText("Titulo");

        lblAutor.setText("Autor");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 3));

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        grid.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenero)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAutor)
                                        .addComponent(lblTitulo)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtAutor)
                                    .addComponent(txtGener))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnConsultar)))
                        .addGap(26, 26, 26)
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jblTituloConsultaLibro)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverMenu)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jblTituloConsultaLibro)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGenero)
                                    .addComponent(txtGener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTitulo)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAutor)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(btnVolverMenu)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenerActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        VentanaMenu menu = new VentanaMenu(sistema);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        grid.removeAll();

        String autor = txtAutor.getText().trim();
        String genero = txtGener.getText().trim();
        String titulo = txtTitulo.getText().trim();

        if (autor.isEmpty() && genero.isEmpty() && titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete alguno de los campos.");
            return;
        }
        List<Libro> filtrados = sistema.filtrarLibros(autor, genero, titulo);

        grid.setVisible(true);

        for (int i = 0; i < filtrados.size(); ++i) {
            Libro libro = filtrados.get(i);
            JButton button = new JButton();
            String path = libro.getFoto();
            System.out.println(path);
            if (path.isEmpty() || !(new File(path).exists())) {
                button.setText(libro.getIsbn());
            } else {
                button.setIcon(new ImageIcon(path));
                button.setText(libro.getIsbn());
            }
            button.addActionListener(new LibroListener());
            grid.add(button);
        }
        grid.revalidate();
        grid.repaint();
        txtAutor.setText("");
        txtGener.setText("");
        txtTitulo.setText("");


    }//GEN-LAST:event_btnConsultarActionPerformed

    private class LibroListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            
            JButton cual = ((JButton) e.getSource());
            // código a completar según el botón presionado
            String ISBN = cual.getText();
            Libro libro = sistema.buscarLibroPorIsbn(ISBN);
            JOptionPane.showMessageDialog(rootPane, "ISBN = " + ISBN + "\nTitulo = " + libro.getTitulo() + "\nAutor = " + libro.getAutor().getNombre() + "\nGenero = " + libro.getGenero().getNombre());
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaConsultaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = Sistema.loadData("data/sistema.ser");
                new VentanaConsultaLibro(sistema).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JPanel grid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblTituloConsultaLibro;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGener;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
