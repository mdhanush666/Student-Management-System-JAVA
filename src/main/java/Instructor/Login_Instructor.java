
package Instructor;

import After_Login_Instructor.Home;
import Main_Forms.first;
import java.awt.Color;
import javax.swing.ImageIcon;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


/**
 *
 * @author Dhanush
 */
public class Login_Instructor extends javax.swing.JFrame {
    
    public static String getUser;
    
    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
    Border error_Border = new MatteBorder(0, 0, 2, 0, Color.RED);
    Border normal_Border = new MatteBorder(0, 0, 2, 0, Color.WHITE);

    

    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    void dbConnect(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            System.out.println("Db Connect Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    int password_c=0;
    int error_countU = 0,error_countP = 0;
    
    String getUserNames[],getPasswords[];  
    
    public Login_Instructor() {
        initComponents();
        
        dbConnect();

// getting the length of the array        
        try{
            qry = "SELECT COUNT(userName) FROM instructor_login_details";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getUserNames = new String[Integer.parseInt(rs.getString(1))];
                getPasswords = new String[Integer.parseInt(rs.getString(1))];
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
// assiging userNames and Passwords to the array
        
        try{
            qry = "SELECT userName,password FROM instructor_login_details";
            rs = stm.executeQuery(qry);
            
            int i = 0;            
            while(rs.next()){
                getUserNames[i] = rs.getString(1);
                getPasswords[i] = rs.getString(2);
                i++;
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }

        
        btn_forgot.setVisible(false);
        lbl_Lock_msgUserName.setText(null);
        lbl_Lock_msgPassword.setText(null);
        
        
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsernameIns = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Pvisible = new javax.swing.JButton();
        txtPasswordIns = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_forgot = new javax.swing.JButton();
        lbl_Lock_msgPassword = new javax.swing.JLabel();
        lbl_Lock_msgUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM");

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Instructor\\1.png")); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 410));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setBackground(new java.awt.Color(204, 204, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(51, 51, 51));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setFocusable(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 8, 50, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 87, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Instructor Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 89));

        txtUsernameIns.setBackground(new java.awt.Color(204, 204, 0));
        txtUsernameIns.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsernameIns.setForeground(new java.awt.Color(51, 51, 51));
        txtUsernameIns.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsernameIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameInsKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsernameIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 192, 31));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\username.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 87, -1));

        btn_Pvisible.setBackground(new java.awt.Color(204, 204, 0));
        btn_Pvisible.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png")); // NOI18N
        btn_Pvisible.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(btn_Pvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 235, -1, 29));

        txtPasswordIns.setBackground(new java.awt.Color(204, 204, 0));
        txtPasswordIns.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPasswordIns.setForeground(new java.awt.Color(51, 51, 51));
        txtPasswordIns.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPasswordIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordInsKeyTyped(evt);
            }
        });
        jPanel1.add(txtPasswordIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 235, 192, 29));

        btn_login.setBackground(new java.awt.Color(153, 153, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setFocusable(false);
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_loginMouseReleased(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 302, 120, 40));

        btn_forgot.setBackground(new java.awt.Color(204, 204, 0));
        btn_forgot.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_forgot.setForeground(new java.awt.Color(0, 153, 255));
        btn_forgot.setText("Forgot Username / Password");
        btn_forgot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 0, 153)));
        btn_forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_forgot.setFocusable(false);
        btn_forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgotActionPerformed(evt);
            }
        });
        jPanel1.add(btn_forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 352, 215, 30));

        lbl_Lock_msgPassword.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_Lock_msgPassword.setForeground(new java.awt.Color(204, 0, 0));
        lbl_Lock_msgPassword.setText("Error msg");
        jPanel1.add(lbl_Lock_msgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 265, 190, 30));

        lbl_Lock_msgUserName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_Lock_msgUserName.setForeground(new java.awt.Color(204, 0, 0));
        lbl_Lock_msgUserName.setText("Error msg");
        jPanel1.add(lbl_Lock_msgUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 380, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new first();

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed
      
        password_c+=1;

        if(password_c % 2 == 0){
            btn_Pvisible.setIcon(pHide);
            txtPasswordIns.setEchoChar('*');
            
        }
        else{
            btn_Pvisible.setIcon(pShow);
            txtPasswordIns.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        // TODO add your handling code here:

        btn_login.setBackground(Color.WHITE);
        btn_login.setForeground(Color.BLACK);

    }//GEN-LAST:event_btn_loginMousePressed

    private void btn_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseReleased
        // TODO add your handling code here:
        btn_login.setForeground(Color.WHITE);
        btn_login.setBackground(new Color(153,153,0));

    }//GEN-LAST:event_btn_loginMouseReleased

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

//Checking Whether the Username and Passoword is Empty
        if(txtUsernameIns.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Username!",
                "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPasswordIns.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Password!",
                "Error",JOptionPane.ERROR_MESSAGE);
        }

// Checking Username and Password
        else{
            int tempLocation=0;
            boolean isUsername = false;
            
            for(int i =0; i < getUserNames.length; i++){
                
                if(txtUsernameIns.getText().equalsIgnoreCase(getUserNames[i])){
                    lbl_Lock_msgUserName.setText(null);
                    txtUsernameIns.setBorder(normal_Border);
                    
                    tempLocation = i;
                    isUsername = true;
                    break;
                }                
            }
            
            if(!isUsername){
                
                lbl_Lock_msgUserName.setText("Username not found!");
                txtUsernameIns.setBorder(error_Border);
                error_countU++;

                if(error_countU == 4){

                    first.lockingCountInstructor = true;

                    JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                    + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                    "Login Details",JOptionPane.ERROR_MESSAGE);                              

                    txtUsernameIns.setText(null);
                    txtPasswordIns.setText(null);
                    txtUsernameIns.setEnabled(false);
                    txtPasswordIns.setEnabled(false);
                    btn_login.setEnabled(false);
                    txtUsernameIns.setBorder(lock_border);
                    txtPasswordIns.setBorder(lock_border);
                    lbl_Lock_msgUserName.setText(null);
                    lbl_Lock_msgPassword.setText(null);

                    btn_forgot.setVisible(true);

                }
                else if(error_countU == 3){          
                    JOptionPane.showMessageDialog(null, "This is your last chance",
                        "Login Information",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(error_countU == 2){          
                    JOptionPane.showMessageDialog(null, "2 chances are remaining",
                    "Login Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                
                if(txtPasswordIns.getText().equals(getPasswords[tempLocation])){
                    lbl_Lock_msgPassword.setText(null);
                    txtPasswordIns.setBorder(normal_Border);

                    JOptionPane.showMessageDialog(null, "Login Success","Login Information",
                    JOptionPane.INFORMATION_MESSAGE);
                    getUser = txtUsernameIns.getText();
                    
// setting logged history to DB
                            
                    try {
                        qry = "INSERT INTO instructor_login_history (UserName) VALUES"
                                + " ('"+ getUser +"')";
                        pt = con.prepareStatement(qry);
                        pt.executeUpdate();

                        dispose();
                        new Home();
                    } 
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else{
                    lbl_Lock_msgPassword.setText("Invalid Password!");
                    txtPasswordIns.setBorder(error_Border);
                    error_countP++;

                    if(error_countP == 4){

                        first.lockingCountInstructor = true;

                        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                        "Login Details",JOptionPane.ERROR_MESSAGE);                              

                        txtUsernameIns.setText(null);
                        txtPasswordIns.setText(null);
                        txtUsernameIns.setEnabled(false);
                        txtPasswordIns.setEnabled(false);
                        btn_login.setEnabled(false);
                        txtUsernameIns.setBorder(lock_border);
                        txtPasswordIns.setBorder(lock_border);
                        lbl_Lock_msgPassword.setText(null);

                        btn_forgot.setVisible(true);

                    }
                    else if(error_countP == 3){          
                        JOptionPane.showMessageDialog(null, "This is your last chance",
                            "Login Information",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(error_countP == 2){          
                        JOptionPane.showMessageDialog(null, "2 chances are remaining",
                        "Login Information",JOptionPane.INFORMATION_MESSAGE);
                    }                
                }   
            }            
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgotActionPerformed
        // TODO add your handling code here:      
        
        if(ForgotInstructor.lockStatusCode){
            ForgotInstructor obj1 = new ForgotInstructor();
            
            JOptionPane.showMessageDialog(null, "Sorry You have requested many Codes. Try again after some times, \n"
            + " Please contact your Developer for help..", "Information",
            JOptionPane.INFORMATION_MESSAGE);
                    
            obj1.txtEmail.setText(null);
            obj1.cmb_Ins_ID.setEnabled(false);
            obj1.txtEmail.setEnabled(false);
            obj1.txtCode.setEnabled(false);
            obj1.btn_Code_Verify.setEnabled(false);
            obj1.btn_Send_Code.setEnabled(false);
            
        }
        else if(ForgotInstructor.lockStatusWrongEntry){
            ForgotInstructor obj1 = new ForgotInstructor();
            
            JOptionPane.showMessageDialog(null, "Too many wrong entries Try again later", "Information",
            JOptionPane.ERROR_MESSAGE);
            
            obj1.txtEmail.setText(null);
            obj1.txtCode.setText(null);
            obj1.txtEmail.setEditable(false);
            obj1.txtCode.setEditable(false);
            obj1.btn_Send_Code.setEnabled(false);
            obj1.btn_Code_Verify.setEnabled(false);
            
        }
        else{
            dispose();
            new ForgotInstructor();
        }
    }//GEN-LAST:event_btn_forgotActionPerformed

    private void txtUsernameInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameInsKeyTyped
        // TODO add your handling code here:
        txtUsernameIns.setBorder(normal_Border);
        lbl_Lock_msgUserName.setText(null);
    }//GEN-LAST:event_txtUsernameInsKeyTyped

    private void txtPasswordInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordInsKeyTyped
        // TODO add your handling code here:
        txtPasswordIns.setBorder(normal_Border);
        lbl_Lock_msgPassword.setText(null);
    }//GEN-LAST:event_txtPasswordInsKeyTyped

    public static void main(String[] args) {
        new Login_Instructor();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    public javax.swing.JButton btn_forgot;
    public javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbl_Lock_msgPassword;
    public javax.swing.JLabel lbl_Lock_msgUserName;
    public javax.swing.JPasswordField txtPasswordIns;
    public javax.swing.JTextField txtUsernameIns;
    // End of variables declaration//GEN-END:variables
}
