package Interfaz;

import Dominio.Editorial;
import Dominio.Libro;
import Dominio.Sistema;
import Dominio.Venta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class VentanaConsultaVentas extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form VentanaConsultaVentas
     */
    public VentanaConsultaVentas(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        initializeSelectionListener();
        lstLibro.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelConsultaVenta = new javax.swing.JPanel();
        jblTituloConsultaVentas = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        btnMostrarListaLibros = new javax.swing.JButton();
        btnConsultarVenta = new javax.swing.JButton();
        btnExportarVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultaVentas = new javax.swing.JTable();
        txtTitulo = new javax.swing.JTextField();
        lblEjemplaresVendidos = new javax.swing.JLabel();
        txtEjemplaresVendidos = new javax.swing.JTextField();
        lblTotalRecaudado = new javax.swing.JLabel();
        lblTotalGanancia = new javax.swing.JLabel();
        txtTotalRecaudado = new javax.swing.JTextField();
        txtTotalGanancia = new javax.swing.JTextField();
        btnVolverMenu = new javax.swing.JButton();
        lstLibro = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Ventas");

        jblTituloConsultaVentas.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jblTituloConsultaVentas.setText("Consulta de Ventas");

        lblISBN.setText("ISBN");

        btnMostrarListaLibros.setText("...");
        btnMostrarListaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaLibrosActionPerformed(evt);
            }
        });

        btnConsultarVenta.setText("Consultar");
        btnConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVentaActionPerformed(evt);
            }
        });

        btnExportarVenta.setText("Exportar");
        btnExportarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarVentaActionPerformed(evt);
            }
        });

        tblConsultaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cliente", "Factura", "Cantidad", "Precio", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblConsultaVentas);

        txtTitulo.setEditable(false);

        lblEjemplaresVendidos.setText("Ejemplares Vendidos");

        txtEjemplaresVendidos.setEditable(false);

        lblTotalRecaudado.setText("Total Recaudado");

        lblTotalGanancia.setText("Total Ganancia");

        txtTotalRecaudado.setEditable(false);

        txtTotalGanancia.setEditable(false);

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaVentaLayout = new javax.swing.GroupLayout(jPanelConsultaVenta);
        jPanelConsultaVenta.setLayout(jPanelConsultaVentaLayout);
        jPanelConsultaVentaLayout.setHorizontalGroup(
            jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createSequentialGroup()
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                                .addComponent(lblISBN)
                                .addGap(18, 18, 18)
                                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrarListaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(btnConsultarVenta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                        .addComponent(btnExportarVenta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelConsultaVentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverMenu)))
                .addGap(39, 39, 39))
            .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEjemplaresVendidos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createSequentialGroup()
                        .addComponent(txtEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(68, 68, 68)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                        .addComponent(lblTotalRecaudado)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createSequentialGroup()
                        .addComponent(txtTotalRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalGanancia)
                    .addComponent(txtTotalGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblTituloConsultaVentas)
                .addGap(314, 314, 314))
        );
        jPanelConsultaVentaLayout.setVerticalGroup(
            jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jblTituloConsultaVentas)
                .addGap(27, 27, 27)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarListaLibros)
                    .addComponent(btnConsultarVenta)
                    .addComponent(btnExportarVenta))
                .addGap(19, 19, 19)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalRecaudado)
                        .addComponent(lblTotalGanancia))
                    .addComponent(lblEjemplaresVendidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolverMenu)
                        .addGap(32, 32, 32))
                    .addGroup(jPanelConsultaVentaLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelConsultaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotalRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeSelectionListener() {
        lstLibro.addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) { // Avoid multiple events for a single click
                Libro selectedLibro = lstLibro.getSelectedValue(); // Get selected item
                if (selectedLibro != null) {
                    txtISBN.setText(selectedLibro.getIsbn()); // Set ISBN to txtISBN
                }
            }
        });
    }

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        VentanaMenu menu = new VentanaMenu(sistema);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVentaActionPerformed
        String ISBN = txtISBN.getText().trim();
        Libro libro = sistema.buscarLibroPorIsbn(ISBN);
        if (libro == null) {
            JOptionPane.showMessageDialog(this, "No existe un libro con ese ISBN o esta vacio");
            txtISBN.setText("");
            return;
        }
        List<Venta> VentaFiltrada = sistema.getVentasPorIsbn(ISBN);

        txtTitulo.setText(libro.getTitulo());
        DefaultTableModel model = (DefaultTableModel) tblConsultaVentas.getModel();
        model.setRowCount(0);
        int ejemplaresVendidos = 0;
        double totalRecaudado = 0;
        for (int i = 0; i < VentaFiltrada.size(); ++i) {
            Venta venta = VentaFiltrada.get(i);
            double total = (libro.getPrecioVenta() * venta.getCantidad(libro));
            model.addRow(new Object[]{venta.getFecha(), venta.getCliente(), venta.getNumeroFactura(), venta.getCantidad(libro), libro.getPrecioVenta(), total});

            ejemplaresVendidos += venta.getCantidad(libro);
            totalRecaudado += total;
        }
        double totalGanancia = totalRecaudado - (ejemplaresVendidos * libro.getPrecioCosto());

        txtEjemplaresVendidos.setText(String.valueOf(ejemplaresVendidos));
        txtTotalRecaudado.setText(String.valueOf(totalRecaudado));
        txtTotalGanancia.setText(String.valueOf(totalGanancia));

        txtISBN.setText("");
    }//GEN-LAST:event_btnConsultarVentaActionPerformed

    private void btnExportarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarVentaActionPerformed

        File file = new File("ventas.csv");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al abrir ventas.csv");
            return;
        }
        BufferedWriter writer = new BufferedWriter(fileWriter);

        DefaultTableModel model = (DefaultTableModel) tblConsultaVentas.getModel();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos para exportar.");
            return;
        }
        
        try {
            writer.write("Fecha;Cliente;Factura;Cantidad;Precio;Importe");

            for (int i = 0; i < model.getRowCount(); ++i) {
                String fecha = (String) model.getValueAt(i, 0);
                String cliente = (String) model.getValueAt(i, 1);
                String factura = (String) model.getValueAt(i, 2).toString();
                String cantidad = (String) model.getValueAt(i, 3).toString();
                String precio = (String) model.getValueAt(i, 4).toString();
                String importe = (String) model.getValueAt(i, 5).toString();

                writer.write(fecha + ";" + cliente + ";" + factura + ";" + cantidad + ";" + precio + ";" + importe + "\n");
            }
            JOptionPane.showMessageDialog(rootPane, "Datos Exportados Correctamente!");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(VentanaConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarVentaActionPerformed
    private boolean isListVisible = false;

    private void btnMostrarListaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaLibrosActionPerformed
        if (isListVisible) {
        // Hide the list
        lstLibro.setVisible(false);
        btnMostrarListaLibros.setText("Mostrar Lista Libros");
    } else {
        // Show the list and populate it
        DefaultListModel<Libro> modeloLibro = new DefaultListModel<>();
        sistema.getLibros().forEach(modeloLibro::addElement);
        lstLibro.setModel(modeloLibro);
        lstLibro.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JLabel label = new JLabel(value.getIsbn() + " - " + value.getTitulo());
            if (isSelected) {
                label.setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
                label.setOpaque(true);
            }
            return label;
        });

        // Add a MouseListener to handle item selection
        lstLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 1) { // Single-click event
                    int index = lstLibro.locationToIndex(evt.getPoint());
                    if (index >= 0) {
                        Libro selectedLibro = lstLibro.getModel().getElementAt(index);
                        txtISBN.setText(selectedLibro.getIsbn()); // Pass the ISBN to txtISBN
                        lstLibro.setVisible(false); // Hide the list
                        btnMostrarListaLibros.setText("Mostrar Lista Libros");
                        isListVisible = false; // Update the visibility flag
                    }
                }
            }
        });

        lstLibro.setVisible(true);
        btnMostrarListaLibros.setText("Ocultar Lista Libros");
    }
    isListVisible = !isListVisible; // Toggle the flag
    }//GEN-LAST:event_btnMostrarListaLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = Sistema.loadData("data/sistema.ser");
                new VentanaConsultaVentas(sistema).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarVenta;
    private javax.swing.JButton btnExportarVenta;
    private javax.swing.JButton btnMostrarListaLibros;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JPanel jPanelConsultaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jblTituloConsultaVentas;
    private javax.swing.JLabel lblEjemplaresVendidos;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblTotalGanancia;
    private javax.swing.JLabel lblTotalRecaudado;
    private javax.swing.JList<Libro> lstLibro;
    private javax.swing.JTable tblConsultaVentas;
    private javax.swing.JTextField txtEjemplaresVendidos;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTotalGanancia;
    private javax.swing.JTextField txtTotalRecaudado;
    // End of variables declaration//GEN-END:variables
}
