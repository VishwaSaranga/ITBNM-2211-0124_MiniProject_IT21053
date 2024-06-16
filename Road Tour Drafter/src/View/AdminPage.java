/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author saran
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
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

        jPanel1 = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        AdminPageText = new javax.swing.JLabel();
        travelerInfoBtn = new javax.swing.JButton();
        guideInfoBtn = new javax.swing.JButton();
        tourInfoBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        AdminPageImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 20, 20));

        AdminPageText.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        AdminPageText.setForeground(new java.awt.Color(13, 63, 51));
        AdminPageText.setText("Admin");
        jPanel1.add(AdminPageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        travelerInfoBtn.setBackground(new java.awt.Color(13, 63, 51));
        travelerInfoBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        travelerInfoBtn.setForeground(new java.awt.Color(234, 223, 186));
        travelerInfoBtn.setText("Traveler Info");
        travelerInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelerInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(travelerInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        guideInfoBtn.setBackground(new java.awt.Color(13, 63, 51));
        guideInfoBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        guideInfoBtn.setForeground(new java.awt.Color(234, 223, 186));
        guideInfoBtn.setText("Guide Info");
        guideInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(guideInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 140, -1));

        tourInfoBtn.setBackground(new java.awt.Color(13, 63, 51));
        tourInfoBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        tourInfoBtn.setForeground(new java.awt.Color(234, 223, 186));
        tourInfoBtn.setText("Tour Info");
        tourInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(tourInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 140, -1));

        logOutBtn.setBackground(new java.awt.Color(13, 63, 51));
        logOutBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(234, 223, 186));
        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 130, 40));

        AdminPageImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminPage.png"))); // NOI18N
        jPanel1.add(AdminPageImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        LoginPage view = new LoginPage();
        view.setVisible(true);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void travelerInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelerInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        TravelerInformation view = new TravelerInformation();
        view.setVisible(true);
    }//GEN-LAST:event_travelerInfoBtnActionPerformed

    private void guideInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GuideInformation view = new GuideInformation();
        view.setVisible(true);
    }//GEN-LAST:event_guideInfoBtnActionPerformed

    private void tourInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        TourInformation view = new TourInformation();
        view.setVisible(true);
    }//GEN-LAST:event_tourInfoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminPageImg;
    private javax.swing.JLabel AdminPageText;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton guideInfoBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JButton tourInfoBtn;
    private javax.swing.JButton travelerInfoBtn;
    // End of variables declaration//GEN-END:variables
}