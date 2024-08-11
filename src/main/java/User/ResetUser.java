
package User;

import Admin.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


public class ResetUser extends javax.swing.JFrame {
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");
    
    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    int password_c = 0;
    int password_c2 = 0;
    boolean usernameOk = true;
    
    String tempUser,tempPassword;
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    String url = "jdbc:mysql://localhost:3306/student_management_system";
    String username = "Dhanush";
    String password = "Dhanush!1896$";

// database connect..    
    void dbConnect(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public ResetUser() {
        initComponents();
        
// getting old Password & Username        
        
        try{
            
            dbConnect();
            
            qry = "SELECT userName,password FROM student_login_details WHERE MIS_No = '"+ ForgotUser.getMisNo +"'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                tempUser = rs.getString(1);
                tempPassword = rs.getString(2);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        txtOldUsername.setText(tempUser);
        txtOldPassword.setText(tempPassword);

        
//        txtOldPassword.setEditable(false);
        txtOldPassword.setEnabled(false);
        
//        txtUsername.setEditable(false);
        txtOldUsername.setEnabled(false);
           
        setIconImage(frameIcon.getImage());
            
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOldUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        btn_Pvisible = new javax.swing.JButton();
        txtNewPasswordRetype = new javax.swing.JPasswordField();
        btn_Pvisible1 = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SYSTEM");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\unlock.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" PASSWORD");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reset");

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

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Old Password");

        txtOldPassword.setBackground(new java.awt.Color(0, 0, 102));
        txtOldPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOldPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtOldPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtOldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtOldPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtOldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOldPasswordMouseClicked(evt);
            }
        });
        txtOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPasswordActionPerformed(evt);
            }
        });
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Old Username");

        txtOldUsername.setBackground(new java.awt.Color(0, 0, 102));
        txtOldUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOldUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtOldUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtOldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtOldUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtOldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOldUsernameMouseClicked(evt);
            }
        });
        txtOldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldUsernameActionPerformed(evt);
            }
        });
        txtOldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOldUsernameKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("New Passoword");

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Retype Password");

        txtNewPassword.setBackground(new java.awt.Color(0, 0, 102));
        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

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

        txtNewPasswordRetype.setBackground(new java.awt.Color(0, 0, 102));
        txtNewPasswordRetype.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNewPasswordRetype.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPasswordRetype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        btn_Pvisible1.setBackground(new java.awt.Color(110, 0, 0));
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

        btn_confirm.setBackground(new java.awt.Color(0, 0, 204));
        btn_confirm.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_confirm.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirm.setText("Confirm");
        btn_confirm.setBorderPainted(false);
        btn_confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_confirm.setFocusable(false);
        btn_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_confirmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_confirmMouseReleased(evt);
            }
        });
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("New Username");

        txtNewUsername.setBackground(new java.awt.Color(0, 0, 102));
        txtNewUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNewUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtNewUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNewUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtNewUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNewUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNewUsernameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNewUsernameMousePressed(evt);
            }
        });
        txtNewUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewUsernameActionPerformed(evt);
            }
        });
        txtNewUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewUsernameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtOldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Pvisible))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNewPasswordRetype, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Pvisible1))
                                    .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_close))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Pvisible1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewPasswordRetype, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 420, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        LoginUser obj1 = new LoginUser();
        obj1.setVisible(true);
                                     
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        //btn_forgot.setVisible(true);
        obj1.btn_forgot.setEnabled(true);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txtOldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOldPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordMouseClicked

    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordActionPerformed

    private void txtOldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordKeyTyped

    private void txtOldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOldUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameMouseClicked

    private void txtOldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameActionPerformed

    private void txtOldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameKeyTyped

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed
        password_c+=1;

        if(password_c % 2 == 0){
            btn_Pvisible.setIcon(pHide);
            txtNewPassword.setEchoChar('*');
        }
        else{
            btn_Pvisible.setIcon(pShow);
            txtNewPassword.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_Pvisible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Pvisible1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Pvisible1MouseClicked

    private void btn_Pvisible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pvisible1ActionPerformed
        // TODO add your handling code here:
        password_c2+=1;

        if(password_c2 % 2 == 0){
            btn_Pvisible1.setIcon(pHide);
            txtNewPasswordRetype.setEchoChar('*');
        }
        else{
            btn_Pvisible1.setIcon(pShow);
            txtNewPasswordRetype.setEchoChar((char)0);
        }
    }//GEN-LAST:event_btn_Pvisible1ActionPerformed

    private void btn_confirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confirmMousePressed
        // TODO add your handling code here:
        btn_confirm.setBackground(Color.WHITE);
        btn_confirm.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_confirmMousePressed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
        
        String p1 = txtNewPassword.getText();
        String p2 = txtNewPasswordRetype.getText();
        String nUser = txtNewUsername.getText();
        

        if(p1.isEmpty() || p2.isEmpty()){
            JOptionPane.showMessageDialog(null,"Password field is empty","Reset",
                            JOptionPane.INFORMATION_MESSAGE);
        }
        else if(nUser.isEmpty()){
            JOptionPane.showMessageDialog(null,"Username is empty","Reset",
                            JOptionPane.INFORMATION_MESSAGE);
        }
        else{

            if(p1.equals(p2)){
                if(p1.length()>= 8){

                    try{
                        dbConnect();
                        
                        try{
                            qry = "DELETE FROM student_login_history WHERE UserName = '" + txtOldUsername.getText() + "'";
                            pt = con.prepareStatement(qry);
                            pt.executeUpdate();
                        }
                        catch(Exception e){
                            
                        }
                        
                        pt = con.prepareStatement("UPDATE student_login_details SET userName = ? WHERE MIS_No = '"+ ForgotUser.getMisNo +"'");

                        pt.setString(1, nUser);

                        pt.executeUpdate();
                        usernameOk = true;
                    }
                    catch(Exception e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null, "Username already taken!", "Reset",JOptionPane.ERROR_MESSAGE);
                        txtNewUsername.selectAll();
                        txtNewUsername.setBorder(new MatteBorder(1,1,1,1, Color.red));
                        txtNewUsername.setFocusable(true);
                        usernameOk = false;
                    }
                    
                    if(usernameOk){
                        
                        try{

                            pt = con.prepareStatement("UPDATE student_login_details SET password = ? WHERE MIS_No = '"+ ForgotUser.getMisNo +"'");

                            pt.setString(1, p1);

                            pt.executeUpdate();
                            
                            JOptionPane.showMessageDialog(null,"Reset Success,","Password Reset",
                                JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            new LoginUser();

                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        
                    }
                    else{
                        txtNewUsername.setFocusable(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Password must be greater than or equal to 8 Characters","Password Reset",
                                JOptionPane.INFORMATION_MESSAGE);
                    txtNewPassword.setFocusable(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Password doesn't match!","Password Reset",
                                JOptionPane.INFORMATION_MESSAGE);
                txtNewPassword.setText(null);
                txtNewPasswordRetype.setText(null);
            }

        }
        
        
     
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_confirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confirmMouseReleased
        // TODO add your handling code here:
        btn_confirm.setForeground(Color.WHITE);
        btn_confirm.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btn_confirmMouseReleased

    private void txtNewUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameMouseClicked

    private void txtNewUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameActionPerformed

    private void txtNewUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameKeyTyped

    private void txtNewUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewUsernameMousePressed
        // TODO add your handling code here:
        txtNewUsername.setBorder(new MatteBorder(0,0,2,0, Color.WHITE));

    }//GEN-LAST:event_txtNewUsernameMousePressed

    public static void main(String args[]) {

        new ResetUser();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Pvisible1;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtNewPasswordRetype;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JTextField txtOldPassword;
    private javax.swing.JTextField txtOldUsername;
    // End of variables declaration//GEN-END:variables
}
