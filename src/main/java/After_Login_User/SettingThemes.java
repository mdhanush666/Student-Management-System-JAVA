
package After_Login_User;

import User.LoginUser;
import java.sql.*;

/**
 *
 * @author Dhanush
 */
public class SettingThemes extends javax.swing.JFrame {
    
    String qry = null;
    Connection con = null;
    PreparedStatement pt = null;
    
    void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }
        catch (Exception e) {
            System.out.println(e);
        }        
    }   

    public SettingThemes() {
        initComponents();        
        dbConnect();
        
        if(Home.getTheme.equalsIgnoreCase("blue")){        
            jPanel1.setBackground(Home.body);
            cmbBgC.setBackground(Home.body);
            btnSet.setBackground(Home.BodyElements);
  
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){        
            jPanel1.setBackground(Home.body);
            cmbBgC.setBackground(Home.body);
            btnSet.setBackground(Home.BodyElements);
  
        }
        else if(Home.getTheme.equalsIgnoreCase("default")){        
            jPanel1.setBackground(Home.body);
            cmbBgC.setBackground(Home.body);
            btnSet.setBackground(Home.BodyElements);
        }

        
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbBgC = new javax.swing.JComboBox<>();
        btnSet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Themes");

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setFocusable(false);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseMouseReleased(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Background - Color");

        cmbBgC.setBackground(new java.awt.Color(51, 0, 0));
        cmbBgC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBgC.setForeground(new java.awt.Color(255, 255, 255));
        cmbBgC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Red", "Black" }));
        cmbBgC.setBorder(null);
        cmbBgC.setFocusable(false);

        btnSet.setBackground(new java.awt.Color(153, 0, 0));
        btnSet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSet.setForeground(new java.awt.Color(255, 255, 255));
        btnSet.setText("Set");
        btnSet.setBorderPainted(false);
        btnSet.setFocusable(false);
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbBgC, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBgC))
                .addGap(31, 31, 31)
                .addComponent(btnSet)
                .addGap(26, 26, 26))
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

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMousePressed

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
        new Settings();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        // TODO add your handling code here:
        
        
        if(cmbBgC.getSelectedIndex() == 0){ // Default
      
            try{
                qry = "UPDATE student_login_details SET Theme = ? WHERE userName = '" + LoginUser.getUser + "'";
                pt = con.prepareStatement(qry);
                
                pt.setString(1, "DEFAULT");
                
                pt.executeUpdate();
            }
            catch(Exception e){
                System.out.println(e);
            }

            dispose();
            new Home();
        }
        
        else if(cmbBgC.getSelectedIndex() == 1){    // Red
                        
            try{
                qry = "UPDATE student_login_details SET Theme = ? WHERE userName = '" + LoginUser.getUser + "'";
                pt = con.prepareStatement(qry);
                
                pt.setString(1, "RED");
                
                pt.executeUpdate();
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            dispose();
            new Home();
        }
        else if(cmbBgC.getSelectedIndex() == 2){    // Black           
   
            try{
                qry = "UPDATE student_login_details SET Theme = ? WHERE userName = '" + LoginUser.getUser + "'";
                pt = con.prepareStatement(qry);
                
                pt.setString(1, "BLACK");
                
                pt.executeUpdate();
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            dispose();
            new Home();
        }
        
    }//GEN-LAST:event_btnSetActionPerformed

    public static void main(String args[]) {
        new SettingThemes();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSet;
    private javax.swing.JComboBox<String> cmbBgC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
