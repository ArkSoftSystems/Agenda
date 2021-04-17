/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda;

import com.ort.agenda.utils.FontUtils;
import com.ort.agenda.utils.ImageUtils;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author matiasc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        jPanel6.add(ImageUtils.getImageFile("home-6.png"));

        jLabel1.setFont(FontUtils.getCustomFont("Roboto-Thin", 48f));
        jLabel2.setFont(FontUtils.getCustomFont("Roboto-Thin", 18f));
        jLabel3.setFont(FontUtils.getCustomFont("Roboto-Regular", 28f));

        jLabel4.setFont(FontUtils.getCustomFont("Roboto-Regular", 12f));
        jLabel5.setFont(FontUtils.getCustomFont("Roboto-Regular", 12f));

        jButtonLogIn.setBackground(new Color(29, 29, 29));
        jButtonLogIn.setUI(new BasicButtonUI());
        jButtonLogIn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jButtonLogIn.setBackground(new Color(255, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonLogIn.setBackground(new Color(29, 29, 29));
            }
        });

        JButton[] buttons = {
            jButtonLogout, jButtonCreate, jButtonSearchContact, jButtonHome
        };
        for (JButton jbtn : buttons) {
            jbtn.setBackground(new Color(29, 29, 29));
            jbtn.setUI(new BasicButtonUI());
            jbtn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    jbtn.setBackground(new Color(20, 20, 20));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    jbtn.setBackground(new Color(29, 29, 29));
                }
            });
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

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonSearchContact = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(20, 20, 20));
        pnlSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 160));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_20px.png"))); // NOI18N
        jButtonHome.setAlignmentX(2.0F);
        jButtonHome.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new java.awt.GridBagConstraints());

        pnlSide.add(jPanel1);

        jButtonCreate.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCreate.setForeground(new java.awt.Color(20, 20, 20));
        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contact_20px.png"))); // NOI18N
        jButtonCreate.setAlignmentX(2.0F);
        jButtonCreate.setPreferredSize(new java.awt.Dimension(60, 60));
        pnlSide.add(jButtonCreate);

        jButtonSearchContact.setBackground(new java.awt.Color(29, 29, 29));
        jButtonSearchContact.setForeground(new java.awt.Color(20, 20, 20));
        jButtonSearchContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_user_male_20px.png"))); // NOI18N
        jButtonSearchContact.setPreferredSize(new java.awt.Dimension(60, 60));
        pnlSide.add(jButtonSearchContact);

        jPanel3.setBackground(new java.awt.Color(20, 20, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(80, 200));
        jPanel3.setLayout(new java.awt.FlowLayout(1, 5, 25));
        pnlSide.add(jPanel3);

        jButtonLogout.setBackground(new java.awt.Color(29, 29, 29));
        jButtonLogout.setForeground(new java.awt.Color(20, 20, 20));
        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_rounded_up_20px.png"))); // NOI18N
        jButtonLogout.setPreferredSize(new java.awt.Dimension(60, 60));
        pnlSide.add(jButtonLogout);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(29, 29, 29));
        pnlCenter.setPreferredSize(new java.awt.Dimension(0, 60));

        jPanel2.setBackground(new java.awt.Color(29, 29, 29));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Overview");
        jPanel2.add(jLabel1);

        jPanel5.setBackground(new java.awt.Color(29, 29, 29));
        jPanel5.setForeground(new java.awt.Color(29, 29, 29));
        jPanel5.setLayout(new java.awt.GridLayout());

        jPanel6.setBackground(new java.awt.Color(29, 29, 29));
        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(29, 29, 29));
        jPanel7.setForeground(new java.awt.Color(29, 29, 29));

        jPanel8.setBackground(new java.awt.Color(29, 29, 29));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setBackground(new java.awt.Color(29, 29, 29));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Sign in");
        jPanel8.add(jLabel3);

        jPanel9.setBackground(new java.awt.Color(29, 29, 29));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));

        jTextField2.setBackground(new java.awt.Color(29, 29, 29));
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setToolTipText("");
        jTextField2.setSelectionColor(new java.awt.Color(0, 51, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Username");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password");

        jPasswordField1.setBackground(new java.awt.Color(29, 29, 29));
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));

        jButtonLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login_50px_outline.png"))); // NOI18N
        jButtonLogIn.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("No account? ");

        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Create one!");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(238, 238, 238)
                        .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(29, 29, 29));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The most awesome phone book system");
        jPanel4.add(jLabel2);

        jPanel10.setBackground(new java.awt.Color(29, 29, 29));

        jLabel9.setBackground(new java.awt.Color(30, 30, 30));
        jLabel9.setForeground(new java.awt.Color(82, 82, 82));
        jLabel9.setText("Version 1.0.0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSearchContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
