package Admin;

import Main_Forms.first;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Login extends javax.swing.JFrame {
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");
    
    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    int password_c=0;
    int error_count = 0;    
    
    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);

    String getPassword;
    
    Connection con = null;
    Statement stm = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    String qry = null;

// DB Connect..and get Password    
    void dbConnect(){
        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            //System.out.println("Db Success");
            
            qry = "SELECT password FROM admin_login_details";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getPassword = rs.getString(1);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public Login() {
        
        initComponents();
        dbConnect();
    
//      setLocationRelativeTo(null);
        setResizable(false);  
        setIconImage(frameIcon.getImage());
        btn_forgot.setVisible(false);
                
        setVisible(true);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lbl_locking_msg = new javax.swing.JLabel();
        btn_forgot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 0, 0));

        btn_close.setBackground(new java.awt.Color(110, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setBorder(null);
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
        jLabel5.setText("ADMIN LOGIN");

        txtUsername.setBackground(new java.awt.Color(110, 0, 0));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jButton1.setBackground(new java.awt.Color(110, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\username.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        btn_Pvisible.setBackground(new java.awt.Color(110, 0, 0));
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

        txtPassword.setBackground(new java.awt.Color(110, 0, 0));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        btn_login.setBackground(new java.awt.Color(130, 0, 0));
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

        lbl_locking_msg.setBackground(new java.awt.Color(102, 0, 0));
        lbl_locking_msg.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lbl_locking_msg.setForeground(new java.awt.Color(255, 255, 255));

        btn_forgot.setBackground(new java.awt.Color(110, 0, 0));
        btn_forgot.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_forgot.setForeground(new java.awt.Color(220, 204, 255));
        btn_forgot.setText("Forgot Username / Password");
        btn_forgot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Pvisible))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_locking_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_locking_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 370, 400));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

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
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\admin2.png")); // NOI18N

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
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 310, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
        new first();
    }//GEN-LAST:event_btn_closeActionPerformed

    // Login button Click Event
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
  
        // Checking Whether the Username and Passoword is Empty 
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Username!",
                        "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Password!",
                        "Error",JOptionPane.ERROR_MESSAGE);
        }   

        // Checking Username and Password 
        else{     
            int geti = 0; // to get last value of HID in admin login history Table in DB 
            
            if(txtUsername.getText().equalsIgnoreCase("admin")){

                if(txtPassword.getText().equals(getPassword)){
                    JOptionPane.showMessageDialog(null,"Login Success","Login Information",
                                JOptionPane.INFORMATION_MESSAGE);                    
                    
                    try{
                        // getting last value
                        qry = "SELECT (HID) FROM admin_login_history";
                        rs = stm.executeQuery(qry);
                        
                        while(rs.next()){
                            geti = Integer.parseInt(rs.getString(1));
                        }
                        
                        // insert new value in tbl for geti(HID)
                        qry = "INSERT INTO admin_login_history(HID) VALUES(?)";
                        pt = con.prepareStatement(qry);

                        pt.setInt(1, (geti + 1));
                        
                        pt.executeUpdate();
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    
                    txtUsername.setText(null);
                    txtPassword.setText(null);
                    password_c = 0;
                    btn_Pvisible.setIcon(pHide);
                    dispose();
                    new After_Login_Admin.Home();
                }
                // Wrong Entries for Password
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Password, Try again",
                                "Login Details",JOptionPane.ERROR_MESSAGE);
                    txtPassword.setText(null);
                    txtPassword.setFocusable(true);
                    error_count += 1;

                    if(error_count == 4){
                        
                        first.lockingCountAdmin = true;
                        
                        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                        "Login Details",JOptionPane.ERROR_MESSAGE);
                        
                        txtUsername.setText(null);
                        txtPassword.setText(null);
                        txtUsername.setEnabled(false);
                        txtPassword.setEnabled(false);
                        btn_login.setEnabled(false);
                        lbl_locking_msg.setText(null);
                        txtUsername.setBorder(lock_border);
                        txtPassword.setBorder(lock_border);
                        
                        btn_forgot.setVisible(true);
                                                
                    }
                    else if(error_count == 3){          
                        lbl_locking_msg.setText("This is your last chance");
                    }
                    else if(error_count == 2){          
                        lbl_locking_msg.setText("2 chances are remaining");
                    }

                }
            }
            // Wrong Entries For Username
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username, Try again",
                            "Login Details",JOptionPane.ERROR_MESSAGE);
                error_count += 1;

                if(error_count == 4){
                    first.lockingCountAdmin = true;
                        
                    JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                    + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                    "Login Details",JOptionPane.ERROR_MESSAGE);
                    
                    txtUsername.setText(null);
                    txtPassword.setText(null);
                    txtUsername.setEnabled(false);
                    txtPassword.setEnabled(false);
                    btn_login.setEnabled(false);
                    lbl_locking_msg.setText(null);
                    txtUsername.setBorder(lock_border);
                    txtPassword.setBorder(lock_border);
                    
                    btn_forgot.setVisible(true);
                }

                else if(error_count == 3){          
                        lbl_locking_msg.setText("This is your last chance");
                    }
                else if(error_count == 2){          
                        lbl_locking_msg.setText("2 chances are remaining");
                }

            }
        }           
    }//GEN-LAST:event_btn_loginActionPerformed

    // Password SHOW and HIDE 
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

    private void btn_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgotActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Forgot();
    }//GEN-LAST:event_btn_forgotActionPerformed

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        // TODO add your handling code here:
        
        btn_login.setBackground(Color.WHITE);
        btn_login.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_btn_loginMousePressed

    private void btn_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseReleased
        // TODO add your handling code here:
        btn_login.setForeground(Color.WHITE);
        btn_login.setBackground(new Color(130,0,0));
        
    }//GEN-LAST:event_btn_loginMouseReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new first();
    }//GEN-LAST:event_btn_backActionPerformed

    public static void main(String args[]) {
        new Login();
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
    public javax.swing.JLabel lbl_locking_msg;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
