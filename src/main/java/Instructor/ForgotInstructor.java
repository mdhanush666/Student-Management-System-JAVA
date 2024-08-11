package Instructor;

import java.sql.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.border.Border;

/**
 *
 * @author Dhanush
 */
public class ForgotInstructor extends javax.swing.JFrame {

    ImageIcon codeSendTickMsg = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\tick.png");

    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);

    
    Timer timer = new Timer();
    int countDown = 20;
    int timeCount = countDown;
    
    public static boolean lockStatusCode = false;
    public static boolean lockStatusWrongEntry = false;


    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    String qry = null;

    String getMailTemp;
    int codeGenerateCount = 0;
    int codeWrongEntry = 0;

    void dbConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String userName = "Dhanush";
            String password = "Dhanush!1896$";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            stm = con.createStatement();

            //System.out.println("Db Connect Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ForgotInstructor() {
        initComponents();

        dbConnect();

// assigning Instructors ID to Combo Box       
        try {
            qry = "SELECT ID FROM instructor_registration ORDER BY (ID)ASC";
            rs = stm.executeQuery(qry);

            while (rs.next()) {
                cmb_Ins_ID.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        btn_Code_Verify.setEnabled(false);
        txtCode.setEditable(false);

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btncClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_Ins_ID = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btn_Pvisible = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        btn_Send_Code = new javax.swing.JButton();
        btn_Code_Verify = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncClose.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btncClose.setForeground(new java.awt.Color(51, 51, 51));
        btncClose.setText("X");
        btncClose.setBorder(null);
        btncClose.setBorderPainted(false);
        btncClose.setContentAreaFilled(false);
        btncClose.setFocusable(false);
        btncClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncCloseActionPerformed(evt);
            }
        });
        jPanel3.add(btncClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 50));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORGOT");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USERNAME / PASSWORD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        cmb_Ins_ID.setBackground(new java.awt.Color(204, 204, 0));
        cmb_Ins_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_Ins_ID.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Ins_ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your ID.." }));
        cmb_Ins_ID.setBorder(null);
        cmb_Ins_ID.setFocusable(false);
        cmb_Ins_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_Ins_IDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmb_Ins_IDMousePressed(evt);
            }
        });
        cmb_Ins_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_Ins_IDActionPerformed(evt);
            }
        });
        jPanel3.add(cmb_Ins_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 250, 30));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 0));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 30));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Code");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, -1, -1));

        txtCode.setBackground(new java.awt.Color(204, 204, 0));
        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(0, 0, 0));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodeMouseClicked(evt);
            }
        });
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });
        jPanel3.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 255, 250, 30));

        btn_Pvisible.setBackground(new java.awt.Color(110, 0, 0));
        btn_Pvisible.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\verifyCode.png")); // NOI18N
        btn_Pvisible.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_Pvisible.setContentAreaFilled(false);
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
        jPanel3.add(btn_Pvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(110, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\mail.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 215, -1, -1));

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setText("00");
        jPanel3.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 30, 30));

        btn_Send_Code.setBackground(new java.awt.Color(255, 255, 0));
        btn_Send_Code.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Send_Code.setForeground(new java.awt.Color(51, 51, 51));
        btn_Send_Code.setText("Send Code");
        btn_Send_Code.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 5, true)));
        btn_Send_Code.setBorderPainted(false);
        btn_Send_Code.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Send_Code.setFocusable(false);
        btn_Send_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Send_CodeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Send_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 110, 40));

        btn_Code_Verify.setBackground(new java.awt.Color(255, 255, 0));
        btn_Code_Verify.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Code_Verify.setForeground(new java.awt.Color(51, 51, 51));
        btn_Code_Verify.setText("Verify");
        btn_Code_Verify.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 5, true)));
        btn_Code_Verify.setBorderPainted(false);
        btn_Code_Verify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Code_Verify.setFocusable(false);
        btn_Code_Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Code_VerifyActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Code_Verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 380, 390));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Instructor\\forgot.png")); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        Login_Instructor obj1 = new Login_Instructor();
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE);                              

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
    }//GEN-LAST:event_btn_backActionPerformed

    private void btncCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncCloseActionPerformed

    private void cmb_Ins_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_Ins_IDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_Ins_IDMouseClicked

    private void cmb_Ins_IDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_Ins_IDMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmb_Ins_IDMousePressed

    private void cmb_Ins_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_Ins_IDActionPerformed

        if (cmb_Ins_ID.getSelectedIndex() == 0) {
            cmb_Ins_ID.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmb_Ins_ID.setBorder(null);
        }

    }//GEN-LAST:event_cmb_Ins_IDActionPerformed

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, Color.WHITE));

    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeMouseClicked

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        // TODO add your handling code here:
        txtCode.setBorder(new MatteBorder(0,0,2,0, Color.WHITE));
    }//GEN-LAST:event_txtCodeKeyTyped

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed

    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_Send_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Send_CodeActionPerformed
        // TODO add your handling code here:
        if (cmb_Ins_ID.getSelectedIndex() == 0) {
            cmb_Ins_ID.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email must be entered", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, Color.red));
        } else {

            try {
                qry = "SELECT Email FROM instructor_registration WHERE ID = '" + cmb_Ins_ID.getSelectedItem() + "'";
                rs = stm.executeQuery(qry);

                while (rs.next()) {
                    getMailTemp = rs.getString(1);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            if (txtEmail.getText().equalsIgnoreCase(getMailTemp)) {
                
                timer = new Timer();
                timeCount = countDown;

                if (codeGenerateCount == 3) {
                    
                    lockStatusCode = true;
                    
                    JOptionPane.showMessageDialog(null, "Sorry You have requested many Codes. Try again after some times, \n"
                    + " Please contact your Developer for help..", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    txtEmail.setText(null);
                    cmb_Ins_ID.setEnabled(false);
                    txtEmail.setEnabled(false);
                    txtCode.setEnabled(false);
                    btn_Code_Verify.setEnabled(false);
                    btn_Send_Code.setEnabled(false);
                    
                    timer.cancel();
                    lbl_time.setText("00");

                } 
                else {
                    txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, Color.WHITE));

                    JOptionPane.showMessageDialog(null,
                            "Generating verification Code...\n Press ok", "Information", JOptionPane.INFORMATION_MESSAGE);

                    txtEmail.setEditable(false);
                    btn_Send_Code.setEnabled(false);

                    JavaSendMail_Instructor.sendMail(txtEmail.getText());

                    if (JavaSendMail_Instructor.stop) {
                        txtEmail.setEditable(true);
                        btn_Send_Code.setEnabled(true);
                        dispose();
                        new ForgotInstructor();
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Verification Code has been Send Successfully",
                                "Information", JOptionPane.INFORMATION_MESSAGE, codeSendTickMsg);

                        codeGenerateCount++;
                        codeWrongEntry=0;

                        txtCode.setEditable(true);
                        btn_Code_Verify.setEnabled(true);

                        TimerTask timeTask = new TimerTask() {
                            @Override
                            public void run() {
                                lbl_time.setText(Integer.toString(timeCount));
                                timeCount--;

                                if (timeCount == -1) {
                                    JOptionPane.showMessageDialog(null, "Time up!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                                    timer.cancel();
                                    lbl_time.setText("00");
                                    
                                    txtCode.setText(null);
                                    txtCode.setEditable(false);
                                    txtEmail.setEditable(true);
                                    btn_Send_Code.setEnabled(true);
                                    btn_Code_Verify.setEnabled(false);

                                }
                            }
                        };
                        timer.scheduleAtFixedRate(timeTask, 1000, 1000);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Email doesn't match with the ID!","INFORMATION",JOptionPane.ERROR_MESSAGE);
                txtEmail.setBorder(new MatteBorder(0,0,2,0,Color.red));
            }
        }


    }//GEN-LAST:event_btn_Send_CodeActionPerformed

    private void btn_Code_VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Code_VerifyActionPerformed
        // TODO add your handling code here:
        
        int codeCopy = JavaSendMail_Instructor.verifyCode;
        System.out.println("Verify code : " + JavaSendMail_Instructor.verifyCode);
        
        if (codeWrongEntry == 4) {
            
            lockStatusWrongEntry = true;

            JOptionPane.showMessageDialog(null, "Too many wrong entries Try again later", "Information",
                    JOptionPane.ERROR_MESSAGE);
            txtEmail.setText(null);
            txtCode.setText(null);
            txtEmail.setEditable(false);
            txtCode.setEditable(false);
            btn_Send_Code.setEnabled(false);
            btn_Code_Verify.setEnabled(false);
            timer.cancel();
            lbl_time.setText("00");
        } 
        else if (codeWrongEntry == 3) {
            JOptionPane.showMessageDialog(null, "This is your last chance", "Information",
                    JOptionPane.ERROR_MESSAGE);
            codeWrongEntry++;
        }
        else{
            if(txtCode.getText().isEmpty()){
                txtCode.setBorder(new MatteBorder(0,0,2,0,Color.red));
            }
            else{
            
                for(int i =0 ;i < txtCode.getText().length(); i++){
                    if(txtCode.getText().charAt(i) >= 65 && txtCode.getText().charAt(i) <= 90
                       || txtCode.getText().charAt(i) >= 97 && txtCode.getText().charAt(i) <= 122){

                        txtCode.setBorder(new MatteBorder(0,0,2,0,Color.red));
                        JOptionPane.showMessageDialog(null, "Code must contain only Numbers!","VERIFY",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
           
                if(txtCode.getText().equals(String.valueOf(codeCopy))){
                    JOptionPane.showMessageDialog(null, "Verification Completed", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
                    timer.cancel();
                    dispose();
                    new ResetInstructor();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Code", "Verify Information",
                    JOptionPane.ERROR_MESSAGE);
                    txtCode.setBorder(new MatteBorder(0,0,2,0,Color.red));
                    codeWrongEntry++;
                    countDown += 5;
                }
            
            }
        }
        
        
        
    }//GEN-LAST:event_btn_Code_VerifyActionPerformed

    public static void main(String args[]) {
        new ForgotInstructor();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Code_Verify;
    private javax.swing.JButton btn_Pvisible;
    public javax.swing.JButton btn_Send_Code;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btncClose;
    public static javax.swing.JComboBox<String> cmb_Ins_ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_time;
    public javax.swing.JTextField txtCode;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
