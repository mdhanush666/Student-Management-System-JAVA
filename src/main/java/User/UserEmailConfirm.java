package User;

/**
 *
 * @author Dhanush
 */
import static User.ForgotUser.getMisNo;
import java.awt.Color;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.border.MatteBorder;

public class UserEmailConfirm extends javax.swing.JFrame {
    
    ImageIcon codeSendTickMsg = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\tick.png");    

    
    String getMail = UserRegister.txtEmail.getText();
    Random random = new Random();
    
    Timer timer = new Timer();
    int CountDown = 20;
    int timeCount = CountDown;
    
    int CodeRequestCount = 0;
    int codeWrongEntry = 0;
    
    boolean codeValidate = true;
 
// Constructor..   
    public UserEmailConfirm() {
        initComponents();
        
        txtCode.setBackground(new java.awt.Color(0,0,0,1));
        
        lbl_time.setVisible(false);
        lbl_mail.setText(getMail);
        lbl_mail.setText(UserRegister.txtEmail.getText());
        txtCode.setEnabled(false);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        lbl_mail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_VerifyCode = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        btn_SendCode = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        lbl_mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_mail.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbl_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Code :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 240, 40));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Email :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 50));

        btn_VerifyCode.setBackground(new java.awt.Color(51, 51, 51));
        btn_VerifyCode.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_VerifyCode.setForeground(new java.awt.Color(255, 255, 255));
        btn_VerifyCode.setText("Verify");
        btn_VerifyCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btn_VerifyCode.setContentAreaFilled(false);
        btn_VerifyCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_VerifyCode.setEnabled(false);
        btn_VerifyCode.setFocusable(false);
        btn_VerifyCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerifyCodeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_VerifyCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VERIFY EMAIL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 370, 80));

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 335, 100, 30));

        btn_SendCode.setBackground(new java.awt.Color(51, 51, 51));
        btn_SendCode.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_SendCode.setForeground(new java.awt.Color(255, 255, 255));
        btn_SendCode.setText("Send Code");
        btn_SendCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btn_SendCode.setContentAreaFilled(false);
        btn_SendCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SendCode.setFocusable(false);
        btn_SendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SendCodeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SendCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 100, 40));

        txtCode.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 240, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Animated\\bgGIF1.gif")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -40, 680, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        UserRegister c1 = new UserRegister();
        dispose();
        c1.setVisible(true);
        UserRegister.Panel2.setVisible(true);
        UserRegister.Panel1.setVisible(false);
        
        c1.cmbDD.setSelectedItem(UserRegister.tempDD);
        c1.cmbMM.setSelectedItem(UserRegister.tempMM);
        c1.cmbYYYY.setSelectedItem(UserRegister.tempYYYY);
        
        if(UserRegister.tempGen.equals(c1.rdbM)){
            c1.rdbF.setSelected(true);
        }
        else{
            c1.rdbM.setSelected(true);
        }
        
        UserRegister.txtEmail.setText(UserRegister.tempMail);
        
        c1.txtContactNo.setText(UserRegister.tempContactNo);  
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_SendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SendCodeActionPerformed
        // TODO add your handling code here:
                    
        CodeRequestCount++;
        timer = new Timer();
        timeCount = CountDown;


        if(CodeRequestCount == 4){

            JOptionPane.showMessageDialog(null,"Sorry You have requested many. Try again after some times, \n"
            + " Please contact your Developer for help..","Information",
                JOptionPane.ERROR_MESSAGE);
            txtCode.setEnabled(false);
            btn_SendCode.setEnabled(false);
            btn_VerifyCode.setEnabled(false);

            dispose();
            new LoginUser();   
        }
        else{                
            JOptionPane.showMessageDialog(null,
            "Generating verification Code...\n Press ok and wait for some time..","Information",JOptionPane.INFORMATION_MESSAGE);

            JavaSendMail_User.sendMail(lbl_mail.getText());

            if(JavaSendMail_User.stop){
                UserRegister c1 = new UserRegister();
                dispose();
                c1.setVisible(true);
                UserRegister.Panel2.setVisible(true);
                UserRegister.Panel1.setVisible(false);

                c1.cmbDD.setSelectedItem(UserRegister.tempDD);
                c1.cmbMM.setSelectedItem(UserRegister.tempMM);
                c1.cmbYYYY.setSelectedItem(UserRegister.tempYYYY);

                if(UserRegister.tempGen.equals(c1.rdbM)){
                    c1.rdbF.setSelected(true);
                }
                else{
                    c1.rdbM.setSelected(true);
                }

                UserRegister.txtEmail.setText(UserRegister.tempMail);

                c1.txtContactNo.setText(UserRegister.tempContactNo);
            }
            else{

                btn_SendCode.setText(null);
                lbl_time.setVisible(true);
                btn_SendCode.setEnabled(false);
                btn_VerifyCode.setEnabled(true);
                txtCode.setEnabled(true);

                JOptionPane.showMessageDialog(null,"Verification Code has been Send Successfully",
                "Information",JOptionPane.INFORMATION_MESSAGE,codeSendTickMsg);

                TimerTask timerTask = new TimerTask(){
                    @Override
                    public void run(){
                        lbl_time.setText(Integer.toString(timeCount));
                        timeCount--;

                        if(timeCount == -1){
                            JOptionPane.showMessageDialog(null,"Time up!","Information",
                            JOptionPane.INFORMATION_MESSAGE);
                            timer.cancel();
                            lbl_time.setVisible(false);
                            btn_SendCode.setText("Send Code");
                            btn_SendCode.setEnabled(true);
                        }
                    }
                }; 
                timer.scheduleAtFixedRate(timerTask, 1000,1000);
            }    
        }
    }//GEN-LAST:event_btn_SendCodeActionPerformed
// Code Verify
    private void btn_VerifyCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerifyCodeActionPerformed
        // TODO add your handling code here:
        
        System.out.println(JavaSendMail_User.verifyCode);
            
        int codeCheckInt = Integer.parseInt(txtCode.getText());
        
        System.out.println("Get s Code : " + codeCheckInt);

        if(codeWrongEntry == 4){
            JOptionPane.showMessageDialog(null,"Too many wrong entries Try again later","Information",
                JOptionPane.ERROR_MESSAGE);
            txtCode.setText(null);
            txtCode.setEnabled(false);
            btn_SendCode.setEnabled(false);
            btn_VerifyCode.setEnabled(false);
            System.exit(0);
        }
        else{
            
            for(int i =0 ; i < txtCode.getText().length(); i++){
                if(txtCode.getText().charAt(i) >= 48 && txtCode.getText().charAt(i) <= 58){
                    codeValidate = true;
                }
                else{
                    codeValidate = false;
                    break;
                }
            }
            
            if(!codeValidate){
                JOptionPane.showMessageDialog(null, "Please enter the code correctly!",
                            "Information",JOptionPane.ERROR_MESSAGE);
            }
            
            else if(txtCode.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter the Verification Code!",
                            "Information",JOptionPane.ERROR_MESSAGE);
            }
            else if(codeCheckInt == JavaSendMail_User.verifyCode){
                JOptionPane.showMessageDialog(null,"Verification Completed","Information",
                    JOptionPane.INFORMATION_MESSAGE);               

                timer.cancel();
                //JavaSendMail_User.verifyCode = random.nextInt(999999);
                dispose();
                new CreateLogin();
                
            }

            else{
                JOptionPane.showMessageDialog(null,"Invalid Code, Try again","Information",
                    JOptionPane.ERROR_MESSAGE);
                txtCode.setText(null);
                txtCode.setFocusable(true);
                codeWrongEntry++;
                CountDown += 2;
            }

        }
    }//GEN-LAST:event_btn_VerifyCodeActionPerformed

    public static void main(String args[]) {
        new UserEmailConfirm();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SendCode;
    private javax.swing.JButton btn_VerifyCode;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
