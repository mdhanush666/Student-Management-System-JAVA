
package After_Login_User;

/**
 *
 * @author Dhanush
 */
public class Settings extends javax.swing.JFrame {

    public Settings() {
        initComponents();
        
        jPanel1.setBackground(Home.body);
        btnNotificationSetting.setBackground(Home.body);
        btnChangePassword.setBackground(Home.body);
        btn_activity.setBackground(Home.body);
        btnThemes.setBackground(Home.body);
        btnAbout.setBackground(Home.body);

        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNotificationSetting = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_activity = new javax.swing.JButton();
        btnThemes = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Setting");

        btnNotificationSetting.setBackground(new java.awt.Color(0, 0, 102));
        btnNotificationSetting.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btnNotificationSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificationSetting.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\forward.png")); // NOI18N
        btnNotificationSetting.setText("Notification");
        btnNotificationSetting.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnNotificationSetting.setFocusable(false);
        btnNotificationSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNotificationSetting.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNotificationSetting.setIconTextGap(240);

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

        btn_activity.setBackground(new java.awt.Color(0, 0, 102));
        btn_activity.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btn_activity.setForeground(new java.awt.Color(255, 255, 255));
        btn_activity.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\forward.png")); // NOI18N
        btn_activity.setText("Your Activity");
        btn_activity.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btn_activity.setFocusable(false);
        btn_activity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_activity.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_activity.setIconTextGap(230);
        btn_activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activityActionPerformed(evt);
            }
        });

        btnThemes.setBackground(new java.awt.Color(0, 0, 102));
        btnThemes.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btnThemes.setForeground(new java.awt.Color(255, 255, 255));
        btnThemes.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\forward.png")); // NOI18N
        btnThemes.setText("Themes");
        btnThemes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnThemes.setFocusable(false);
        btnThemes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThemes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnThemes.setIconTextGap(270);
        btnThemes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemesActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 102));
        btnChangePassword.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\forward.png")); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnChangePassword.setFocusable(false);
        btnChangePassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChangePassword.setIconTextGap(180);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(0, 0, 102));
        btnAbout.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\forward.png")); // NOI18N
        btnAbout.setText("About");
        btnAbout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnAbout.setFocusable(false);
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAbout.setIconTextGap(290);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_activity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnNotificationSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemes, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnNotificationSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_activity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        dispose();
        new SettingChangePassword();
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btn_activityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activityActionPerformed
        // TODO add your handling code here:
        dispose();
        new SettingYourActivity();
    }//GEN-LAST:event_btn_activityActionPerformed

    private void btnThemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemesActionPerformed
        // TODO add your handling code here:
        dispose();
        new SettingThemes();
    }//GEN-LAST:event_btnThemesActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        dispose();
        new SettingsAbout();
    }//GEN-LAST:event_btnAboutActionPerformed


    public static void main(String args[]) {
        new Settings();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnNotificationSetting;
    private javax.swing.JButton btnThemes;
    private javax.swing.JButton btn_activity;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
