
package After_Login_User;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhanush
 */

import java.time.LocalDate;
import javax.swing.JOptionPane;

import java.sql.*;

public class MarkAttendance extends javax.swing.JFrame {

    LocalDate todayDate = LocalDate.now();
    
    int count = 1;
    
    ImageIcon unchk = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\unchecked_radio_button_30px.png");
    ImageIcon chk = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\Checkmark_30px.png");

// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    String qry = null;    
    
// Db Connect..    
    public void dbConnect(){
        try {
            String url = "jdbc:mysql://localhost:3306/student_attendance";
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

// Constructor...    
    public MarkAttendance() {
        initComponents();
        dbConnect();   
        
        String temp = null;
        
// set the behaviour to update btn...        
        try {
            
            String getMonth = String.valueOf(todayDate.getMonth()).toLowerCase();
            String getYear = String.valueOf(todayDate.getYear());
        
            String concatMonth_Year = getMonth + "_" + getYear;
            
            qry = "SELECT `" + todayDate.getDayOfMonth() +"` FROM " + concatMonth_Year + " WHERE MIS = '" + Home.getMis_No + "'" ;
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                temp = rs.getString(1);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        if(temp != null){
            btnUpdate.setEnabled(false);
        }
        else{
            btnUpdate.setEnabled(true);
        }
        
        txtDate.setText(String.valueOf(todayDate));
        
// setting theme..
        
        bgPanel.setBackground(Home.body);
        txtDate.setBackground(Home.body);
        rdbPresent.setBackground(Home.body);
        
        btnUpdate.setBackground(Home.BodyElements);
        
        
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdbPresent = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(0, 0, 102));

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mark Attendance");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Status");

        rdbPresent.setBackground(new java.awt.Color(0, 0, 102));
        rdbPresent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbPresent.setForeground(new java.awt.Color(255, 255, 255));
        rdbPresent.setText("Present");
        rdbPresent.setBorder(null);
        rdbPresent.setFocusable(false);
        rdbPresent.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\unchecked_radio_button_30px.png")); // NOI18N
        rdbPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPresentActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(0, 0, 102));
        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtDate.setFocusable(false);

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(rdbPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(rdbPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void rdbPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPresentActionPerformed
        // TODO add your handling code here:
        rdbPresent.setForeground(Color.WHITE);
        count++;
        
        if(count % 2 == 0){ // even     // chk
            rdbPresent.setIcon(chk);
        }
        else{   // odd      // unchk
            rdbPresent.setIcon(unchk);
        }
    }//GEN-LAST:event_rdbPresentActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String getMonth = String.valueOf(todayDate.getMonth()).toLowerCase();
        String getYear = String.valueOf(todayDate.getYear());
        
        String concatMonth_Year = getMonth + "_" + getYear;
       
        if(count % 2 == 0){
            
            try {
                qry = "UPDATE " + concatMonth_Year + " SET `" 
                    + todayDate.getDayOfMonth() +"` = '1' WHERE MIS = '" + Home.getMis_No + "'" ;
                pt = con.prepareStatement(qry);
                pt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Attendance Marked..","Mark Attendance",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Home();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }            
        }
        else{
            rdbPresent.setForeground(Color.red);
            
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public static void main(String args[]) {
        new MarkAttendance();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rdbPresent;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
