/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primaryschoolmanagement.mypackage;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class ResultSearch extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public ResultSearch() {
      
        initComponents(); 
        clearTxt();
        connect();
        
    }
    
    Connection con ;
    PreparedStatement login , pst , add ;
    String id;
    String name , father , mother , term , year;
    Double bangla , english , math , science , religion , social , total , average ;
    Double banglaGrade , englishGrade , mathGrade , scienceGrade , religionGrade , socialGrade, totalGrade , averageGrade;
        
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PrimarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        stdIDTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        printBtn = new javax.swing.JButton();
        termBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        ClearBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultSheet = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 197, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(java.awt.Color.black);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 210, -1));

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
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 100, 40));

        SearchBtn.setBackground(new java.awt.Color(70, 72, 235));
        SearchBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(254, 254, 254));
        SearchBtn.setText("Search");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchBtnMouseEntered(evt);
            }
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 40));

        stdIDTxt.setBackground(new java.awt.Color(254, 254, 254));
        stdIDTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        stdIDTxt.setForeground(new java.awt.Color(70, 72, 235));
        stdIDTxt.setBorder(null);
        stdIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stdIDTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stdIDTxtFocusLost(evt);
            }
        });
        stdIDTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stdIDTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdIDTxtMouseClicked(evt);
            }
        });
        stdIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdIDTxtActionPerformed(evt);
            }
        });
        jPanel2.add(stdIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 40));

        jSeparator6.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, 10));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 246, 246));
        jLabel10.setText("Student ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 246, 246));
        jLabel11.setText("Year");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(251, 246, 246));
        jLabel12.setText("Term");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 40));

        printBtn.setBackground(new java.awt.Color(70, 72, 235));
        printBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        printBtn.setForeground(new java.awt.Color(254, 254, 254));
        printBtn.setText("Download");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printBtnMouseEntered(evt);
            }
        });
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel2.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 100, 40));

        termBox.setBackground(new java.awt.Color(254, 254, 254));
        termBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mid-Term", "Final" }));
        termBox.setSelectedIndex(-1);
        jPanel2.add(termBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, -1));

        yearBox.setBackground(new java.awt.Color(254, 254, 254));
        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024" }));
        yearBox.setSelectedIndex(-1);
        jPanel2.add(yearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, -1));

        ClearBtn.setBackground(new java.awt.Color(70, 72, 235));
        ClearBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(254, 254, 254));
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearBtnMouseEntered(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 360, 400));

        jPanel1.setBackground(new java.awt.Color(62, 199, 206));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Z003", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("MRSS Primary School");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 410, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 247, 247));
        jLabel3.setText("Education is for everyone");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("/home/rakibul/Pictures/newLogo_50.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 90));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 246, 246));
        jLabel9.setText("Since 2021");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        jPanel3.setBackground(new java.awt.Color(19, 173, 201));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 780, 10));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 246, 246));
        jLabel8.setText("Since 2021");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultSheet.setEditable(false);
        resultSheet.setBackground(new java.awt.Color(254, 254, 254));
        resultSheet.setColumns(20);
        resultSheet.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        resultSheet.setForeground(new java.awt.Color(70, 72, 235));
        resultSheet.setRows(5);
        resultSheet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane2.setViewportView(resultSheet);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 330));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 440, 420));

        setSize(new java.awt.Dimension(779, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   public double getGrade(double num){
       
       if(num>=80.0)
           return 5.00;
       
       else if(num>70 && num<80)
           return 4.00;
       else if(num>50 && num<=70)
           return  3.50;
       else if(num>33 && num<=50)
           return 3.00;
       else
        return 0;
       
       
   }

    private void printBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseEntered
        // TODO add your handling code here:
        printBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_printBtnMouseEntered

    private void printBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseExited
        // TODO add your handling code here:
         printBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_printBtnMouseExited

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(stdIDTxt.getText()+"_Result.pdf"));
            } catch (DocumentException ex) {
                Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            
            document.add(new Paragraph(resultSheet.getText()));
            
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Download Successfull");

      
    }//GEN-LAST:event_printBtnActionPerformed

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
        new MainUserInterface().setVisible(true);
        this.setVisible(false);
        clearTxt();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void SearchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseExited
        // TODO add your handling code here:
        SearchBtn.setBackground(Color.decode("#4648eb"));
 
    }//GEN-LAST:event_SearchBtnMouseExited

    private void SearchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseEntered
        // TODO add your handling code here:
        SearchBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_SearchBtnMouseEntered

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
    
        
        year = yearBox.getSelectedItem().toString();
        term = termBox.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("select * from StudentList where id=?");
            pst.setString(1, stdIDTxt.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                name = rs.getString("name");
                father = rs.getString("father");
                mother = rs.getString("mother");
                
                try {
                     add = con.prepareStatement("SELECT * FROM Result WHERE id=? AND year =? AND term =? ");
                     add.setString(1, stdIDTxt.getText());
                     add.setString(2, year);
                     add.setString(3, term);
                     ResultSet rst = add.executeQuery();
                     if(rst.next()){
                         bangla = rst.getDouble("bangla");
                         english = rst.getDouble("english");
                         math = rst.getDouble("math");
                         science = rst.getDouble("science");
                         religion = rst.getDouble("religion");
                         social = rst.getDouble("social");
                         
                         banglaGrade = getGrade(bangla);
                         englishGrade = getGrade(english);
                         mathGrade = getGrade(math);
                         scienceGrade = getGrade(science);
                         religionGrade = getGrade(religion);
                         socialGrade = getGrade(social);
                         
                         total = (bangla+english+math+science+religion+social);
                         average = total/(6.0) ; 
                         totalGrade = (banglaGrade+englishGrade+mathGrade+scienceGrade+religionGrade+socialGrade);
                         if(banglaGrade<3.00 ||englishGrade<3.00 ||mathGrade<3.00 ||scienceGrade<3.00 ||religionGrade<3.00 ||socialGrade<3.00)
                         { averageGrade = 0.0;}
                         else
                         {  averageGrade = totalGrade/(6.0);}
                         
                         resultSheet.append(
                         "\t   MRSS Primary School\n"+
                         "\tEducation is for Everyone\n"+
                         "\t      Since 2021\n"+
                         "\n"+
                         "\n"+
                          "Student ID :   "+stdIDTxt.getText()+"\nName :   "+name+"\n"+
                          "Father's Name :   "+father+"\nMother's Name :   "+mother+"\n"+
                          "Term :   "+term+"\n\n"+
                          
                          "Bangla                :   "+bangla+"     Grade : "+banglaGrade+"\n\n"+
                          "English               :   "+english+"     Grade : "+englishGrade+"\n\n"+
                          "Math                   :   "+math+"     Grade : "+mathGrade+"\n\n"+
                          "Science              :   "+science+"     Grade : "+scienceGrade+"\n\n"+
                          "Religion              :   "+religion+"     Grade : "+religionGrade+"\n\n"+
                          "Social Science   :   "+social+"     Grade : "+socialGrade+"\n\n\n\n"+
                         
                          "Total Marks :  "+total+"\n"+
                          "Average Marks :  "+average+"\n"+
                          "Total Grade :  "+totalGrade+"\n"+
                          "Result :  "+averageGrade+"\n\n");
                         
                         
                     }else{
                         JOptionPane.showMessageDialog(this, "Result Not Found");
                     }
                } catch (SQLException ex) {
                Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Result Didn't Publish");
                 }   
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Student ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResultSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void stdIDTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stdIDTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIDTxtFocusGained

    private void stdIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stdIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIDTxtFocusLost

    private void stdIDTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdIDTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIDTxtMousePressed

    private void stdIDTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdIDTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIDTxtMouseClicked

    private void stdIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIDTxtActionPerformed

    private void ClearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseExited
        // TODO add your handling code here:
        ClearBtn.setBackground(Color.decode("#4648eb"));
 
    }//GEN-LAST:event_ClearBtnMouseExited

    private void ClearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseEntered
        // TODO add your handling code here:
        ClearBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_ClearBtnMouseEntered

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        clearTxt();
    }//GEN-LAST:event_ClearBtnActionPerformed
 
    
    
    
    public void clearTxt(){
        
        
        yearBox.setSelectedIndex(-1);
        termBox.setSelectedIndex(-1);

        stdIDTxt.setText("");
        resultSheet.setText("");
       
        //IDLoad();
          
          
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
            java.util.logging.Logger.getLogger(ResultSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextArea resultSheet;
    private javax.swing.JTextField stdIDTxt;
    private javax.swing.JComboBox<String> termBox;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
