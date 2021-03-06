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
import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class GuardianSendMessage extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public GuardianSendMessage() {
      
        initComponents(); 
        connect();
      //  tableLoad();
        clearALL();
        
    }
    
    Connection con ;
    PreparedStatement login , pst;
    String title , date , notice;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PrimarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuardianSendMessage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuardianSendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void clearALL(){
        toTxt.setText("");
        messageTxt.setText("");
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
        SendBtn = new javax.swing.JButton();
        toTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTxt = new javax.swing.JTextArea();
        cancelBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        SendBtn.setBackground(new java.awt.Color(70, 72, 235));
        SendBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        SendBtn.setForeground(new java.awt.Color(254, 254, 254));
        SendBtn.setText("Send");
        SendBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SendBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SendBtnMouseEntered(evt);
            }
        });
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 80, -1));

        toTxt.setBackground(new java.awt.Color(254, 254, 254));
        toTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        toTxt.setForeground(new java.awt.Color(70, 72, 235));
        toTxt.setBorder(null);
        toTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                toTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                toTxtFocusLost(evt);
            }
        });
        toTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toTxtMouseClicked(evt);
            }
        });
        toTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTxtActionPerformed(evt);
            }
        });
        jPanel2.add(toTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, 30));

        messageTxt.setColumns(20);
        messageTxt.setForeground(new java.awt.Color(70, 72, 235));
        messageTxt.setRows(5);
        jScrollPane1.setViewportView(messageTxt);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 150));

        cancelBtn.setBackground(new java.awt.Color(70, 72, 235));
        cancelBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(254, 254, 254));
        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
        });
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 80, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, 10));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 72, 235));
        jLabel1.setText("Message :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 72, 235));
        jLabel2.setText("To : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 380, 390));

        setSize(new java.awt.Dimension(704, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SendBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendBtnMouseExited
        // TODO add your handling code here:
        SendBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_SendBtnMouseExited

    private void SendBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendBtnMouseEntered
        // TODO add your handling code here:
        SendBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_SendBtnMouseEntered

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed
        // TODO add your handling code here:
        date = LocalDate.now().toString();
        title = toTxt.getText();
        notice = messageTxt.getText();
        try {
            pst = con.prepareStatement("insert into ChatBox(mFrom,mTo,date,message)values(?,?,?,?)");
            pst.setString(1, GuardianLoginPage.getEmail());
            pst.setString(2, title);
            pst.setString(3, date);
            pst.setString(4, notice);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Message Sent");
                clearALL();
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Error!!!");
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(this,"");
            Logger.getLogger(GuardianSendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_SendBtnActionPerformed

    private void toTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toTxtFocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_toTxtFocusGained

    private void toTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTxtMousePressed
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_toTxtMousePressed

    private void toTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTxtMouseClicked
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_toTxtMouseClicked

    private void toTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTxtActionPerformed

    }//GEN-LAST:event_toTxtActionPerformed

    private void toTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toTxtFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_toTxtFocusLost

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        // TODO add your handling code here:
        cancelBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_cancelBtnMouseExited

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        // TODO add your handling code here:
         cancelBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
         new GuardianUserInterface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed
 
    
    
    

    

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
            java.util.logging.Logger.getLogger(GuardianSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardianSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardianSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardianSendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GuardianSendMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea messageTxt;
    private javax.swing.JTextField toTxt;
    // End of variables declaration//GEN-END:variables
}
