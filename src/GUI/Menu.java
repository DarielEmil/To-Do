
package GUI;
import database.conexionDB;



/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {
    conexionDB cn = new conexionDB();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(salir, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/cancel-5637_Ls9glpCn-.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(acerca, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/info-help-358_3-A0SjLtW.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(cerrars, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/quit-378_A_eNGK8Lq.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(ayuda, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/wrench-5969_WfhrMla0Z.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btniniciar = new javax.swing.JButton();
        salir = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        acerca = new javax.swing.JLabel();
        cerrars = new javax.swing.JLabel();
        btnacercade = new javax.swing.JButton();
        btncerrars = new javax.swing.JButton();
        ayuda = new javax.swing.JLabel();
        btnayuda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(3, 4, 94), new java.awt.Color(3, 4, 94), new java.awt.Color(3, 4, 94), new java.awt.Color(3, 4, 94)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 4, 94));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, -1));

        btniniciar.setBackground(new java.awt.Color(3, 4, 94));
        btniniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btniniciar.setForeground(new java.awt.Color(255, 255, 255));
        btniniciar.setText("Iniciar");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 190, 50));

        salir.setText("sal");
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 30, 30));

        btnsalir.setBackground(new java.awt.Color(3, 4, 94));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, 50));

        acerca.setText("acer");
        jPanel1.add(acerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 30, 30));

        cerrars.setText("sing");
        jPanel1.add(cerrars, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 30, 30));

        btnacercade.setBackground(new java.awt.Color(3, 4, 94));
        btnacercade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnacercade.setForeground(new java.awt.Color(255, 255, 255));
        btnacercade.setText("Acerca de");
        jPanel1.add(btnacercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, 50));

        btncerrars.setBackground(new java.awt.Color(3, 4, 94));
        btncerrars.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncerrars.setForeground(new java.awt.Color(255, 255, 255));
        btncerrars.setText("Cerrar Sesión");
        btncerrars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrars, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, 50));

        ayuda.setText("ayu");
        jPanel1.add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 30, 30));

        btnayuda.setBackground(new java.awt.Color(3, 4, 94));
        btnayuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnayuda.setForeground(new java.awt.Color(255, 255, 255));
        btnayuda.setText("Ayuda");
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Polygon 4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 141.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 529, -1, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsActionPerformed
        // TODO add your handling code here:
        Log newframe = new Log();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarsActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        // TODO add your handling code here:
        ayuda1 newframe = new ayuda1();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        // TODO add your handling code here:
        DentroApp newframe = new DentroApp();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btniniciarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acerca;
    private javax.swing.JLabel ayuda;
    private javax.swing.JButton btnacercade;
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btncerrars;
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel cerrars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
}