
package User;

import static User.UserRegister.txtMisNo;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhanush
 */

import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.sql.*;
import javax.swing.JOptionPane;


public class CreateLogin extends javax.swing.JFrame {
    
    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    ImageIcon monkey1 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\monkey1.png");
    ImageIcon monkey2 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\monkey2.png");

    String profileIcon = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png";
    
    int password_c1 = 0,password_c2 = 0;
    String getDB_UsersCount[];
    
    Connection con = null;
    Statement stm = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    String qry = null;
    
// Database Connection..    
    void dbConnect(){
        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            System.out.println("Db Connect Sucess");        
        }
        catch(Exception e){
            System.out.println(e);
        }        
    }

// Constructor..    
    public CreateLogin() {
        initComponents();
        
        txtUsername.setFocusable(true);
        btnSubmit.setBackground(new Color(51,204,255));

        dbConnect();
        
        try{
            qry = "SELECT COUNT(userName) FROM student_login_details";
            
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getDB_UsersCount = new String[rs.getInt(1)]; // getting users count and storing to array

            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
// Assign stored usernames in array

        try{
            qry = "SELECT userName FROM student_login_details";
            
            rs = stm.executeQuery(qry);
            int i = 0;
            while(rs.next()){
                getDB_UsersCount[i] = rs.getString(1);
                i++;
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
  
        //PanelContainer.setBackground(new Color(0,0,0,20));
                        
        setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        lblMonkey = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btn_Pvisible1 = new javax.swing.JButton();
        btn_Pvisible = new javax.swing.JButton();
        txtPasswordC = new javax.swing.JPasswordField();
        txtPasswordN = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setBackground(new java.awt.Color(110, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(102, 102, 102));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setContentAreaFilled(false);
        btn_close.setFocusable(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 50));

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign Up");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 460, 80));

        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\circleBG1.png")); // NOI18N
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 460, 160));

        lblMonkey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonkey.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\monkey1.png")); // NOI18N
        jPanel1.add(lblMonkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 460, 130));

        btnSubmit.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.setFocusable(false);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSubmitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSubmitMouseReleased(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 90, 40));

        btn_Pvisible1.setBackground(new java.awt.Color(51, 51, 51));
        btn_Pvisible1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png")); // NOI18N
        btn_Pvisible1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_Pvisible1.setContentAreaFilled(false);
        btn_Pvisible1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Pvisible1.setFocusable(false);
        btn_Pvisible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Pvisible1MouseClicked(evt);
            }
        });
        btn_Pvisible1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pvisible1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Pvisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 422, -1, -1));

        btn_Pvisible.setBackground(new java.awt.Color(51, 51, 51));
        btn_Pvisible.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png")); // NOI18N
        btn_Pvisible.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_Pvisible.setContentAreaFilled(false);
        btn_Pvisible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Pvisible.setFocusable(false);
        btn_Pvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PvisibleMouseClicked(evt);
            }
        });
        btn_Pvisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PvisibleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Pvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 385, -1, -1));

        txtPasswordC.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordC.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPasswordC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordCMouseClicked(evt);
            }
        });
        txtPasswordC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordCActionPerformed(evt);
            }
        });
        txtPasswordC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordCKeyTyped(evt);
            }
        });
        jPanel1.add(txtPasswordC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 235, 30));

        txtPasswordN.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordN.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPasswordN.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtPasswordNComponentAdded(evt);
            }
        });
        txtPasswordN.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPasswordNInputMethodTextChanged(evt);
            }
        });
        txtPasswordN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordNActionPerformed(evt);
            }
        });
        txtPasswordN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordNKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordNKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordNKeyTyped(evt);
            }
        });
        jPanel1.add(txtPasswordN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 235, 30));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 235, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("New Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\gradient_bg1.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
        new LoginUser();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
        txtUsername.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        lblMonkey.setIcon(monkey1);
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        lblMonkey.setIcon(monkey1);
        password_c1 = 0;
        password_c2 = 0;

        if(txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username field must be filled","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtPasswordN.getText().isEmpty() || txtPasswordC.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password field must be filled","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{

            if(txtPasswordN.getText().length() > 8){

                if(txtPasswordN.getText().equals(txtPasswordC.getText())){

                    txtPasswordN.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                    txtPasswordC.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));

                    // Registration details
                    try{
                        qry = "INSERT INTO student_registration"
                        + "(MIS_No,Full_Name,DOB,Gender,Email,Address,Phone_No) VALUES"
                        + "(?,?,?,?,?,?,?)";

                        pt = con.prepareStatement(qry);

                        pt.setString(1, UserRegister.txtMisNo.getText());
                        pt.setString(2, UserRegister.Panel1TempName);

                        String tempDate = String.valueOf(UserRegister.cmbYYYY.getSelectedItem()+ "-"
                            + UserRegister.cmbMM.getSelectedItem()
                            + "-" + UserRegister.cmbDD.getSelectedItem());

                        pt.setString(3, tempDate);

                        if(UserRegister.rdbM.isSelected()){
                            pt.setString(4, "M");
                        }
                        else{
                            pt.setString(4, "F");
                        }

                        pt.setString(5, UserRegister.txtEmail.getText());
                        pt.setString(6, UserRegister.Panel1TempAddress);
                        pt.setString(7, UserRegister.txtContactNo.getText());

                        pt.executeUpdate();

                        System.out.println("Data Insert Success");

                    }

                    catch(Exception e){
                        System.out.println(e);
                    }

                    // Login details
                    try{
                        qry = "INSERT INTO student_login_details(userName,password,ProIMG,Theme,MIS_No)VALUES"
                        + "(?,?,?,?,?)";

                        pt = con.prepareStatement(qry);

                        pt.setString(1, txtUsername.getText());
                        pt.setString(2, txtPasswordN.getText());
                        pt.setString(3, profileIcon);
                        pt.setString(4, "DEFAULT");
                        
                        pt.setString(5, UserRegister.txtMisNo.getText());

                        pt.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Registration Complete Success","Registration",JOptionPane.INFORMATION_MESSAGE);

                        dispose();
                        new LoginUser();

                    }
                    catch(Exception e){
                        System.out.println(e);
                    }

                }
                else{
                    JOptionPane.showMessageDialog(null, "Password doesn't match!","Information",JOptionPane.ERROR_MESSAGE);
                    txtPasswordN.setBorder(new MatteBorder(0,0,2,0,Color.red));
                    txtPasswordC.setBorder(new MatteBorder(0,0,2,0,Color.red));
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Password must be greater than 8 characters!","Information",JOptionPane.ERROR_MESSAGE);
                txtPasswordN.setBorder(new MatteBorder(0,0,2,0,Color.red));
            }

            for(int i=0; i < getDB_UsersCount.length; i++){

                if(getDB_UsersCount[i].equalsIgnoreCase(txtUsername.getText())){

                    JOptionPane.showMessageDialog(null, "Username already exits!","INFORMATION",JOptionPane.ERROR_MESSAGE);
                    txtUsername.setBorder(new MatteBorder(2,2,2,2,Color.red));
                    txtUsername.setText(null);
                    break;
                }
            }

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseReleased
        // TODO add your handling code here:
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setBorder(null);
    }//GEN-LAST:event_btnSubmitMouseReleased

    private void btnSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMousePressed
        // TODO add your handling code here:
        btnSubmit.setForeground(Color.BLACK);
        btnSubmit.setBorder(null);
    }//GEN-LAST:event_btnSubmitMousePressed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void txtPasswordCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordCKeyTyped
        // TODO add your handling code here:
        txtPasswordC.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_txtPasswordCKeyTyped

    private void txtPasswordCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordCActionPerformed

    private void txtPasswordCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordCMouseClicked
        // TODO add your handling code here:
        lblMonkey.setIcon(monkey2);
    }//GEN-LAST:event_txtPasswordCMouseClicked

    private void btn_Pvisible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pvisible1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Pvisible1ActionPerformed

    private void btn_Pvisible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Pvisible1MouseClicked
        // TODO add your handling code here:
        password_c2+=1;

        if(password_c2 % 2 == 0){
            btn_Pvisible1.setIcon(pHide);
            txtPasswordC.setEchoChar('*');
        }
        else{
            btn_Pvisible1.setIcon(pShow);
            txtPasswordC.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_Pvisible1MouseClicked

    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed
        password_c1+=1;

        if(password_c1 % 2 == 0){
            btn_Pvisible.setIcon(pHide);
            txtPasswordN.setEchoChar('*');
        }
        else{
            btn_Pvisible.setIcon(pShow);
            txtPasswordN.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void txtPasswordNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordNKeyTyped
        // TODO add your handling code here:
        lblMonkey.setIcon(monkey2);
        txtPasswordN.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_txtPasswordNKeyTyped

    private void txtPasswordNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordNKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordNKeyReleased

    private void txtPasswordNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordNKeyPressed

    private void txtPasswordNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordNActionPerformed

    private void txtPasswordNInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPasswordNInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordNInputMethodTextChanged

    private void txtPasswordNComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtPasswordNComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordNComponentAdded

    public static void main(String args[]) {
        new CreateLogin();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Pvisible1;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMonkey;
    private javax.swing.JPasswordField txtPasswordC;
    private javax.swing.JPasswordField txtPasswordN;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
