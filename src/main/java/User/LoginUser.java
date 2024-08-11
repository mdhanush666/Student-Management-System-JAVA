
package User;

import Main_Forms.first;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class LoginUser extends javax.swing.JFrame {
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");
    
    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
    
    int password_c=0;
    String UserNames[],UserPasswords[];
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    String url = "jdbc:mysql://localhost:3306/student_management_system";
    String username = "Dhanush";
    String password = "Dhanush!1896$";
    
    int error_Count = 0;
    public static String getUser;
 
// Constructor..
    public LoginUser() {
        
        initComponents();
 
        // DB Connection and get the length of the array
        try{      
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry = "SELECT COUNT(userName) FROM student_login_details";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){                
                UserNames = new String[Integer.parseInt(rs.getString(1))];
                UserPasswords = new String[Integer.parseInt(rs.getString(1))]; 
            }
            
// assiging values for arrays from db table           
            qry = "SELECT userName,password FROM student_login_details";
            rs = stm.executeQuery(qry);
            
            int i = 0;
            while(rs.next()){                
                UserNames[i] = rs.getString(1);
                UserPasswords[i] = rs.getString(2);
                i++;
            }  
        }
        
        catch( Exception e){
            System.out.println(e);
        }
        
        
        //btn_forgot.setVisible(false); 
        btn_forgot.setEnabled(false);
        
        setIconImage(frameIcon.getImage());
        setVisible(true);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_Icon = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Pvisible = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        txtUsernameNotFound = new javax.swing.JLabel();
        btn_forgot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 400));

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

        lbl_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\user2.png")); // NOI18N

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(lbl_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 330, 400));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btn_close.setBackground(new java.awt.Color(110, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setContentAreaFilled(false);
        btn_close.setFocusable(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USER LOGIN");

        txtUsername.setBackground(new java.awt.Color(0, 0, 102));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(110, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\username.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        btn_Pvisible.setBackground(new java.awt.Color(110, 0, 0));
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

        txtPassword.setBackground(new java.awt.Color(0, 0, 102));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 0, 204));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
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

        btn_Register.setBackground(new java.awt.Color(0, 0, 204));
        btn_Register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(255, 255, 255));
        btn_Register.setText("Register");
        btn_Register.setBorder(null);
        btn_Register.setBorderPainted(false);
        btn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register.setFocusable(false);
        btn_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_RegisterMouseReleased(evt);
            }
        });
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        txtUsernameNotFound.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        txtUsernameNotFound.setForeground(new java.awt.Color(204, 0, 51));
        txtUsernameNotFound.setFocusable(false);

        btn_forgot.setBackground(new java.awt.Color(110, 0, 0));
        btn_forgot.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_forgot.setForeground(new java.awt.Color(220, 204, 255));
        btn_forgot.setText("Forgot Username / Password");
        btn_forgot.setBorder(null);
        btn_forgot.setContentAreaFilled(false);
        btn_forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_forgot.setFocusable(false);
        btn_forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUsernameNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Pvisible)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsernameNotFound, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 380, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new first();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        dispose();
        new UserRegister();
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_RegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseReleased
        // TODO add your handling code here:
        btn_Register.setForeground(Color.WHITE);
        btn_Register.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btn_RegisterMouseReleased

    private void btn_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMousePressed
        // TODO add your handling code here:
        btn_Register.setBackground(Color.WHITE);
        btn_Register.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_RegisterMousePressed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
     
// validating fields  

        if(txtUsername.getText().isEmpty()){
                lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face3.png"));
                JOptionPane.showMessageDialog(null,"Username is empty!","Login Information",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPassword.getText().isEmpty()){
                lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face3.png"));
                JOptionPane.showMessageDialog(null,"Password is empty!","Login Information",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\user2.png"));           
               
                for(int i = 0;i < UserNames.length; i++){
                     
                    if(txtUsername.getText().equalsIgnoreCase(UserNames[i])){

                        txtUsernameNotFound.setText("");

                        if(txtPassword.getText().equals(UserPasswords[i])){
                            
                            lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face2.png"));


                            JOptionPane.showMessageDialog(null, "Login Success","Login Information",
                                    JOptionPane.INFORMATION_MESSAGE);
                            getUser = txtUsername.getText();
                            
// setting logged history to DB
                            
                            try {
                                qry = "INSERT INTO student_login_history (UserName) VALUES"
                                        + " ('"+ getUser +"')";
                                pt = con.prepareStatement(qry);
                                pt.executeUpdate();
                                
                                dispose();
                                new After_Login_User.Home();
                            } 
                            catch (Exception e) {
                                e.printStackTrace();
                            }                            
                            
                        }
                        else{
                            lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face4.png"));
                            JOptionPane.showMessageDialog(null, "Invalid Password","Login Information",
                                    JOptionPane.INFORMATION_MESSAGE);
                            txtPassword.setText(null);
                            error_Count++;
                            
                            if(error_Count == 4){
                                
                                first.lockingCount = true;
                                UserRegister.lockStatus = true;
                                
                                JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                                + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                                "Login Details",JOptionPane.ERROR_MESSAGE);                              
                                
                                txtUsername.setText(null);
                                txtPassword.setText(null);
                                txtUsername.setEnabled(false);
                                txtPassword.setEnabled(false);
                                btn_login.setEnabled(false);
                                txtUsername.setBorder(lock_border);
                                txtPassword.setBorder(lock_border);

                                //btn_forgot.setVisible(true);
                                btn_forgot.setEnabled(true);
                                                
                            }
                            else if(error_Count == 3){          
                                JOptionPane.showMessageDialog(null, "This is your last chance",
                                    "Login Information",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else if(error_Count == 2){          
                                JOptionPane.showMessageDialog(null, "2 chances are remaining",
                                "Login Information",JOptionPane.INFORMATION_MESSAGE);
                            }
                            
                            break;
                        }
                    }
                    else{

                        while(true){
                            if(txtUsername.getText().equalsIgnoreCase(UserNames[i])){

                            }
                            else{
                                txtUsernameNotFound.setText("Username Not Found!");
                                break;
                            }
                        }

                    }           
                }           
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseReleased
        // TODO add your handling code here:
        btn_login.setForeground(Color.WHITE);
        btn_login.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btn_loginMouseReleased

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        // TODO add your handling code here:

        btn_login.setBackground(Color.WHITE);
        btn_login.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_loginMousePressed

    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed
        password_c+=1;

        if(password_c % 2 == 0){
            btn_Pvisible.setIcon(pHide);
            txtPassword.setEchoChar('*');
        }
        else{
            btn_Pvisible.setIcon(pShow);
            txtPassword.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        txtUsernameNotFound.setText(null);
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void btn_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgotActionPerformed
        // TODO add your handling code here:
        dispose();
        new ForgotUser();
    }//GEN-LAST:event_btn_forgotActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
        lbl_Icon.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face1.png"));

    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyReleased

   
    public static void main(String args[]) {
        new LoginUser();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    public javax.swing.JButton btn_forgot;
    public javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Icon;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtUsernameNotFound;
    // End of variables declaration//GEN-END:variables
}
