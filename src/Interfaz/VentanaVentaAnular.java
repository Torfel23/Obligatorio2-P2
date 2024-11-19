
package Interfaz;

import Dominio.Sistema;

/**
 *
 * @author pipetorrendell
 */
public class VentanaVentaAnular extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form VentanaAnularVenta
     */
    public VentanaVentaAnular(Sistema sistema) {
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

        jPanelVentaAnular = new javax.swing.JPanel();
        jblTituloVentaAnular = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        lblNumeroFactura = new javax.swing.JLabel();
        btnBuscarFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentaAnular = new javax.swing.JTable();
        lblTotalVenta = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        btnAnularVenta = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anulación de Venta");

        jblTituloVentaAnular.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jblTituloVentaAnular.setText("Anulacion de Venta");

        lblNumeroFactura.setText("Factura");

        btnBuscarFactura.setText("Buscar");

        jScrollPane1.setToolTipText("");

        tblVentaAnular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título del Libro", "Cantidad", "Precio Unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblVentaAnular);

        lblTotalVenta.setText("Total Venta");

        btnAnularVenta.setText("Anular Venta");

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVentaAnularLayout = new javax.swing.GroupLayout(jPanelVentaAnular);
        jPanelVentaAnular.setLayout(jPanelVentaAnularLayout);
        jPanelVentaAnularLayout.setHorizontalGroup(
            jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                .addGroup(jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jblTituloVentaAnular))
                    .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblNumeroFactura)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscarFactura))
                    .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                                .addComponent(lblTotalVenta)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnularVenta)
                                .addGap(64, 64, 64)))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentaAnularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverMenu)
                .addGap(81, 81, 81))
        );
        jPanelVentaAnularLayout.setVerticalGroup(
            jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaAnularLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jblTituloVentaAnular)
                .addGap(37, 37, 37)
                .addGroup(jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFactura)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFactura))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVentaAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalVenta)
                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnularVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnVolverMenu)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVentaAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVentaAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        VentanaMenu menu = new VentanaMenu(sistema);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVentaAnular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaAnular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaAnular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaAnular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = Sistema.loadData("data/sistema.ser");
                new VentanaVentaAnular(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularVenta;
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JPanel jPanelVentaAnular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblTituloVentaAnular;
    private javax.swing.JLabel lblNumeroFactura;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JTable tblVentaAnular;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
