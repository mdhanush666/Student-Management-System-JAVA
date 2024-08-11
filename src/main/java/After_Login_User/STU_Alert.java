
package After_Login_User;

import java.awt.Color;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dhanush
 */



public class STU_Alert extends javax.swing.JFrame {

// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    String qry = null;
    
// Db Connect for student_management_system..    
    public void dbConnect(){
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry = "SELECT MsgFrom,Msg,time FROM admin_alert WHERE MsgTo = '" + Home.getMis_No + "'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                txtPane.setText(txtPane.getText() + "\nFrom : " + rs.getString(1) + "\n" 
                + rs.getString(2)+ "\n" + rs.getString(3) + "\n\n");
            }
            
            qry = "SELECT MsgFrom,Msg,time FROM instructor_alert WHERE MsgTo = '" + Home.getMis_No + "'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                txtPane.setText(txtPane.getText() + "\nFrom : " + rs.getString(1) + "\n" 
                + rs.getString(2)+ "\n" + rs.getString(3) + "\n\n");
            }
            
            qry = "UPDATE instructor_alert SET Status = 'seen' WHERE MsgTo = '" + Home.getMis_No + "'";
            pt = con.prepareStatement(qry);
            pt.executeUpdate();
            
            qry = "UPDATE admin_alert SET Status = 'seen' WHERE MsgTo = '" + Home.getMis_No + "'";
            pt = con.prepareStatement(qry);
            pt.executeUpdate();
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
     
// Constructor...    
    public STU_Alert() {
        initComponents();
        dbConnect();

// set theme...        
        if(Home.getTheme.equalsIgnoreCase("default")){            
            bgPanel.setBackground(new Color(100,100,0));
            txtPane.setBackground(new Color(120,120,0));
            
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){
            bgPanel.setBackground(new Color(0,0,0));
            txtPane.setBackground(new Color(51,51,51));
          
        }
        else if(Home.getTheme.equalsIgnoreCase("red")){
            bgPanel.setBackground(new Color(40,0,0));
            txtPane.setBackground(new Color(80,0,0));            
        }
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setBackground(new java.awt.Color(100, 100, 0));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(110, 0, 0));
        btn_back.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\backIocn.png")); // NOI18N
        btn_back.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_back.setContentAreaFilled(false);
        btn_back.setFocusable(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        bgPanel.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jScrollPane1.setBackground(new java.awt.Color(102, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFocusable(false);

        txtPane.setEditable(false);
        txtPane.setBackground(new java.awt.Color(120, 120, 0));
        txtPane.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPane.setForeground(new java.awt.Color(255, 255, 255));
        txtPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPaneMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPaneMousePressed(evt);
            }
        });
        txtPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaneKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtPane);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 410));

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txtPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaneMousePressed
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtPaneMousePressed

    private void txtPaneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaneKeyTyped
        // TODO add your handling code here:                
    }//GEN-LAST:event_txtPaneKeyTyped

    private void txtPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaneMouseEntered
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtPaneMouseEntered

    public static void main(String args[]) {
       new STU_Alert();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables
}
