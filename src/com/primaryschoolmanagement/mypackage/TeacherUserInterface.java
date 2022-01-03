/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primaryschoolmanagement.mypackage;



import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class TeacherUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public TeacherUserInterface() {
      
        initComponents(); 
        connect();
      //  tableLoad();
        
    }
    
    Connection con ;
    PreparedStatement login , pst;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PrimarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   /* public void tableLoad() {
        
        try {
            pst = con.prepareStatement("select * from TeacherList");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) TeacherTable.getModel();
            df.setRowCount(0);
            while (rs.next()) {   
                
                String id = String.valueOf(rs.getInt("id"));
                String nameString = rs.getString("name");
                String emailString = rs.getString("email");
                String phoneString = rs.getString("phone");
                String positionString = rs.getString("position");
                 
                String tbData[] = {id,nameString,emailString,phoneString,positionString};
                df.addRow(tbData);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SyllabusInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JButton();
        InboxBtn = new javax.swing.JButton();
        ResetPassBtn = new javax.swing.JButton();
        guardianBtn = new javax.swing.JButton();
        sendBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 72, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/rakibul/Pictures/newLogo.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 380));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutBtn.setBackground(new java.awt.Color(70, 72, 235));
        LogoutBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(254, 254, 254));
        LogoutBtn.setText("Logout");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
        });
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, 40));

        InboxBtn.setBackground(new java.awt.Color(70, 72, 235));
        InboxBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        InboxBtn.setForeground(new java.awt.Color(254, 254, 254));
        InboxBtn.setText("Inbox");
        InboxBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InboxBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InboxBtnMouseEntered(evt);
            }
        });
        InboxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InboxBtnActionPerformed(evt);
            }
        });
        jPanel2.add(InboxBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, 40));

        ResetPassBtn.setBackground(new java.awt.Color(70, 72, 235));
        ResetPassBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ResetPassBtn.setForeground(new java.awt.Color(254, 254, 254));
        ResetPassBtn.setText("Reset Password");
        ResetPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetPassBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetPassBtnMouseEntered(evt);
            }
        });
        ResetPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPassBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ResetPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, 40));

        guardianBtn.setBackground(new java.awt.Color(70, 72, 235));
        guardianBtn.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        guardianBtn.setForeground(new java.awt.Color(254, 254, 254));
        guardianBtn.setText("Guardians");
        guardianBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardianBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardianBtnMouseEntered(evt);
            }
        });
        guardianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardianBtnActionPerformed(evt);
            }
        });
        jPanel2.add(guardianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, 40));

        sendBtn.setBackground(new java.awt.Color(70, 72, 235));
        sendBtn.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(254, 254, 254));
        sendBtn.setText("Send Message");
        sendBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendBtnMouseEntered(evt);
            }
        });
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel2.add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 380, 390));

        setSize(new java.awt.Dimension(704, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        // TODO add your handling code here:
        LogoutBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_LogoutBtnMouseExited

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        // TODO add your handling code here:
        LogoutBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        new TeacherLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void InboxBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InboxBtnMouseExited
        // TODO add your handling code here:
        InboxBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_InboxBtnMouseExited

    private void InboxBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InboxBtnMouseEntered
        // TODO add your handling code here:
        InboxBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_InboxBtnMouseEntered

    private void InboxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InboxBtnActionPerformed
        // TODO add your handling code here:
        new TeacherInbox().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InboxBtnActionPerformed

    private void ResetPassBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetPassBtnMouseExited
        // TODO add your handling code here:
          ResetPassBtn.setBackground(Color.decode("#4648eb"));
          
          
         
    }//GEN-LAST:event_ResetPassBtnMouseExited

    private void ResetPassBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetPassBtnMouseEntered
        // TODO add your handling code here:
          ResetPassBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_ResetPassBtnMouseEntered

    private void ResetPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPassBtnActionPerformed
        // TODO add your handling code here:
        new TeacherResetPassword().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ResetPassBtnActionPerformed

    private void sendBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendBtnMouseExited
        // TODO add your handling code here:
        sendBtn.setBackground(Color.decode("#4648eb"));
        
           
    }//GEN-LAST:event_sendBtnMouseExited

    private void sendBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendBtnMouseEntered
        // TODO add your handling code here:
        sendBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_sendBtnMouseEntered

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        new TeacherSendMessage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sendBtnActionPerformed

    private void guardianBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardianBtnMouseExited
        // TODO add your handling code here:
         guardianBtn.setBackground(Color.decode("#4648eb"));
      
    }//GEN-LAST:event_guardianBtnMouseExited

    private void guardianBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardianBtnMouseEntered
        // TODO add your handling code here:
         guardianBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_guardianBtnMouseEntered

    private void guardianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardianBtnActionPerformed
        // TODO add your handling code here:
        new GuardianList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_guardianBtnActionPerformed
 
    
    
    

    

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
            java.util.logging.Logger.getLogger(TeacherUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InboxBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ResetPassBtn;
    private javax.swing.JButton guardianBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}