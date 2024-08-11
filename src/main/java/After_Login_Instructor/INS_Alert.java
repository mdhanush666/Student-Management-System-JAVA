
package After_Login_Instructor;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dhanush
 */



public class INS_Alert extends javax.swing.JFrame {

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
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

// element for get registered INS and STU..
    
    ArrayList <String> getINS = new ArrayList<>();
    ArrayList <String> getSTU = new ArrayList<>();
        
// Constructor...    
    public INS_Alert() {
        initComponents();
        dbConnect();
        
        // Connect to DB and Get INS ID and STU MIS...        
        try {
            qry = "SELECT ID FROM instructor_registration ORDER BY(ID)ASC";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getINS.add(rs.getString(1));
            }
            
            qry = "SELECT MIS_No FROM student_registration ORDER BY(MIS_No)ASC";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getSTU.add(rs.getString(1));
            }
        }         
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

// set theme...        
        if(Home.getTheme.equalsIgnoreCase("default")){            
            bgPanel.setBackground(new Color(100,100,0));
            txtPane.setBackground(new Color(120,120,0));
            overPanel.setBackground(new Color(160,160,0));
            
            btnSend.setBackground(new Color(150,150,0));
            btnSetAlert.setBackground(new Color(200,200,0));
            btnShowAlert.setBackground(new Color(200,200,0));            
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){
            bgPanel.setBackground(new Color(0,0,0));
            txtPane.setBackground(new Color(51,51,51));
            overPanel.setBackground(new Color(30,30,30));
            
            btnSend.setBackground(new Color(51,51,51));
            btnSetAlert.setBackground(new Color(80,80,80));
            btnShowAlert.setBackground(new Color(80,80,80));           
        }
        else if(Home.getTheme.equalsIgnoreCase("red")){
            bgPanel.setBackground(new Color(40,0,0));
            txtPane.setBackground(new Color(80,0,0));
            overPanel.setBackground(new Color(120,0,0));
            
            btnSend.setBackground(new Color(80,0,0));
            btnSetAlert.setBackground(new Color(180,180,0));
            btnShowAlert.setBackground(new Color(180,180,0));            
        }
        
        btnSend.setEnabled(false);        
        txtPane.setEditable(false);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overPanel = new javax.swing.JPanel();
        btnSetAlert = new javax.swing.JButton();
        btnShowAlert = new javax.swing.JButton();
        bgPanel = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        lblPlaceHolder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overPanel.setBackground(new java.awt.Color(160, 160, 0));
        overPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSetAlert.setBackground(new java.awt.Color(200, 200, 0));
        btnSetAlert.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSetAlert.setForeground(new java.awt.Color(255, 255, 255));
        btnSetAlert.setText("Set Alert");
        btnSetAlert.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 10, 50));
        btnSetAlert.setFocusable(false);
        btnSetAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetAlertActionPerformed(evt);
            }
        });
        overPanel.add(btnSetAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        btnShowAlert.setBackground(new java.awt.Color(200, 200, 0));
        btnShowAlert.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnShowAlert.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAlert.setText("Show Alert");
        btnShowAlert.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 10, 50));
        btnShowAlert.setFocusable(false);
        btnShowAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAlertActionPerformed(evt);
            }
        });
        overPanel.add(btnShowAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(overPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 500, 100));

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

        lblPlaceHolder.setFont(new java.awt.Font("Calibri Light", 2, 18)); // NOI18N
        lblPlaceHolder.setForeground(new java.awt.Color(204, 204, 204));
        lblPlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaceHolder.setText("Write your alert message here..");
        bgPanel.add(lblPlaceHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 310, 100));

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

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 310));

        btnSend.setBackground(new java.awt.Color(150, 150, 0));
        btnSend.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.setBorder(null);
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        bgPanel.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 100, 40));

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

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:      
        if(txtPane.getText().isEmpty()){            
            JOptionPane.showMessageDialog(null, "Please enter the alert message to send!","Alert Information",JOptionPane.ERROR_MESSAGE);
        }
        else{
// Msg for STU            
            try {
                qry = "INSERT INTO instructor_alert(MsgFrom,MsgTo,Msg,Status) VALUES(?,?,?,?)";
                pt = con.prepareStatement(qry);

// Students....                    
                for(int i = 0; i < getSTU.size(); i++){
                    pt.setString(1, Home.getOpenedUserName);
                    pt.setString(2, getSTU.get(i));
                    pt.setString(3, txtPane.getText());
                    pt.setString(4, "unseen");
                    pt.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "Alert Set Success","Alert Information",JOptionPane.INFORMATION_MESSAGE);                    
                dispose();
                new Home();
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database Error","Alert Information",JOptionPane.ERROR_MESSAGE);                    
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaneMouseEntered
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtPaneMouseEntered

    private void btnShowAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAlertActionPerformed
        // TODO add your handling code here:
        overPanel.setVisible(false);
        btnSend.setVisible(false);
        txtPane.setEditable(false);
        
        try {
            qry = "SELECT Msg,time FROM admin_alert WHERE MsgTo = '" + Home.getID + "'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                txtPane.setText(rs.getString(1)+ "\n" + rs.getString(2) + "\n\n");
            }
            
            qry = "UPDATE admin_alert SET Status = 'seen' WHERE MsgTo = '" + Home.getID + "'";
            pt = con.prepareStatement(qry);
            pt.executeUpdate();
        } 
        catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_btnShowAlertActionPerformed

    private void btnSetAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetAlertActionPerformed
        // TODO add your handling code here:
        
        txtPane.setEditable(true);
        overPanel.setVisible(false);
        btnSend.setEnabled(true);
        
    }//GEN-LAST:event_btnSetAlertActionPerformed

    public static void main(String args[]) {
       new INS_Alert();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSetAlert;
    private javax.swing.JButton btnShowAlert;
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaceHolder;
    private javax.swing.JPanel overPanel;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables
}
