
package Instructor;

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
public class ResetInstructor extends javax.swing.JFrame {

    ImageIcon pShow = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Pshow.png");
    ImageIcon pHide = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Phide.png");

    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
    Border error_border = new MatteBorder(0,0,2,0,Color.red);
    Border normal_border = new MatteBorder(0,0,2,0,Color.WHITE);


    
    int password_c = 0;
    int password_c2 = 0;
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    String userNames[];

    
// connect Db and get Old userName and Password..    
    void dbConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String userName = "Dhanush";
            String password = "Dhanush!1896$";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            stm = con.createStatement();
            //System.out.println("Db Connect Success");
            
            qry = "SELECT userName,password FROM instructor_login_details WHERE ID = '" + ForgotInstructor.cmb_Ins_ID.getSelectedItem()+"'";

            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                txtOldUsername.setText(rs.getString(1));
                txtOldPassword.setText(rs.getString(2));
            }           
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ResetInstructor() {
        initComponents();
        
        dbConnect();
  
// get length of userNames arrays...        
        try{
            qry = "SELECT COUNT(userName) FROM instructor_login_details";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                userNames = new String [rs.getInt(1)];
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
// assigning userNames to arrays..
        try{
            qry = "SELECT userName FROM instructor_login_details";
            rs = stm.executeQuery(qry);
            
            int i = 0;
            while(rs.next()){
                userNames[i] = rs.getString(1);
                i++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtOldUsername = new javax.swing.JTextField();
        txtOldPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btn_Pvisible = new javax.swing.JButton();
        btn_Pvisible1 = new javax.swing.JButton();
        txtNewPasswordRetype = new javax.swing.JPasswordField();
        btn_confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(0, 0, 0));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SYSTEM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, -1));

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Instructor\\reset.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 270));

        bgPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        btnClose.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(51, 51, 51));
        btnClose.setText("X");
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reset");

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" PASSWORD");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Old Username");

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Old Password");

        txtOldUsername.setEditable(false);
        txtOldUsername.setBackground(new java.awt.Color(204, 204, 0));
        txtOldUsername.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtOldUsername.setForeground(new java.awt.Color(0, 0, 0));
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

        txtOldPassword.setEditable(false);
        txtOldPassword.setBackground(new java.awt.Color(204, 204, 0));
        txtOldPassword.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtOldPassword.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("New Username");

        txtNewUsername.setBackground(new java.awt.Color(204, 204, 0));
        txtNewUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNewUsername.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("New Passoword");

        txtNewPassword.setBackground(new java.awt.Color(204, 204, 0));
        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Retype Password");

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

        txtNewPasswordRetype.setBackground(new java.awt.Color(204, 204, 0));
        txtNewPasswordRetype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNewPasswordRetype.setForeground(new java.awt.Color(0, 0, 0));
        txtNewPasswordRetype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        btn_confirm.setBackground(new java.awt.Color(153, 153, 0));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNewUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addComponent(btnClose)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Pvisible1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewPasswordRetype, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        bgPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
        Login_Instructor obj1 = new Login_Instructor();
 
        obj1.txtUsernameIns.setText(null);
        obj1.txtPasswordIns.setText(null);
        obj1.txtUsernameIns.setEnabled(false);
        obj1.txtPasswordIns.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsernameIns.setBorder(lock_border);
        obj1.txtPasswordIns.setBorder(lock_border);
        obj1.lbl_Lock_msgUserName.setText(null);
        obj1.lbl_Lock_msgPassword.setText(null);

        obj1.btn_forgot.setVisible(true);
        
        obj1.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtOldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOldUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameMouseClicked

    private void txtOldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameActionPerformed

    private void txtOldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldUsernameKeyTyped

    private void txtOldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOldPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordMouseClicked

    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordActionPerformed

    private void txtOldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordKeyTyped

    private void txtNewUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameMouseClicked

    private void txtNewUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewUsernameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameMousePressed

    private void txtNewUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUsernameActionPerformed

    private void txtNewUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewUsernameKeyTyped
        // TODO add your handling code here:
        txtNewUsername.setBorder(normal_border);
    }//GEN-LAST:event_txtNewUsernameKeyTyped

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
    }//GEN-LAST:event_btn_confirmMousePressed

    private void btn_confirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confirmMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirmMouseReleased

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:    
        
        if(txtNewUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the New Username!","Reset Information",JOptionPane.ERROR_MESSAGE);
            txtNewUsername.setBorder(error_border);
        }
        else if(txtNewPassword.getText().isEmpty() || txtNewPasswordRetype.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill the Password fields!","Reset Information",JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            String p1,p2;
                
            p1 = txtNewPassword.getText();
            p2 = txtNewPasswordRetype.getText();
            
            for(String ele : userNames){
                if(txtNewUsername.getText().equalsIgnoreCase(ele)){
                    JOptionPane.showMessageDialog(null, "Username already taken!","Reset Information",JOptionPane.ERROR_MESSAGE);
                    txtNewUsername.setBorder(error_border);
                    break;
                }
            }
            
            if(p1.length() > 8){                
                
                if(p1.equals(p2)){
                    
                    try{
                        qry = "DELETE FROM instructor_login_history WHERE UserName = '" + txtOldUsername.getText() + "'";
                        pt = con.prepareStatement(qry);
                        pt.executeUpdate();
                    }
                    catch(Exception e){

                    }
                    
                    try{
                       qry = "UPDATE instructor_login_details SET userName = ?,password = ? WHERE ID = '"+ForgotInstructor.cmb_Ins_ID.getSelectedItem()+"'";
                       pt = con.prepareStatement(qry);
                       
                       pt.setString(1, txtNewUsername.getText());
                       pt.setString(2, txtNewPassword.getText());
                       
                       pt.executeUpdate();
                       
                       JOptionPane.showMessageDialog(null, "Reset Success","Reset Information",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Login_Instructor();
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }                 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passowrd doen't match!","Reset Information",JOptionPane.ERROR_MESSAGE);
                    txtNewPasswordRetype.setText(null);
                    txtNewPasswordRetype.setBorder(error_border);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Password must be greater than 8!","Reset Information",JOptionPane.ERROR_MESSAGE);
                txtNewPassword.setBorder(error_border);
            }
            
        }
        
    }//GEN-LAST:event_btn_confirmActionPerformed

    public static void main(String args[]) {
        new ResetInstructor();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Pvisible1;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
