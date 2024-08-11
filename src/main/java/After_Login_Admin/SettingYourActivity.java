
package After_Login_Admin;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhanush
 */
public class SettingYourActivity extends javax.swing.JFrame {

    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;

// Db Connect...    
    void dbConnect(){
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public SettingYourActivity() {
        initComponents();
        dbConnect();
        
        jPanel1.setBackground(Home.body);
        txtPane1.setBackground(Home.body);
        btnClearLoginHistory.setBackground(Home.BodyElements);
        
        lblMsg.setVisible(false);
        
        try {
            qry = "SELECT (login_history) FROM admin_login_history";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                txtPane1.setText(txtPane1.getText() + rs.getString(1) + "\n");
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        if(txtPane1.getText().isEmpty()){
            lblMsg.setVisible(true);
            btnClearLoginHistory.setEnabled(false);
        }
        else{
            lblMsg.setVisible(false);
            btnClearLoginHistory.setEnabled(true);
        }
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPane1 = new javax.swing.JTextPane();
        btnClearLoginHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMsg.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg.setText("Login History Has Been Cleared");
        jPanel1.add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 570, 170));

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Activity");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 588, 103));

        txtPane1.setEditable(false);
        txtPane1.setBackground(new java.awt.Color(51, 0, 0));
        txtPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txtPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, 580, 180));

        btnClearLoginHistory.setBackground(new java.awt.Color(102, 0, 0));
        btnClearLoginHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClearLoginHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnClearLoginHistory.setText("Clear Login History");
        btnClearLoginHistory.setBorderPainted(false);
        btnClearLoginHistory.setFocusable(false);
        btnClearLoginHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLoginHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearLoginHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnClearLoginHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLoginHistoryActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Login Information Clear Success","Data Clear",JOptionPane.INFORMATION_MESSAGE);
        lblMsg.setVisible(true);
        btnClearLoginHistory.setEnabled(false);
        
        try {
            qry = "DELETE FROM admin_login_history";
            pt = con.prepareStatement(qry);
            pt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        txtPane1.setText(null);
        
    }//GEN-LAST:event_btnClearLoginHistoryActionPerformed

    public static void main(String args[]) {
        new SettingYourActivity();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearLoginHistory;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextPane txtPane1;
    // End of variables declaration//GEN-END:variables
}
