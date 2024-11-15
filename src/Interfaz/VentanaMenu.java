/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Interfaz;

import Dominio.Sistema;

/**
 *
 * @author pipetorrendell
 */
public class VentanaMenu extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu(Sistema sistema) {
        this.sistema = sistema;
        initComponents(); // Método para inicializar los componentes de la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jlbBienvenido = new javax.swing.JLabel();
        jlbSeleccione = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        VentanaRegistroAutor = new javax.swing.JMenuItem();
        VentanaRegistroLibro = new javax.swing.JMenuItem();
        VentanaRegistroEditorial = new javax.swing.JMenuItem();
        VentanaRegistroGenero = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        VentanaVentaRegistro = new javax.swing.JMenuItem();
        VentanaVentaAnular = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        VentanaConsultaLibro = new javax.swing.JMenuItem();
        VentanaConsultaVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías - Realizado por: Felipe Torrendell 302851 - Nicholas Davies 282236");

        jlbBienvenido.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jlbBienvenido.setText("Bienvenido a tu Gestion de Libreria");

        jlbSeleccione.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlbSeleccione.setText("Seleccione una opción del menú para comenzar.");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Este sistema permite gestionar libros, autores, editoriales y realizar ventas.");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlbSeleccione))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jlbBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jlbBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jlbSeleccione)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        menuRegistros.setMnemonic('f');
        menuRegistros.setText("Registros");

        VentanaRegistroAutor.setMnemonic('o');
        VentanaRegistroAutor.setText("Registro de Autor");
        VentanaRegistroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaRegistroAutorActionPerformed(evt);
            }
        });
        menuRegistros.add(VentanaRegistroAutor);

        VentanaRegistroLibro.setMnemonic('x');
        VentanaRegistroLibro.setText("Registro de Libro");
        VentanaRegistroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaRegistroLibroActionPerformed(evt);
            }
        });
        menuRegistros.add(VentanaRegistroLibro);

        VentanaRegistroEditorial.setMnemonic('s');
        VentanaRegistroEditorial.setText("Registro de Editorial");
        VentanaRegistroEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaRegistroEditorialActionPerformed(evt);
            }
        });
        menuRegistros.add(VentanaRegistroEditorial);

        VentanaRegistroGenero.setMnemonic('a');
        VentanaRegistroGenero.setText("Registro de Genero");
        VentanaRegistroGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaRegistroGeneroActionPerformed(evt);
            }
        });
        menuRegistros.add(VentanaRegistroGenero);

        menuBar.add(menuRegistros);

        menuVentas.setMnemonic('h');
        menuVentas.setText("Ventas");

        VentanaVentaRegistro.setMnemonic('c');
        VentanaVentaRegistro.setText("Registrar Venta");
        VentanaVentaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaVentaRegistroActionPerformed(evt);
            }
        });
        menuVentas.add(VentanaVentaRegistro);

        VentanaVentaAnular.setMnemonic('a');
        VentanaVentaAnular.setText("Anular Venta");
        VentanaVentaAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaVentaAnularActionPerformed(evt);
            }
        });
        menuVentas.add(VentanaVentaAnular);

        menuBar.add(menuVentas);

        menuConsultas.setMnemonic('e');
        menuConsultas.setText("Consultas");

        VentanaConsultaLibro.setMnemonic('t');
        VentanaConsultaLibro.setText("Consulta de Libro");
        VentanaConsultaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaConsultaLibroActionPerformed(evt);
            }
        });
        menuConsultas.add(VentanaConsultaLibro);

        VentanaConsultaVenta.setMnemonic('y');
        VentanaConsultaVenta.setText("Consulta de Ventas");
        VentanaConsultaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaConsultaVentaActionPerformed(evt);
            }
        });
        menuConsultas.add(VentanaConsultaVenta);

        menuBar.add(menuConsultas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentanaRegistroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaRegistroLibroActionPerformed
        VentanaRegistroLibro ventanaLibro = new VentanaRegistroLibro(sistema);
        ventanaLibro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaRegistroLibroActionPerformed

    private void VentanaRegistroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaRegistroAutorActionPerformed
        VentanaRegistroAutor ventanaAutor = new VentanaRegistroAutor(sistema);
        ventanaAutor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaRegistroAutorActionPerformed

    private void VentanaRegistroEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaRegistroEditorialActionPerformed
        VentanaRegistroEditorial ventanaEditorial = new VentanaRegistroEditorial(sistema);
        ventanaEditorial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaRegistroEditorialActionPerformed

    private void VentanaRegistroGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaRegistroGeneroActionPerformed
        VentanaRegistroGenero ventanaGenero = new VentanaRegistroGenero(sistema);
        ventanaGenero.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaRegistroGeneroActionPerformed

    private void VentanaConsultaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaConsultaLibroActionPerformed
        VentanaConsultaLibro ventanaConsultaLibro = new VentanaConsultaLibro(sistema);
        ventanaConsultaLibro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaConsultaLibroActionPerformed

    private void VentanaConsultaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaConsultaVentaActionPerformed
        VentanaConsultaVentas ventanaConsultaVentas = new VentanaConsultaVentas(sistema);
        ventanaConsultaVentas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaConsultaVentaActionPerformed

    private void VentanaVentaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaVentaRegistroActionPerformed
        VentanaVentaRegistro ventanaVenta = new VentanaVentaRegistro(sistema);
        ventanaVenta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaVentaRegistroActionPerformed

    private void VentanaVentaAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaVentaAnularActionPerformed
        VentanaVentaAnular ventanaAnular = new VentanaVentaAnular(sistema);
        ventanaAnular.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentanaVentaAnularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = Sistema.loadData("data/sistema.ser");
                new VentanaMenu(sistema).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem VentanaConsultaLibro;
    private javax.swing.JMenuItem VentanaConsultaVenta;
    private javax.swing.JMenuItem VentanaRegistroAutor;
    private javax.swing.JMenuItem VentanaRegistroEditorial;
    private javax.swing.JMenuItem VentanaRegistroGenero;
    private javax.swing.JMenuItem VentanaRegistroLibro;
    private javax.swing.JMenuItem VentanaVentaAnular;
    private javax.swing.JMenuItem VentanaVentaRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jlbBienvenido;
    private javax.swing.JLabel jlbSeleccione;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables

}
