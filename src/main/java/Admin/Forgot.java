package Admin;

import Codes.JavaSendMail;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Timer;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.util.Random;

public class Forgot extends javax.swing.JFrame {
    
    Random random = new Random();
    
    final String mailAddress= "dhanush66dhanush@gmail.com"; 
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");
    ImageIcon codeSendTickMsg = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\tick.png");    
    
    Border borderLoad = new MatteBorder(0, 0, 2, 0, Color.gray);
    Border borderALoad = new MatteBorder(0, 0, 2, 0, Color.WHITE);
            
    int codeRequestCount=0;
    int codeWrongEntry=0;
    
    int wrongMail=0;
    
    Timer timer = new Timer();
    int CountDown = 20;
    int timeCount = CountDown;
    

    public Forgot() {
        
        initComponents();
    
//      setLocationRelativeTo(null);
        setResizable(false);  
        setIconImage(frameIcon.getImage());
        txtCode.setBorder(borderLoad);
        txtCode.setEnabled(false);
                
        setVisible(true);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Pvisible = new javax.swing.JButton();
        txtCode = new javax.swing.JPasswordField();
        btn_Send_Code = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        btn_Code_Verify = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
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
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORGOT");

        txtEmail.setBackground(new java.awt.Color(110, 0, 0));
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

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Code");

        btn_Pvisible.setBackground(new java.awt.Color(110, 0, 0));
        btn_Pvisible.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\verifyCode.png")); // NOI18N
        btn_Pvisible.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
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

        txtCode.setBackground(new java.awt.Color(110, 0, 0));
        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCode.setEnabled(false);
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

        btn_Send_Code.setBackground(new java.awt.Color(153, 0, 0));
        btn_Send_Code.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Send_Code.setForeground(new java.awt.Color(255, 255, 255));
        btn_Send_Code.setText("Send Code");
        btn_Send_Code.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 5, true)));
        btn_Send_Code.setBorderPainted(false);
        btn_Send_Code.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Send_Code.setFocusable(false);
        btn_Send_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Send_CodeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERNAME / PASSWORD");

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_Code_Verify.setBackground(new java.awt.Color(153, 0, 0));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtCode)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Code_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Send_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Pvisible))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Pvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Send_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Code_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 370, 400));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@ M.Dhanush");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\forgot_Username_Password.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 310, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        Login obj1 = new Login();
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE);
        
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.lbl_locking_msg.setText(null);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        obj1.btn_forgot.setVisible(true);
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_Code_VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Code_VerifyActionPerformed
        // TODO add your handling code here:

        int codeCheck = Integer.parseInt(txtCode.getText());
//      String codeCheckText = txtCode.getText();

        if(codeWrongEntry == 3){
            JOptionPane.showMessageDialog(null,"Too many wrong entries Try again later","Information",
                JOptionPane.ERROR_MESSAGE);
            txtEmail.setText(null);
            txtCode.setText(null);
            txtEmail.setEditable(false);
            txtCode.setEditable(false);
            btn_Send_Code.setEnabled(false);
            btn_Code_Verify.setEnabled(false);
            System.exit(0);
        }
        else{

            if(codeCheck == (JavaSendMail.verifyCode)){ 
                JOptionPane.showMessageDialog(null,"Verification Completed","Information",
                    JOptionPane.INFORMATION_MESSAGE);

                timer.cancel();
                dispose();
                new Reset();
            }

            else{
                JOptionPane.showMessageDialog(null,"Invalid Code, Try again","Information",
                    JOptionPane.ERROR_MESSAGE);
                txtCode.setText(null);
                codeWrongEntry++;
                CountDown += 2;
            }

        }

        //          System.out.println(JavaSendMail.verifyCode);

    }//GEN-LAST:event_btn_Code_VerifyActionPerformed

    private void btn_Send_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Send_CodeActionPerformed
        // TODO add your handling code here:

        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a Email Address to Send Code!",
                "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtEmail.getText().equalsIgnoreCase(mailAddress)){

            codeRequestCount++;
            timer = new Timer();
            timeCount = CountDown;

            if(codeRequestCount == 4){
                JOptionPane.showMessageDialog(null,"Sorry You have requested many. Try again after some times, \n"
                    + " Please contact your Developer for help..","Information",
                    JOptionPane.INFORMATION_MESSAGE);
                txtEmail.setText(null);
                txtCode.setText(null);
                txtEmail.setEditable(false);
                txtCode.setEditable(false);
                btn_Send_Code.setEnabled(false);
                btn_Code_Verify.setEnabled(false);
            }
            else{

                JOptionPane.showMessageDialog(null,"Generating Code...\n Please wait",
                    "Information",JOptionPane.INFORMATION_MESSAGE);


                txtEmail.setEditable(false);
                btn_Send_Code.setEnabled(false);
                txtCode.setEnabled(true);
                txtCode.setBorder(borderALoad);
                btn_Code_Verify.setEnabled(true);
                txtCode.setEchoChar((char)0);                

                JavaSendMail.sendMail(mailAddress);
                
                if(JavaSendMail.stop){
                    dispose();
                    new Forgot();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Verification Code has been Send Successfully",
                        "Information",JOptionPane.INFORMATION_MESSAGE,codeSendTickMsg);


                    TimerTask timeTask = new TimerTask(){

                        @Override
                        public void run(){
                            lbl_time.setText(Integer.toString(timeCount));
                            timeCount --;
                            if(timeCount == -1){
                                JOptionPane.showMessageDialog(null,"Time up!","Information",
                                    JOptionPane.INFORMATION_MESSAGE);
                                timer.cancel();
                                txtEmail.setEditable(true);
                                lbl_time.setText(null);
                                btn_Send_Code.setEnabled(true);
                                btn_Code_Verify.setEnabled(false);
                                txtCode.setEnabled(false);
                                txtCode.setText(null);
                            }
                        }
                    };
                    timer.scheduleAtFixedRate(timeTask, 1000, 1000);
                }  
            }

        }
        else{
            wrongMail++;

            if(wrongMail == 4){
                JOptionPane.showMessageDialog(null,"Too many Wrong Entries, Try again later",
                    "Information",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            else if(wrongMail == 3){
                JOptionPane.showMessageDialog(null,"Too many Wrong Entries, This is your last chances",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                txtEmail.setText(null);
                JOptionPane.showMessageDialog(null,"Please enter a valid Email",
                    "Information",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_Send_CodeActionPerformed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeKeyTyped

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

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
        
        dispose();
        
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        Login obj1 = new Login();
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE);
        
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.lbl_locking_msg.setText(null);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        obj1.btn_forgot.setVisible(true);
    }//GEN-LAST:event_btn_closeActionPerformed

    public static void main(String args[]) {
        new Forgot();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Code_Verify;
    private javax.swing.JButton btn_Pvisible;
    private javax.swing.JButton btn_Send_Code;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JPasswordField txtCode;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
