
package Main_Forms;

import Admin.Login;
import Instructor.Login_Instructor;
import User.LoginUser;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class first extends javax.swing.JFrame {
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");

    
    Border border_hover_admin = new MatteBorder(2, 2, 2, 2, Color.WHITE);
    Border border_hover_instructor = new MatteBorder(2, 2, 2, 2, Color.BLACK);
    Border border_hover_user = new MatteBorder(2, 2, 2, 2, Color.WHITE);

    
    Border border_hover_release = new EmptyBorder(0, 0, 0, 0);
    
    public static boolean lockingCount = false;
    public static boolean lockingCountAdmin = false;
    public static boolean lockingCountInstructor = false;


    public first() {
        initComponents();
        
        setIconImage(frameIcon.getImage());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        img_admin = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        img_user = new javax.swing.JLabel();
        btn_user = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        img_instructor = new javax.swing.JLabel();
        btnIns = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        img_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_admin.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\admin.png")); // NOI18N
        img_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_adminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img_adminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img_adminMouseReleased(evt);
            }
        });

        btn_admin.setBackground(new java.awt.Color(153, 0, 0));
        btn_admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin.setText("ADMIN");
        btn_admin.setBorderPainted(false);
        btn_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_admin.setFocusable(false);
        btn_admin.setPreferredSize(new java.awt.Dimension(82, 30));
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(img_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jPanel2.setBackground(new java.awt.Color(51, 0, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 400));

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

        img_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_user.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\user.png")); // NOI18N
        img_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_userMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img_userMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img_userMouseReleased(evt);
            }
        });

        btn_user.setBackground(new java.awt.Color(0, 102, 204));
        btn_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setText("USER");
        btn_user.setBorderPainted(false);
        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.setFocusable(false);
        btn_user.setPreferredSize(new java.awt.Dimension(76, 30));
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 248, Short.MAX_VALUE)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addGap(33, 33, 33)
                .addComponent(img_user, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 300, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 400));

        img_instructor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_instructor.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Instructor\\teacher.png")); // NOI18N
        img_instructor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_instructor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_instructorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_instructorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_instructorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img_instructorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img_instructorMouseReleased(evt);
            }
        });

        btnIns.setBackground(new java.awt.Color(153, 153, 0));
        btnIns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIns.setForeground(new java.awt.Color(255, 255, 255));
        btnIns.setText("INSTRUCTOR");
        btnIns.setBorderPainted(false);
        btnIns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIns.setFocusable(false);
        btnIns.setPreferredSize(new java.awt.Dimension(76, 30));
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_instructor, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnIns, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(img_instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        // TODO add your handling code here:
        
        if(lockingCountAdmin){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        Login obj1 = new Login();
                                     
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        obj1.btn_forgot.setVisible(true);
        obj1.btn_forgot.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new Login();        
        }
        
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        // TODO add your handling code here:
        if(lockingCount){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        LoginUser obj1 = new LoginUser();
                                     
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        //btn_forgot.setVisible(true);
        obj1.btn_forgot.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new LoginUser();        
        }
    }//GEN-LAST:event_btn_userActionPerformed

    private void img_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_adminMouseEntered
        // TODO add your handling code here:       
        img_admin.setBorder(border_hover_admin);      
    }//GEN-LAST:event_img_adminMouseEntered

    private void img_adminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_adminMouseReleased
        // TODO add your handling code here:       
    }//GEN-LAST:event_img_adminMouseReleased

    private void img_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_userMouseEntered
        // TODO add your handling code here:        
        img_user.setBorder(border_hover_user);      
    }//GEN-LAST:event_img_userMouseEntered

    private void img_userMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_userMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_img_userMouseReleased

    private void img_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_adminMouseExited
        // TODO add your handling code here:
        img_admin.setBorder(border_hover_release);
    }//GEN-LAST:event_img_adminMouseExited

    private void img_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_userMouseExited
        // TODO add your handling code here:
        img_user.setBorder(border_hover_release);
    }//GEN-LAST:event_img_userMouseExited

    private void img_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_adminMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_img_adminMouseClicked

    private void img_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_userMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_img_userMouseClicked

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
        // TODO add your handling code here:
        if(lockingCountInstructor){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        Login_Instructor objINS1 = new Login_Instructor();
                                     
        objINS1.txtUsernameIns.setText(null);
        objINS1.txtPasswordIns.setText(null);
        objINS1.txtUsernameIns.setEnabled(false);
        objINS1.txtPasswordIns.setEnabled(false);
        objINS1.btn_login.setEnabled(false);
        objINS1.txtUsernameIns.setBorder(lock_border);
        objINS1.txtPasswordIns.setBorder(lock_border);

        objINS1.btn_forgot.setEnabled(true);
        objINS1.btn_forgot.setVisible(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new Login_Instructor();        
        }
    }//GEN-LAST:event_btnInsActionPerformed

    private void img_instructorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_instructorMouseReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_img_instructorMouseReleased

    private void img_instructorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_instructorMouseExited
        // TODO add your handling code here:
        img_instructor.setBorder(border_hover_release);
    }//GEN-LAST:event_img_instructorMouseExited

    private void img_instructorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_instructorMouseEntered
        // TODO add your handling code here:
        img_instructor.setBorder(border_hover_instructor);
    }//GEN-LAST:event_img_instructorMouseEntered

    private void img_instructorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_instructorMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_img_instructorMouseClicked

    private void img_adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_adminMousePressed
        // TODO add your handling code here:
        if(lockingCountAdmin){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        Login obj1 = new Login();
                                     
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        obj1.btn_forgot.setVisible(true);
        obj1.btn_forgot.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new Login();        
        }
    }//GEN-LAST:event_img_adminMousePressed

    private void img_instructorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_instructorMousePressed
        // TODO add your handling code here:
        if(lockingCountInstructor){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        Login_Instructor objINS1 = new Login_Instructor();
                                     
        objINS1.txtUsernameIns.setText(null);
        objINS1.txtPasswordIns.setText(null);
        objINS1.txtUsernameIns.setEnabled(false);
        objINS1.txtPasswordIns.setEnabled(false);
        objINS1.btn_login.setEnabled(false);
        objINS1.txtUsernameIns.setBorder(lock_border);
        objINS1.txtPasswordIns.setBorder(lock_border);

        objINS1.btn_forgot.setEnabled(true);
        objINS1.btn_forgot.setVisible(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new Login_Instructor();        
        }
    }//GEN-LAST:event_img_instructorMousePressed

    private void img_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_userMousePressed
        // TODO add your handling code here:
        if(lockingCount){
            
        Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
        
        dispose();
        LoginUser obj1 = new LoginUser();
                                     
        obj1.txtUsername.setText(null);
        obj1.txtPassword.setText(null);
        obj1.txtUsername.setEnabled(false);
        obj1.txtPassword.setEnabled(false);
        obj1.btn_login.setEnabled(false);
        obj1.txtUsername.setBorder(lock_border);
        obj1.txtPassword.setBorder(lock_border);

        //btn_forgot.setVisible(true);
        obj1.btn_forgot.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
        + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
        "Login Details",JOptionPane.ERROR_MESSAGE); 
            
        }
        else{ 
            dispose();
            new LoginUser();        
        }
    }//GEN-LAST:event_img_userMousePressed

    public static void main(String args[]) {    
        new first();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_user;
    private javax.swing.JLabel img_admin;
    private javax.swing.JLabel img_instructor;
    private javax.swing.JLabel img_user;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
