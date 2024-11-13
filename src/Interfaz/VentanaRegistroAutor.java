/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.ListSelectionModel;

/**
 *
 * @author pipetorrendell
 */
public class VentanaRegistroAutor extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroAutor
     */
    public VentanaRegistroAutor() {
        initComponents();
        lstGeneros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistroAutor = new javax.swing.JPanel();
        jblTituloRegistroAutores = new javax.swing.JLabel();
        jlbNombreAutor = new javax.swing.JLabel();
        jlbNacionalidadAutor = new javax.swing.JLabel();
        jlbGenerosAutor = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        txtNacionalidadAutor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        btnGuardarAutor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAutoresRegistrados = new javax.swing.JList<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Autores");

        jblTituloRegistroAutores.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jblTituloRegistroAutores.setText("Registro de Autores");

        jlbNombreAutor.setText("Nombre");

        jlbNacionalidadAutor.setText("Nacionalidad");

        jlbGenerosAutor.setText("Generos");

        txtNacionalidadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadAutorActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstGeneros);

        jScrollPane2.setViewportView(jScrollPane1);

        btnGuardarAutor.setText("Guardar");
        btnGuardarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAutorActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstAutoresRegistrados);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroAutorLayout = new javax.swing.GroupLayout(jPanelRegistroAutor);
        jPanelRegistroAutor.setLayout(jPanelRegistroAutorLayout);
        jPanelRegistroAutorLayout.setHorizontalGroup(
            jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jblTituloRegistroAutores)
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroAutorLayout.createSequentialGroup()
                .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                                    .addComponent(jlbNombreAutor)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                                    .addComponent(jlbNacionalidadAutor)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNacionalidadAutor)))
                            .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                                    .addComponent(jlbGenerosAutor)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnGuardarAutor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanelRegistroAutorLayout.setVerticalGroup(
            jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jblTituloRegistroAutores)
                .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombreAutor)
                            .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNacionalidadAutor)
                            .addComponent(txtNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jlbGenerosAutor))
                    .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarAutor))
                    .addGroup(jPanelRegistroAutorLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistroAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNacionalidadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadAutorActionPerformed

    private void btnGuardarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAutorActionPerformed

    }//GEN-LAST:event_btnGuardarAutorActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaMenu menu = new VentanaMenu(); 
        menu.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAutor;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanelRegistroAutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jblTituloRegistroAutores;
    private javax.swing.JLabel jlbGenerosAutor;
    private javax.swing.JLabel jlbNacionalidadAutor;
    private javax.swing.JLabel jlbNombreAutor;
    private javax.swing.JList<String> lstAutoresRegistrados;
    private javax.swing.JList<String> lstGeneros;
    private javax.swing.JTextField txtNacionalidadAutor;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables
}