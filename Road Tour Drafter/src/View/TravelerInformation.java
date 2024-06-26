/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DeleteController;
import Controller.SearchController;
import Controller.UpdateController;

/**
 *
 * @author saran
 */
public class TravelerInformation extends javax.swing.JFrame {

    /**
     * Creates new form TravelerInfomation
     */
    public TravelerInformation() {
        initComponents(); 
        new UpdateController().updateTravelerTable(travelerTable);
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
        TravelerInfoText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        travelerTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        minimizeBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        travelerInfoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TravelerInfoText.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        TravelerInfoText.setForeground(new java.awt.Color(13, 63, 51));
        TravelerInfoText.setText("Traveler Information");
        jPanel1.add(TravelerInfoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        travelerTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(13, 63, 51)));
        travelerTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        travelerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NIC", "Name", "Password", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(travelerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 570, 370));

        addBtn.setBackground(new java.awt.Color(13, 63, 51));
        addBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(234, 223, 186));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 100, -1));

        editBtn.setBackground(new java.awt.Color(13, 63, 51));
        editBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(234, 223, 186));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, -1));

        deleteBtn.setBackground(new java.awt.Color(13, 63, 51));
        deleteBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(234, 223, 186));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 100, -1));

        backBtn.setBackground(new java.awt.Color(13, 63, 51));
        backBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(234, 223, 186));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 100, -1));

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 180, 30));

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

        travelerInfoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackground.png"))); // NOI18N
        jPanel1.add(travelerInfoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        EditTraveler view = new EditTraveler();
        view.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        new DeleteController().deleteTraveler(travelerTable);
        new UpdateController().updateTravelerTable(travelerTable);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminPage view = new AdminPage();
        view.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        // TODO add your handling code here:
        new SearchController().searchTraveler(travelerTable, searchBar.getText());
    }//GEN-LAST:event_searchBarKeyReleased

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddTraveler view = new AddTraveler();
        view.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(TravelerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelerInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TravelerInfoText;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel travelerInfoImg;
    private javax.swing.JTable travelerTable;
    // End of variables declaration//GEN-END:variables
}
