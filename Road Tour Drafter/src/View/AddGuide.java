/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InsertController;

/**
 *
 * @author saran
 */
public class AddGuide extends javax.swing.JFrame {

    public AddGuide() {
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
        GuideInfoText = new javax.swing.JLabel();
        nGuideIdTxt = new javax.swing.JLabel();
        nGuideNicTxt = new javax.swing.JLabel();
        nGuideNameTxt = new javax.swing.JLabel();
        nGuideContactTxt = new javax.swing.JLabel();
        nGuidePassTxt = new javax.swing.JLabel();
        nGuidePass = new javax.swing.JPasswordField();
        nGuideContact = new javax.swing.JTextField();
        nGuideName = new javax.swing.JTextField();
        nGuideNic = new javax.swing.JTextField();
        nGuideId = new javax.swing.JTextField();
        ResteBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        nVehicleNo = new javax.swing.JTextField();
        nVehicleNoTxt = new javax.swing.JLabel();
        nVehicleModelTxt = new javax.swing.JLabel();
        nVehicleModel = new javax.swing.JTextField();
        nPriceForDay = new javax.swing.JTextField();
        nPriceForDayTxt = new javax.swing.JLabel();
        AddGuideImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuideInfoText.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        GuideInfoText.setForeground(new java.awt.Color(13, 63, 51));
        GuideInfoText.setText("Add Guide");
        jPanel1.add(GuideInfoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        nGuideIdTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nGuideIdTxt.setText("Guide ID");
        jPanel1.add(nGuideIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        nGuideNicTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nGuideNicTxt.setText("National ID");
        jPanel1.add(nGuideNicTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        nGuideNameTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nGuideNameTxt.setText("Guide Name");
        jPanel1.add(nGuideNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        nGuideContactTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nGuideContactTxt.setText("Phone No.");
        jPanel1.add(nGuideContactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        nGuidePassTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nGuidePassTxt.setText("Password");
        jPanel1.add(nGuidePassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        nGuidePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(nGuidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 210, -1));

        nGuideContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(nGuideContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, -1));

        nGuideName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(nGuideName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, -1));

        nGuideNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(nGuideNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, -1));

        nGuideId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nGuideId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nGuideIdActionPerformed(evt);
            }
        });
        jPanel1.add(nGuideId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        ResteBtn.setBackground(new java.awt.Color(13, 63, 51));
        ResteBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        ResteBtn.setForeground(new java.awt.Color(234, 223, 186));
        ResteBtn.setText("Reset");
        ResteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ResteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 90, -1));

        createBtn.setBackground(new java.awt.Color(13, 63, 51));
        createBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(234, 223, 186));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        homeBtn.setBackground(new java.awt.Color(13, 63, 51));
        homeBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(234, 223, 186));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 90, -1));

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

        BackBtn.setBackground(new java.awt.Color(13, 63, 51));
        BackBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(234, 223, 186));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 90, -1));

        nVehicleNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVehicleNoActionPerformed(evt);
            }
        });
        jPanel1.add(nVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, -1));

        nVehicleNoTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nVehicleNoTxt.setText("Vehicle No.");
        jPanel1.add(nVehicleNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        nVehicleModelTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nVehicleModelTxt.setText("Vehicle Model");
        jPanel1.add(nVehicleModelTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        nVehicleModel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nVehicleModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVehicleModelActionPerformed(evt);
            }
        });
        jPanel1.add(nVehicleModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 210, -1));

        nPriceForDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nPriceForDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPriceForDayActionPerformed(evt);
            }
        });
        jPanel1.add(nPriceForDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 210, -1));

        nPriceForDayTxt.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        nPriceForDayTxt.setText("Price for Day");
        jPanel1.add(nPriceForDayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        AddGuideImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackground.png"))); // NOI18N
        jPanel1.add(AddGuideImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void ResteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResteBtnActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_ResteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        InsertController.AddGuide(nGuideId.getText(), nGuideNic.getText(), nGuideName.getText(), nGuideContact.getText(), nGuidePass.getText(), nVehicleNo.getText(), nVehicleModel.getText(), Integer.parseInt(nPriceForDay.getText()));
        setVisible(false);
    }//GEN-LAST:event_createBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomePage view = new HomePage();
        view.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void nGuideIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nGuideIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nGuideIdActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GuideInformation view = new GuideInformation();
        view.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void nVehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVehicleNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVehicleNoActionPerformed

    private void nVehicleModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVehicleModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVehicleModelActionPerformed

    private void nPriceForDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPriceForDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPriceForDayActionPerformed

    public void clearField(){
        nGuideId.setText("");
        nGuideNic.setText("");
        nGuideName.setText("");
        nGuideContact.setText("");
        nGuidePass.setText("");
        nVehicleNo.setText("");
        nVehicleModel.setText("");
        nPriceForDay.setText("");
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
            java.util.logging.Logger.getLogger(AddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGuide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddGuideImg;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel GuideInfoText;
    private javax.swing.JButton ResteBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JTextField nGuideContact;
    private javax.swing.JLabel nGuideContactTxt;
    private javax.swing.JTextField nGuideId;
    private javax.swing.JLabel nGuideIdTxt;
    private javax.swing.JTextField nGuideName;
    private javax.swing.JLabel nGuideNameTxt;
    private javax.swing.JTextField nGuideNic;
    private javax.swing.JLabel nGuideNicTxt;
    private javax.swing.JPasswordField nGuidePass;
    private javax.swing.JLabel nGuidePassTxt;
    private javax.swing.JTextField nPriceForDay;
    private javax.swing.JLabel nPriceForDayTxt;
    private javax.swing.JTextField nVehicleModel;
    private javax.swing.JLabel nVehicleModelTxt;
    private javax.swing.JTextField nVehicleNo;
    private javax.swing.JLabel nVehicleNoTxt;
    // End of variables declaration//GEN-END:variables
}
