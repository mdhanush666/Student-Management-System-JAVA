package After_Login_Instructor;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhanush
 */
public class ManageAttendance extends javax.swing.JFrame {

// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
// element to generate Students and Instructors MIS and ID        
        String StuMISGen = "JK23ICT5D"; 
        String InsIDGen = "INS23ICT5D";
        int stuTemp = 20001;
        int InsTemp = 10001;
        
    Date date = new Date();
        
    SimpleDateFormat nowY = new SimpleDateFormat("yyyy");
    SimpleDateFormat nowM = new SimpleDateFormat("MMMM");
    
    
    String month = nowM.format(date);
    int year = Integer.parseInt(nowY.format(date));
        
    String conCatNow = month + "_" + year;
        

// Constructor...    
    public ManageAttendance() {
        initComponents();
        
                
        bgPanel.setBackground(Home.body);
        btnCreate.setBackground(Home.BodyElements);
        txtDate.setBackground(Home.body);
        txtClzDays.setBackground(Home.body);
        
        jSlider1.setBackground(Home.body);
        jSlider1.setForeground(Color.WHITE);
        
        txtDate.setText(String.valueOf(nowM));     
        
        txtDate.setText(nowM.format(date));
        
        txtClzDays.setText(null);
        
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        lblTxt = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        lblTxt1 = new javax.swing.JLabel();
        txtClzDays = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(153, 153, 0));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Attendance");
        bgPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 459, -1));

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
        bgPanel.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        lblTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTxt.setForeground(new java.awt.Color(255, 255, 255));
        lblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt.setText("Create Attendance Table ");
        bgPanel.add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, 459, 48));

        btnCreate.setBackground(new java.awt.Color(204, 204, 0));
        btnCreate.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setFocusable(false);
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        bgPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 320, 459, 60));

        txtDate.setBackground(new java.awt.Color(153, 153, 0));
        txtDate.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("Date");
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtDate.setFocusable(false);
        bgPanel.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 188, 157, 38));

        jSlider1.setBackground(new java.awt.Color(153, 153, 0));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(204, 204, 0));
        jSlider1.setMajorTickSpacing(5);
        jSlider1.setMaximum(31);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setFocusable(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jSlider1MouseMoved(evt);
            }
        });
        jSlider1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jSlider1MouseWheelMoved(evt);
            }
        });
        bgPanel.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 240, 212, -1));

        lblTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTxt1.setForeground(new java.awt.Color(255, 255, 255));
        lblTxt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTxt1.setText("Class Days");
        bgPanel.add(lblTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 242, 110, 40));

        txtClzDays.setEditable(false);
        txtClzDays.setBackground(new java.awt.Color(153, 153, 0));
        txtClzDays.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        txtClzDays.setForeground(new java.awt.Color(255, 255, 255));
        txtClzDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClzDays.setText("vxcv");
        txtClzDays.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtClzDays.setFocusable(false);
        bgPanel.add(txtClzDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 245, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        if(txtClzDays.getText().isEmpty() || txtClzDays.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Please provide the Class Days","Information",JOptionPane.ERROR_MESSAGE);
        }
        else{
// for Student...            
            try {
                String url = "jdbc:mysql://localhost:3306/student_attendance";
                String username = "Dhanush";
                String password = "Dhanush!1896$";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                stm = con.createStatement();

                qry = "CREATE TABLE " + conCatNow + "( "
                        + "MIS VARCHAR(14) PRIMARY KEY,"
                        + "`1` VARCHAR(1),`2` VARCHAR(1),`3` VARCHAR(1),`4` VARCHAR(1),"
                        + "`5` VARCHAR(1),`6` VARCHAR(1),`7` VARCHAR(1),`8` VARCHAR(1),"
                        + "`9` VARCHAR(1),`10` VARCHAR(1),`11` VARCHAR(1),`12` VARCHAR(1),"
                        + "`13` VARCHAR(1),`14` VARCHAR(1),`15` VARCHAR(1),`16` VARCHAR(1),"
                        + "`17` VARCHAR(1),`18` VARCHAR(1),`19` VARCHAR(1),`20` VARCHAR(1),"
                        + "`21` VARCHAR(1),`22` VARCHAR(1),`23` VARCHAR(1),`24` VARCHAR(1),"
                        + "`25` VARCHAR(1),`26` VARCHAR(1),`27` VARCHAR(1),`28` VARCHAR(1),"
                        + "`29` VARCHAR(1),`30` VARCHAR(1),`31` VARCHAR(1))";
                pt = con.prepareStatement(qry);
                pt.executeUpdate();

// after create table insert ALL MIS...
                qry = "INSERT INTO "+ conCatNow + "(`MIS`) VALUES"
                        + "(?)";

                pt = con.prepareStatement(qry);

                for(int i = 1; i <= 27; i++){
                    pt.setString(1, StuMISGen + stuTemp );
                    pt.executeUpdate();
                    stuTemp++;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
// for Instructor...   
            try {
                String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
                String username = "Dhanush";
                String password = "Dhanush!1896$";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                stm = con.createStatement();

                qry = "CREATE TABLE " + conCatNow + "( "
                        + "ID VARCHAR(15) PRIMARY KEY,"
                        + "`1` VARCHAR(1),`2` VARCHAR(1),`3` VARCHAR(1),`4` VARCHAR(1),"
                        + "`5` VARCHAR(1),`6` VARCHAR(1),`7` VARCHAR(1),`8` VARCHAR(1),"
                        + "`9` VARCHAR(1),`10` VARCHAR(1),`11` VARCHAR(1),`12` VARCHAR(1),"
                        + "`13` VARCHAR(1),`14` VARCHAR(1),`15` VARCHAR(1),`16` VARCHAR(1),"
                        + "`17` VARCHAR(1),`18` VARCHAR(1),`19` VARCHAR(1),`20` VARCHAR(1),"
                        + "`21` VARCHAR(1),`22` VARCHAR(1),`23` VARCHAR(1),`24` VARCHAR(1),"
                        + "`25` VARCHAR(1),`26` VARCHAR(1),`27` VARCHAR(1),`28` VARCHAR(1),"
                        + "`29` VARCHAR(1),`30` VARCHAR(1),`31` VARCHAR(1))";
                pt = con.prepareStatement(qry);
                pt.executeUpdate();

// after create table insert ALL MIS...
                qry = "INSERT INTO "+ conCatNow + "(`ID`) VALUES"
                        + "(?)";

                pt = con.prepareStatement(qry);

                for(int i = 1; i <= 2; i++){
                    pt.setString(1, InsIDGen + InsTemp );
                    pt.executeUpdate();
                    InsTemp++;
                }
            } 
            catch(Exception e){
                e.printStackTrace();                        
            }
            
// update students class days...

            try {
                String url = "jdbc:mysql://localhost:3306/student_attendance";
                String username = "Dhanush";
                String password = "Dhanush!1896$";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                stm = con.createStatement();
                
                qry = "UPDATE classdays SET No_of_Days = " + txtClzDays.getText() + " WHERE Month = '" + conCatNow + "'";
                pt = con.prepareStatement(qry);
                pt.executeUpdate();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
// update instructor class days...
            try {
                String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
                String username = "Dhanush";
                String password = "Dhanush!1896$";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                stm = con.createStatement();
                
                qry = "UPDATE classdays SET No_of_Days = " + txtClzDays.getText() + " WHERE Month = '" + conCatNow + "'";
                pt = con.prepareStatement(qry);
                pt.executeUpdate();                
                                
                JOptionPane.showMessageDialog(null, "Table Created Success");
                dispose();
                new Home();
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
        }  
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        // TODO add your handling code here:        
    }//GEN-LAST:event_jSlider1MouseDragged

    private void jSlider1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jSlider1MouseWheelMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSlider1MouseWheelMoved

    private void jSlider1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSlider1MouseMoved

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        txtClzDays.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    public static void main(String args[]) {
        new ManageAttendance();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblTxt1;
    private javax.swing.JTextField txtClzDays;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
