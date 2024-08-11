
package After_Login_User;

/**
 *
 * @author Dhanush
 */

import User.LoginUser;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.sql.*;

public class ProfileImgsUser extends javax.swing.JFrame implements ActionListener{
    
    Image p1 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\1.png").getImage();
    Image p2 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\2.png").getImage();
    Image p3 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\3.png").getImage();
    Image p4 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\4.png").getImage();
    Image p5 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\5.png").getImage();
    Image p6 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\6.png").getImage();

    Image p7 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\7.png").getImage();
    Image p8 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\8.png").getImage();
    Image p9 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\9.png").getImage();
    Image p10 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\10.png").getImage();
    Image p11 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\11.png").getImage();
    Image p12 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\12.png").getImage();

    String getLp1 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\1.png";
    String getLp2 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\2.png";
    String getLp3 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\3.png";
    String getLp4 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\4.png";
    String getLp5 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\5.png";
    String getLp6 ="D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\6.png";

    String getLp7 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\7.png";
    String getLp8 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\8.png";
    String getLp9 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\9.png";
    String getLp10 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\10.png";
    String getLp11 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\11.png";
    String getLp12 = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\12.png";

    int getImgNo = 0;
    
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
  
// Db Connect..    
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

    public ProfileImgsUser() {
        initComponents();
        
        dbConnect();
        
        ImageIcon pIcon = new ImageIcon(Home.profileImgLocation);
        
        btnProfileImg.setIcon(pIcon);
                        
        btn1 = new JButton();
        btn1.setIcon(new ImageIcon(p1));
        btn1.setBorder(null);
        btn1.setBackground(Color.WHITE);
        btn1.addActionListener(this);
        
        btn2 = new JButton();
        btn2.setIcon(new ImageIcon(p2));
        btn2.setBorder(null);
        btn2.setBackground(Color.WHITE);
        btn2.addActionListener(this);
        
        btn3 = new JButton();
        btn3.setIcon(new ImageIcon(p3));
        btn3.setBorder(null);
        btn3.setBackground(Color.WHITE);
        btn3.addActionListener(this);
        
        btn4 = new JButton();
        btn4.setIcon(new ImageIcon(p4));
        btn4.setBorder(null);
        btn4.setBackground(Color.WHITE);
        btn4.addActionListener(this);
        
        btn5 = new JButton();
        btn5.setIcon(new ImageIcon(p5));
        btn5.setBorder(null);
        btn5.setBackground(Color.WHITE);
        btn5.addActionListener(this);
        
        btn6 = new JButton();
        btn6.setIcon(new ImageIcon(p6));
        btn6.setBorder(null);
        btn6.setBackground(Color.WHITE);
        btn6.addActionListener(this);      
        
        btn7 = new JButton();
        btn7.setIcon(new ImageIcon(p7));
        btn7.setBorder(null);
        btn7.setBackground(Color.WHITE);
        btn7.addActionListener(this);
        
        btn8 = new JButton();
        btn8.setIcon(new ImageIcon(p8));
        btn8.setBorder(null);
        btn8.setBackground(Color.WHITE);
        btn8.addActionListener(this);
        
        btn9 = new JButton();
        btn9.setIcon(new ImageIcon(p9));
        btn9.setBorder(null);
        btn9.setBackground(Color.WHITE);
        btn9.addActionListener(this);
        
        btn10 = new JButton();
        btn10.setIcon(new ImageIcon(p10));
        btn10.setBorder(null);
        btn10.setBackground(Color.WHITE);
        btn10.addActionListener(this);
        
        btn11 = new JButton();
        btn11.setIcon(new ImageIcon(p11));
        btn11.setBorder(null);
        btn11.setBackground(Color.WHITE);
        btn11.addActionListener(this);
        
        btn12 = new JButton();
        btn12.setIcon(new ImageIcon(p12));
        btn12.setBorder(null);
        btn12.setBackground(Color.WHITE);
        btn12.addActionListener(this);
        
        
        imgsContainerPanel.add(btn1);
        imgsContainerPanel.add(btn2);
        imgsContainerPanel.add(btn3);
        imgsContainerPanel.add(btn4);
        imgsContainerPanel.add(btn5);
        imgsContainerPanel.add(btn6);
        
        imgsContainerPanel.add(btn7);
        imgsContainerPanel.add(btn8);
        imgsContainerPanel.add(btn9);
        imgsContainerPanel.add(btn10);
        imgsContainerPanel.add(btn11);
        imgsContainerPanel.add(btn12);
   
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){        
        
        if(e.getSource() == btn1){
            btnProfileImg.setIcon(new ImageIcon (p1));
            getImgNo = 1;
        }
        else if(e.getSource() == btn2){
            btnProfileImg.setIcon(new ImageIcon(p2));
            getImgNo = 2;
        }
        else if(e.getSource() == btn3){
            btnProfileImg.setIcon(new ImageIcon(p3));
            getImgNo = 3;
        }
        else if(e.getSource() == btn4){
            btnProfileImg.setIcon(new ImageIcon(p4));
           getImgNo = 4;
        }
        else if(e.getSource() == btn5){
            btnProfileImg.setIcon(new ImageIcon(p5));
            getImgNo = 5;
        }
        else if(e.getSource() == btn6){
            btnProfileImg.setIcon(new ImageIcon(p6));
            getImgNo = 6;
        }
        else if(e.getSource() == btn7){
            btnProfileImg.setIcon(new ImageIcon(p7));
            getImgNo = 7;
        }
        else if(e.getSource() == btn8){
            btnProfileImg.setIcon(new ImageIcon(p8));
            getImgNo = 8;
        }
        else if(e.getSource() == btn9){
            btnProfileImg.setIcon(new ImageIcon(p9));
            getImgNo = 9;            
        }
        else if(e.getSource() == btn10){
            btnProfileImg.setIcon(new ImageIcon(p10));
            getImgNo = 10;
        }
        else if(e.getSource() == btn11){
            btnProfileImg.setIcon(new ImageIcon(p11));
            getImgNo = 11;
        }
        else if(e.getSource() == btn12){
            btnProfileImg.setIcon(new ImageIcon(p12));
            getImgNo = 12;
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Pannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imgsContainerPanel = new javax.swing.JPanel();
        btnProfileImg = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_Pannel.setBackground(new java.awt.Color(255, 255, 255));
        bg_Pannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        imgsContainerPanel.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(imgsContainerPanel);

        bg_Pannel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 700, 160));

        btnProfileImg.setBackground(new java.awt.Color(51, 51, 51));
        btnProfileImg.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png")); // NOI18N
        btnProfileImg.setBorder(null);
        btnProfileImg.setBorderPainted(false);
        btnProfileImg.setFocusable(false);
        bg_Pannel.add(btnProfileImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 150));

        btnback.setBackground(new java.awt.Color(153, 153, 153));
        btnback.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\backBlue.png")); // NOI18N
        btnback.setBorder(null);
        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.setFocusable(false);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        bg_Pannel.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 40));

        btnSave.setBackground(new java.awt.Color(153, 153, 153));
        btnSave.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setFocusable(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        bg_Pannel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 90, 40));

        btnRemove1.setBackground(new java.awt.Color(153, 153, 153));
        btnRemove1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btnRemove1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove1.setText("Remove");
        btnRemove1.setBorder(null);
        btnRemove1.setBorderPainted(false);
        btnRemove1.setFocusable(false);
        btnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove1ActionPerformed(evt);
            }
        });
        bg_Pannel.add(btnRemove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Profile Icon Removed","Profile Information",JOptionPane.INFORMATION_MESSAGE);

        qry = "UPDATE student_login_details SET ProIMG = ? WHERE userName = '" + LoginUser.getUser + "'";
        
        btnProfileImg.setIcon(new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png"));
        
        try {
            pt = con.prepareStatement(qry);
            pt.setString(1, "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png");
            pt.executeUpdate();

            dispose();
            new Home();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
                        
    }//GEN-LAST:event_btnRemove1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        for(int i = 1; i <= 12; i++){
            if(getImgNo == i){
                try{
                    qry = "UPDATE student_login_details SET ProIMG = ? WHERE userName = '" + LoginUser.getUser +"'";
                    pt = con.prepareStatement(qry);
                    pt.setString(1, "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\"+ i +".png");
                    pt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Profile Updated","Profile Information",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Home();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        new ProfileImgsUser();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_Pannel;
    private javax.swing.JButton btnProfileImg;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnback;
    private javax.swing.JPanel imgsContainerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
