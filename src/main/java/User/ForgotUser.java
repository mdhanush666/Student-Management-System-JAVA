package User;

import Codes.JavaSendMail;
import Main_Forms.first;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Timer;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.util.Random;
import java.sql.*;

public class ForgotUser extends javax.swing.JFrame {

    Random random = new Random();

    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");
    ImageIcon codeSendTickMsg = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\tick.png");

    Border borderLoad = new MatteBorder(0, 0, 2, 0, Color.gray);
    Border borderALoad = new MatteBorder(0, 0, 2, 0, Color.WHITE);

    int codeRequestCount = 0;
    int codeWrongEntry = 1;

    int wrongMail = 0;
    public static String getMisNo;

    Timer timer = new Timer();
    int countDown = 20;
    int timeCount = countDown;

    Connection con = null;
    Statement stm = null;
    String qry = "";
    ResultSet rs = null;

    String mis_numbers[], emails[];

// Constructor    
    public ForgotUser() {

        initComponents();

        lbl_time.setText(" ");

//      setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(frameIcon.getImage());
        txtCode.setBorder(borderLoad);
        txtCode.setEnabled(false);

        setVisible(true);

        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "Dhanush";
        String password = "Dhanush!1896$";

// DB Connect and Assign values for arrays and cmb..        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();

            qry = "SELECT COUNT(MIS_No) FROM student_registration";
            rs = stm.executeQuery(qry);

            while (rs.next()) {
                mis_numbers = new String[rs.getInt(1)];
                emails = new String[rs.getInt(1)];
            }

            qry = "SELECT MIS_No,Email FROM student_registration ORDER BY(Mis_No)ASC";
            rs = stm.executeQuery(qry);

            int tempC = 0;
            while (rs.next()) {
                mis_numbers[tempC] = rs.getString(1);
                cmbMIS_no.addItem(rs.getString(1));
                emails[tempC] = rs.getString(2);
                tempC++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Pvisible = new javax.swing.JButton();
        btn_Code_Verify = new javax.swing.JButton();
        btn_Send_Code = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        cmbMIS_no = new javax.swing.JComboBox<>();
        txtCode = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\forgot_Username_Password.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SYSTEM");

        btn_back.setBackground(new java.awt.Color(110, 0, 0));
        btn_back.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\backIocn.png")); // NOI18N
        btn_back.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_back.setContentAreaFilled(false);
        btn_back.setFocusable(false);
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
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
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 340, 450));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

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

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORGOT");

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERNAME / PASSWORD");

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MIS No");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        txtEmail.setBackground(new java.awt.Color(0, 0, 102));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
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

        jButton1.setBackground(new java.awt.Color(110, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\mail.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Code");

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

        btn_Code_Verify.setBackground(new java.awt.Color(0, 0, 153));
        btn_Code_Verify.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Code_Verify.setForeground(new java.awt.Color(255, 255, 255));
        btn_Code_Verify.setText("Verify");
        btn_Code_Verify.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 5, true)));
        btn_Code_Verify.setBorderPainted(false);
        btn_Code_Verify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Code_Verify.setEnabled(false);
        btn_Code_Verify.setFocusable(false);
        btn_Code_Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Code_VerifyActionPerformed(evt);
            }
        });

        btn_Send_Code.setBackground(new java.awt.Color(0, 0, 153));
        btn_Send_Code.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Send_Code.setForeground(new java.awt.Color(255, 255, 255));
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

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setText("00");

        cmbMIS_no.setBackground(new java.awt.Color(0, 0, 102));
        cmbMIS_no.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbMIS_no.setForeground(new java.awt.Color(255, 255, 255));
        cmbMIS_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your MIS Number.." }));
        cmbMIS_no.setFocusable(false);
        cmbMIS_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMIS_noMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMIS_noMousePressed(evt);
            }
        });
        cmbMIS_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMIS_noActionPerformed(evt);
            }
        });

        txtCode.setBackground(new java.awt.Color(0, 0, 102));
        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btn_Code_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(btn_Send_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbMIS_no, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMIS_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_time)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Send_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Code_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 390, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
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

        JOptionPane.showMessageDialog(null, "Sorry You have entered worng Login Details "
                + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                "Login Details", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_Code_VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Code_VerifyActionPerformed
        // TODO add your handling code here:

        System.out.println(JavaSendMail_User.verifyCode);

        int codeCheck = Integer.parseInt(txtCode.getText());
        String codeCheckText = txtCode.getText();

        if (codeWrongEntry == 4) {
            JOptionPane.showMessageDialog(null, "Too many wrong entries Try again later", "Information",
                    JOptionPane.ERROR_MESSAGE);
            txtEmail.setText(null);
            txtCode.setText(null);
            txtEmail.setEditable(false);
            txtCode.setEditable(false);
            btn_Send_Code.setEnabled(false);
            btn_Code_Verify.setEnabled(false);
            System.exit(0);
        } else if (codeWrongEntry == 3) {
            JOptionPane.showMessageDialog(null, "Too many wrong entries! \nThis is your last chance", "Information",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            if (txtCode.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "Please enter the Verification Code!",
                        "Information", JOptionPane.ERROR_MESSAGE);
            } else if (codeCheck == JavaSendMail_User.verifyCode) { 
                JOptionPane.showMessageDialog(null, "Verification Completed", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
                getMisNo = String.valueOf(cmbMIS_no.getSelectedItem());

                timer.cancel();
                //JavaSendMail.verifyCode = random.nextInt(999999);
                dispose();
                new ResetUser();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Code, Try again", "Information",
                        JOptionPane.ERROR_MESSAGE);
                txtCode.setText(null);
                codeWrongEntry++;
                countDown += 2;
            }

        }
    }//GEN-LAST:event_btn_Code_VerifyActionPerformed

    private void btn_Send_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Send_CodeActionPerformed
        // TODO add your handling code here:

        if (cmbMIS_no.getSelectedItem().equals("Select your MIS Number..")) {
            JOptionPane.showMessageDialog(null, "Please select your MIS Number ",
                    "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
//            cmbMIS_no.setBackground(Color.red);
//            cmbMIS_no.setForeground(Color.WHITE);
            cmbMIS_no.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a Email Address to Send Code!",
                    "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            txtEmail.setFocusable(true);
        } else {

            try {
                for (int i = 0; i < mis_numbers.length; i++) {

                    if (cmbMIS_no.getSelectedItem().equals(mis_numbers[i])) {
                        if (txtEmail.getText().equalsIgnoreCase(emails[i])) {

                            codeRequestCount++;
                            timer = new Timer();
                            timeCount = countDown;

                            if (codeRequestCount == 4) {
                                JOptionPane.showMessageDialog(null, "Sorry You have requested many Codes. Try again after some times, \n"
                                        + " Please contact your Developer for help..", "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                txtEmail.setText(null);
                                txtCode.setText(null);
                                txtEmail.setEditable(false);
                                txtCode.setEditable(false);
                                btn_Send_Code.setEnabled(false);
                                btn_Code_Verify.setEnabled(false);
                                dispose();
                                new LoginUser();
                            } else {

                                JOptionPane.showMessageDialog(null,
                                "Generating verification Code...\n Press ok", "Information", JOptionPane.INFORMATION_MESSAGE);

                                txtEmail.setEditable(false);
                                btn_Send_Code.setEnabled(false);
                                txtCode.setEnabled(true);
                                txtCode.setBorder(borderALoad);
                                btn_Code_Verify.setEnabled(true);

                                JavaSendMail_User.sendMail(txtEmail.getText());

                                if (JavaSendMail_User.stop) {
                                    
                                    txtEmail.setEditable(true);
                                    btn_Send_Code.setEnabled(true);
                                    txtCode.setEnabled(false);
                                    txtCode.setBorder(borderLoad);
                                    btn_Code_Verify.setEnabled(false);
                                    
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

                                    JOptionPane.showMessageDialog(null, "Sorry You have entered worng Login Details "
                                            + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                                            "Login Details", JOptionPane.ERROR_MESSAGE);


                                } else {

                                    JOptionPane.showMessageDialog(null, "Verification Code has been Send Successfully",
                                            "Information", JOptionPane.INFORMATION_MESSAGE, codeSendTickMsg);

                                    TimerTask timeTask = new TimerTask() {
                                        @Override
                                        public void run() {
                                            lbl_time.setText(Integer.toString(timeCount));
                                            timeCount--;

                                            if (timeCount == -1) {

                                                JOptionPane.showMessageDialog(null, "Time up!", "Information",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                                timer.cancel();
                                                txtCode.setText(null);
                                                txtEmail.setEditable(true);
                                                btn_Send_Code.setEnabled(true);
                                                txtCode.setEnabled(false);
                                                txtCode.setBorder(borderLoad);
                                                btn_Code_Verify.setEnabled(false);
                                                codeWrongEntry = 0;

                                            }

                                        }

                                    };
                                    timer.scheduleAtFixedRate(timeTask, 1000, 1000);
                                }
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Email Doesn't Match..",
                                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            txtEmail.setText(null);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }//GEN-LAST:event_btn_Send_CodeActionPerformed

    // Password SHOW and HIDE 
    private void btn_PvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PvisibleActionPerformed

    }//GEN-LAST:event_btn_PvisibleActionPerformed

    private void btn_PvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PvisibleMouseClicked

    }//GEN-LAST:event_btn_PvisibleMouseClicked

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
        //        txtEmail.setText(null);
    }//GEN-LAST:event_txtEmailMouseClicked

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

        JOptionPane.showMessageDialog(null, "Sorry You have entered worng Login Details "
                + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                "Login Details", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btn_closeActionPerformed

    private void cmbMIS_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMIS_noMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMIS_noMouseClicked

    private void cmbMIS_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMIS_noActionPerformed
        // TODO add your handling code here:
//        cmbMIS_no.setBackground(new Color(0 ,0,102));
//        cmbMIS_no.setForeground(Color.WHITE);
        cmbMIS_no.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 102)));


    }//GEN-LAST:event_cmbMIS_noActionPerformed

    private void cmbMIS_noMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMIS_noMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbMIS_noMousePressed

    private void txtCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeMouseClicked

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeKeyTyped

    public static void main(String args[]) {
        new ForgotUser();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Code_Verify;
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Send_Code;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private javax.swing.JComboBox<String> cmbMIS_no;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
