/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import javax.swing.JOptionPane;


/**
 *
 * @author alanm
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        
        
    }

     private void cerrar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", dialog);

        if (result == 0) {
            System.exit(0);
        } else {
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLCorteM = new javax.swing.JLabel();
        btnCortes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLAsignarEsM = new javax.swing.JLabel();
        btnEstudiosInstituciones = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLEstudioM = new javax.swing.JLabel();
        btnEstudios = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLAreaM = new javax.swing.JLabel();
        btnAreas = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLInstitucionM = new javax.swing.JLabel();
        btnInstituciones = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnConsentimientos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnReagendar = new javax.swing.JButton();
        jLogoEmpresa = new javax.swing.JLabel();
        jLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 51, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HOLA, BIENVENIDO");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 40));

        jPanel10.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCorteM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cortemenu.png"))); // NOI18N
        jPanel1.add(jLCorteM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnCortes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCortes.setForeground(new java.awt.Color(0, 0, 51));
        btnCortes.setText("Cortes");
        btnCortes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCortes.setContentAreaFilled(false);
        jPanel1.add(btnCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 30));

        jPanel10.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 110));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLAsignarEsM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AsigEsMenu.png"))); // NOI18N
        jPanel2.add(jLAsignarEsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnEstudiosInstituciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEstudiosInstituciones.setText("Asignar estudios");
        btnEstudiosInstituciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstudiosInstituciones.setContentAreaFilled(false);
        btnEstudiosInstituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiosInstitucionesActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstudiosInstituciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 30));

        jPanel10.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, 110));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEstudioM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estudioMenu.png"))); // NOI18N
        jPanel4.add(jLEstudioM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnEstudios.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEstudios.setForeground(new java.awt.Color(0, 0, 51));
        btnEstudios.setText("Estudios");
        btnEstudios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstudios.setContentAreaFilled(false);
        jPanel4.add(btnEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jPanel10.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 140, 110));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLAreaM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/areamenu.png"))); // NOI18N
        jPanel5.add(jLAreaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnAreas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAreas.setForeground(new java.awt.Color(0, 0, 51));
        btnAreas.setText("Áreas");
        btnAreas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAreas.setContentAreaFilled(false);
        btnAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreasActionPerformed(evt);
            }
        });
        jPanel5.add(btnAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 140, 110));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLInstitucionM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/institucionesMenu.png"))); // NOI18N
        jPanel6.add(jLInstitucionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 50));

        btnInstituciones.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnInstituciones.setForeground(new java.awt.Color(0, 0, 51));
        btnInstituciones.setText("Instituciones");
        btnInstituciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInstituciones.setContentAreaFilled(false);
        jPanel6.add(btnInstituciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, 110));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsentimientos.setText("Consentimientos");
        jPanel7.add(btnConsentimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 140, 110));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(btnReagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jPanel10.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 110));

        jLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Diagnocons.png"))); // NOI18N
        jPanel10.add(jLogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimizar1.png"))); // NOI18N
        jPanel10.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 20, 30));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar1.png"))); // NOI18N
        jPanel10.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        jButton1.setText("jButton1");
        jButton1.setContentAreaFilled(false);
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 0, 40, 30));

        jButton2.setText("jButton2");
        jButton2.setContentAreaFilled(false);
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 0, 30, 30));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudiosInstitucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiosInstitucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstudiosInstitucionesActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAreasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAreas;
    public javax.swing.JButton btnConsentimientos;
    public javax.swing.JButton btnCortes;
    public javax.swing.JButton btnEstudios;
    public javax.swing.JButton btnEstudiosInstituciones;
    public javax.swing.JButton btnInstituciones;
    public javax.swing.JButton btnReagendar;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLAreaM;
    private javax.swing.JLabel jLAsignarEsM;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLCorteM;
    private javax.swing.JLabel jLEstudioM;
    private javax.swing.JLabel jLInstitucionM;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLogoEmpresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
