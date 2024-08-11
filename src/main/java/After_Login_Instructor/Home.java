
package After_Login_Instructor;
/**
 *
 * @author Dhanush
 */

import After_Login_User.STU_Alert;
import Instructor.Login_Instructor;
import javax.swing.border.MatteBorder;
import javax.swing.border.Border;
import java.awt.Color;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.ImageIcon;

import java.util.Date;
import javax.swing.JOptionPane;



public class Home extends javax.swing.JFrame {
    
    public static Color SideBar;
    public static Color body;
    public static Color BodyElements;
    
    public static String profileImgLocation; 
    
    public static String getOpenedUserName;
    
    String getAlertStatus = null; // to Alert..
    
    Border hoverBorder = new MatteBorder(1,1,1,1,Color.WHITE);
    ImageIcon unseen = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\green_circle_20px.png");
    
// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    public static String getTheme;
    public static String getID;
    

// Db Connect for student_management_system..    
    public void dbConnect(){
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

// getting current date and setting mark attendance behaviour...
        Date currentDate = new Date();        
        SimpleDateFormat getHour = new SimpleDateFormat("HH");        
        int temp = Integer.parseInt(getHour.format(currentDate));

// element to generate Students and Instructors MIS and ID                
        Date date = new Date();
        
        SimpleDateFormat nowY = new SimpleDateFormat("yyyy");
        SimpleDateFormat nowM = new SimpleDateFormat("MMMM");
        SimpleDateFormat nowD = new SimpleDateFormat("dd");
        
        String month = nowM.format(date);
        int year = Integer.parseInt(nowY.format(date));
        
        String conCatNow = month + "_" + year;
        
        int tablesC = 0;    // to get the count of the tables
        String tblNames[];  // to store the tables names
        boolean isTable = false; // to check whether the tbl is available
        
// Constructor..    
    public Home() {
        initComponents();        
        dbConnect(); 
               

// getting available attendance tables...  

        try {
            String url = "jdbc:mysql://localhost:3306/student_attendance";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            
            qry = "SHOW TABLES";            // to get tables count
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                tablesC++;
            }
            
            tblNames = new String[tablesC]; // assign the array length..
            
            qry = "SHOW TABLES";        // to store tables names..
            rs = stm.executeQuery(qry);
            
            for(int i = 0; rs.next(); i++){
                tblNames[i] = rs.getString(1);
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

// chk table ..         
        for (int i = 0; i < tblNames.length; i++) {
            if(tblNames[i].equalsIgnoreCase(conCatNow)){
                isTable = true;
            }
        }
        
        if(!isTable){
            btnManageAttendance.setEnabled(true);
            JOptionPane.showMessageDialog(null, conCatNow + " Attendance Table is not created yet!","Attendance Information",JOptionPane.ERROR_MESSAGE);
            msgReminder.setVisible(true);
            btnManageAttendance.setForeground(Color.GREEN);
        }
        else{
            msgReminder.setVisible(false);
            btnManageAttendance.setForeground(Color.WHITE);
            btnManageAttendance.setEnabled(false);
        }
            
        
// getting ID No..
        
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry = "SELECT ID FROM instructor_login_details WHERE userName = '" + Login_Instructor.getUser + "'";
            rs = stm.executeQuery(qry);
            while(rs.next()){
                getID = rs.getString(1);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

// chk whether Alert is there
        try {
            qry = "SELECT Status FROM admin_alert WHERE MsgTo = '" + getID + "'";
            rs = stm.executeQuery(qry);
            while(rs.next()){
                getAlertStatus = rs.getString(1);
            }
        } 
        catch (Exception e) {
            
        } 
        
        if(getAlertStatus.equals(null)){
            
        }
        else if(getAlertStatus.equalsIgnoreCase("unseen")){
            btnAlert.setIcon(unseen);
        }
        else{
            btnAlert.setIcon(null);
        }

// setting lbl and btn Mark attendance behaviour..
        if(temp >= 12){
            mrkAtenTimeUp_lbl.setVisible(true);
            lblMrkAten.setEnabled(false);
            btnMarkAttendance.setEnabled(false);

// set absent(0) to DB... 
            
            LocalDate todayDate = LocalDate.now();
            
            String getMonth = String.valueOf(todayDate.getMonth()).toLowerCase();
            String getYear = String.valueOf(todayDate.getYear());
        
            String concatMonth_Year = getMonth + "_" + getYear;
            String getStatus = null;
                    
            try {
                String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
                String username = "Dhanush";
                String password = "Dhanush!1896$";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                stm = con.createStatement();
                
                qry = "SELECT `" + todayDate.getDayOfMonth() +"` FROM " + concatMonth_Year +
                        " WHERE ID = '" + getID + "'";
                rs = stm.executeQuery(qry);
                
                while(rs.next()){
                    getStatus = rs.getString(1);
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            
            if(getStatus == null){
                try {
                    String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
                    String username = "Dhanush";
                    String password = "Dhanush!1896$";

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(url,username,password);
                    stm = con.createStatement();

                    qry = "UPDATE " + concatMonth_Year + " SET `" 
                        + todayDate.getDayOfMonth() +"` = '0' WHERE ID = '" + getID + "'" ;
                    pt = con.prepareStatement(qry);
                    pt.executeUpdate();
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }          
                            
        }
        else{
            mrkAtenTimeUp_lbl.setVisible(false);
            lblMrkAten.setEnabled(true);
            btnMarkAttendance.setEnabled(true);
        }
                
        lblNotificationCount.setText(null);        
  
// getting the logged user name..
        
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry =   "SELECT Full_Name FROM instructor_login_details INNER JOIN "
                    + "instructor_registration ON instructor_login_details.ID = instructor_registration.ID"
                    + " WHERE userName = '" + Login_Instructor.getUser + "'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
             lbl_userName.setText(rs.getString(1));
             getOpenedUserName = rs.getString(1);
            }           
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

// getting theme...        
        try{
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry = "SELECT Theme FROM instructor_login_details WHERE userName = '" + Login_Instructor.getUser + "'";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getTheme = rs.getString(1);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
                
        if(getTheme.equalsIgnoreCase("default")){
            
            body = new Color(140,140,0);
            SideBar = new Color(100,100,0);
            BodyElements = new Color(180,180,0);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSettings.setBackground(SideBar);
            btnManageAttendance.setBackground(SideBar);
            btn_VIA.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnTestPapers.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements);
            btnNotes.setBackground(BodyElements);
            btn_Assignment.setBackground(BodyElements);
            btnMarkAttendance.setBackground(BodyElements);
            btnViewStuAttendance.setBackground(BodyElements);
            
        }
        else if(getTheme.equalsIgnoreCase("black")){
            
            body = Color.BLACK;
            SideBar = new Color(51,51,51);
            BodyElements = new Color(51,51,51);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSettings.setBackground(SideBar);
            btnManageAttendance.setBackground(SideBar);
            btn_VIA.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnTestPapers.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements);
            btnNotes.setBackground(BodyElements);
            btn_Assignment.setBackground(BodyElements); 
            btnMarkAttendance.setBackground(BodyElements);
            btnViewStuAttendance.setBackground(BodyElements);
        }
        else if(getTheme.equalsIgnoreCase("red")){
            
            body = new Color(102,0,0);
            SideBar = new Color(51,0,0);
            BodyElements = new Color(51,0,0);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSettings.setBackground(SideBar);
            btnManageAttendance.setBackground(SideBar);
            btn_VIA.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnTestPapers.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements);
            btnNotes.setBackground(BodyElements);
            btn_Assignment.setBackground(BodyElements);
            btnMarkAttendance.setBackground(BodyElements);
            btnViewStuAttendance.setBackground(BodyElements);
            
        }

// getting profile icon..        
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            
            qry = "SELECT ProIMG FROM instructor_login_details WHERE userName = '" + Login_Instructor.getUser + "'";
            
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                profileImgLocation = rs.getString(1);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
// manage Attendance...

        Date date = new Date();
        SimpleDateFormat nowY = new SimpleDateFormat("yyyy");
        SimpleDateFormat nowM = new SimpleDateFormat("MMM");
        SimpleDateFormat nowD = new SimpleDateFormat("dd");
        
        System.out.println("");
        

        
        ImageIcon pIcon = new ImageIcon(profileImgLocation);
        
        btnProfileImgHome.setIcon(pIcon);            
        
        sideBarPanel.setVisible(false);
        
        setSize(1000,720);
        setLocationRelativeTo(null);
        
        
        setVisible(true);
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        bgPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSideBar = new javax.swing.JButton();
        sideBarPanel = new javax.swing.JPanel();
        msgReminder = new javax.swing.JLabel();
        btn_sideBarBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnProfileImgHome = new javax.swing.JButton();
        lbl_userName = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        lblNotificationCount = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnManageAttendance = new javax.swing.JButton();
        btn_VIA = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        lblTestPapers = new javax.swing.JLabel();
        lblAlert = new javax.swing.JLabel();
        btnAlert = new javax.swing.JButton();
        btnTestPapers = new javax.swing.JButton();
        lblNotes = new javax.swing.JLabel();
        btnNotes = new javax.swing.JButton();
        lbl_Assignment = new javax.swing.JLabel();
        btnViewStuAttendance = new javax.swing.JButton();
        btn_Assignment = new javax.swing.JButton();
        mrkAtenTimeUp_lbl = new javax.swing.JLabel();
        btnMarkAttendance = new javax.swing.JButton();
        lblVstuAten = new javax.swing.JLabel();
        lblMrkAten = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(140, 140, 0));

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

        btnSideBar.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\menuIcon.png")); // NOI18N
        btnSideBar.setBorder(null);
        btnSideBar.setBorderPainted(false);
        btnSideBar.setContentAreaFilled(false);
        btnSideBar.setFocusable(false);
        btnSideBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSideBarActionPerformed(evt);
            }
        });

        sideBarPanel.setBackground(new java.awt.Color(100, 100, 0));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgReminder.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        msgReminder.setForeground(new java.awt.Color(0, 255, 102));
        msgReminder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgReminder.setText("0");
        sideBarPanel.add(msgReminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        btn_sideBarBack.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\back.png")); // NOI18N
        btn_sideBarBack.setBorder(null);
        btn_sideBarBack.setContentAreaFilled(false);
        btn_sideBarBack.setFocusable(false);
        btn_sideBarBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sideBarBackActionPerformed(evt);
            }
        });
        sideBarPanel.add(btn_sideBarBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 60, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\logOut.png")); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sideBarPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 140, 90));

        btnProfileImgHome.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png")); // NOI18N
        btnProfileImgHome.setBorder(null);
        btnProfileImgHome.setBorderPainted(false);
        btnProfileImgHome.setContentAreaFilled(false);
        btnProfileImgHome.setFocusable(false);
        btnProfileImgHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileImgHomeActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnProfileImgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 146, 121));

        lbl_userName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_userName.setText("UserName");
        sideBarPanel.add(lbl_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 40));

        btnHome.setBackground(new java.awt.Color(100, 100, 0));
        btnHome.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\home.png")); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnHome.setFocusable(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(190);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 288, 40));

        btnSettings.setBackground(new java.awt.Color(100, 100, 0));
        btnSettings.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\setting.png")); // NOI18N
        btnSettings.setText("Settings");
        btnSettings.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnSettings.setFocusable(false);
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSettings.setIconTextGap(160);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 480, 288, 40));

        btnChat.setBackground(new java.awt.Color(100, 100, 0));
        btnChat.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\chat_Icon.png")); // NOI18N
        btnChat.setText("chats");
        btnChat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnChat.setEnabled(false);
        btnChat.setFocusable(false);
        btnChat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChat.setIconTextGap(185);
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 330, 288, 40));

        btnProfile.setBackground(new java.awt.Color(100, 100, 0));
        btnProfile.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\username.png")); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnProfile.setFocusable(false);
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnProfile.setIconTextGap(168);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 380, 288, 40));

        lblNotificationCount.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblNotificationCount.setForeground(new java.awt.Color(255, 0, 0));
        lblNotificationCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotificationCount.setText("0");
        sideBarPanel.add(lblNotificationCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 63, 20, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\notification.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        sideBarPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, 60));

        btnManageAttendance.setBackground(new java.awt.Color(100, 100, 0));
        btnManageAttendance.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnManageAttendance.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAttendance.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\manage_attendance.png")); // NOI18N
        btnManageAttendance.setText("Manage Attendance");
        btnManageAttendance.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btnManageAttendance.setFocusable(false);
        btnManageAttendance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManageAttendance.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnManageAttendance.setIconTextGap(35);
        btnManageAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAttendanceActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnManageAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 280, 288, 40));

        btn_VIA.setBackground(new java.awt.Color(100, 100, 0));
        btn_VIA.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        btn_VIA.setForeground(new java.awt.Color(255, 255, 255));
        btn_VIA.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\people_30px.png")); // NOI18N
        btn_VIA.setText("View Instructor Attendance");
        btn_VIA.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        btn_VIA.setFocusable(false);
        btn_VIA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_VIA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_VIA.setIconTextGap(8);
        btn_VIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VIAbtnSettingActionPerformed(evt);
            }
        });
        sideBarPanel.add(btn_VIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 430, 288, 40));

        bodyPanel.setBackground(new java.awt.Color(140, 140, 0));
        bodyPanel.setFocusable(false);
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTestPapers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestPapers.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\papers_200px.png")); // NOI18N
        lblTestPapers.setFocusable(false);
        lblTestPapers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTestPapersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTestPapersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTestPapersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTestPapersMouseReleased(evt);
            }
        });
        bodyPanel.add(lblTestPapers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 240, 210));

        lblAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlert.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\setAlert1.png")); // NOI18N
        lblAlert.setFocusable(false);
        lblAlert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlertMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAlertMousePressed(evt);
            }
        });
        bodyPanel.add(lblAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 250, 210));

        btnAlert.setBackground(new java.awt.Color(180, 180, 0));
        btnAlert.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnAlert.setForeground(new java.awt.Color(255, 255, 255));
        btnAlert.setText("Alert");
        btnAlert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAlert.setBorderPainted(false);
        btnAlert.setFocusable(false);
        btnAlert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlertMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlertMouseReleased(evt);
            }
        });
        btnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertActionPerformed(evt);
            }
        });
        bodyPanel.add(btnAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 250, 40));

        btnTestPapers.setBackground(new java.awt.Color(180, 180, 0));
        btnTestPapers.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnTestPapers.setForeground(new java.awt.Color(255, 255, 255));
        btnTestPapers.setText("Test Papers");
        btnTestPapers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnTestPapers.setBorderPainted(false);
        btnTestPapers.setFocusable(false);
        btnTestPapers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTestPapersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTestPapersMouseReleased(evt);
            }
        });
        btnTestPapers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPapersActionPerformed(evt);
            }
        });
        bodyPanel.add(btnTestPapers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 240, 40));

        lblNotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotes.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\book_200px.png")); // NOI18N
        lblNotes.setFocusable(false);
        lblNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNotesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNotesMousePressed(evt);
            }
        });
        bodyPanel.add(lblNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 240, 210));

        btnNotes.setBackground(new java.awt.Color(180, 180, 0));
        btnNotes.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnNotes.setForeground(new java.awt.Color(255, 255, 255));
        btnNotes.setText("Share Notes");
        btnNotes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnNotes.setBorderPainted(false);
        btnNotes.setFocusable(false);
        btnNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNotesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNotesMouseReleased(evt);
            }
        });
        btnNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotesActionPerformed(evt);
            }
        });
        bodyPanel.add(btnNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 240, 40));

        lbl_Assignment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Assignment.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\assignment_200px.png")); // NOI18N
        lbl_Assignment.setFocusable(false);
        lbl_Assignment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_AssignmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_AssignmentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_AssignmentMousePressed(evt);
            }
        });
        bodyPanel.add(lbl_Assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 250, 210));

        btnViewStuAttendance.setBackground(new java.awt.Color(180, 180, 0));
        btnViewStuAttendance.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnViewStuAttendance.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStuAttendance.setText(" Student's Attendance");
        btnViewStuAttendance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnViewStuAttendance.setBorderPainted(false);
        btnViewStuAttendance.setFocusable(false);
        btnViewStuAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnViewStuAttendanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnViewStuAttendanceMouseReleased(evt);
            }
        });
        btnViewStuAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStuAttendanceActionPerformed(evt);
            }
        });
        bodyPanel.add(btnViewStuAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 290, 40));

        btn_Assignment.setBackground(new java.awt.Color(180, 180, 0));
        btn_Assignment.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btn_Assignment.setForeground(new java.awt.Color(255, 255, 255));
        btn_Assignment.setText("Assignment / Projects");
        btn_Assignment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_Assignment.setBorderPainted(false);
        btn_Assignment.setFocusable(false);
        btn_Assignment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AssignmentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AssignmentMouseReleased(evt);
            }
        });
        btn_Assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignmentActionPerformed(evt);
            }
        });
        bodyPanel.add(btn_Assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 250, 40));

        mrkAtenTimeUp_lbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mrkAtenTimeUp_lbl.setForeground(new java.awt.Color(255, 51, 51));
        mrkAtenTimeUp_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mrkAtenTimeUp_lbl.setText("Time Up!");
        bodyPanel.add(mrkAtenTimeUp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 275, 70, 30));

        btnMarkAttendance.setBackground(new java.awt.Color(180, 180, 0));
        btnMarkAttendance.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnMarkAttendance.setForeground(new java.awt.Color(255, 255, 255));
        btnMarkAttendance.setText("Mark Attendance");
        btnMarkAttendance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnMarkAttendance.setBorderPainted(false);
        btnMarkAttendance.setFocusable(false);
        btnMarkAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMarkAttendanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMarkAttendanceMouseReleased(evt);
            }
        });
        btnMarkAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAttendanceActionPerformed(evt);
            }
        });
        bodyPanel.add(btnMarkAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 40));

        lblVstuAten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVstuAten.setForeground(new java.awt.Color(255, 255, 255));
        lblVstuAten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVstuAten.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\students.png")); // NOI18N
        lblVstuAten.setFocusable(false);
        lblVstuAten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVstuAtenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVstuAtenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVstuAtenMousePressed(evt);
            }
        });
        bodyPanel.add(lblVstuAten, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 290, 210));

        lblMrkAten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMrkAten.setForeground(new java.awt.Color(255, 255, 255));
        lblMrkAten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMrkAten.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\User After Login\\attendance_200px.png")); // NOI18N
        lblMrkAten.setFocusable(false);
        lblMrkAten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMrkAtenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMrkAtenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMrkAtenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMrkAtenMousePressed(evt);
            }
        });
        bodyPanel.add(lblMrkAten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 210));

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(843, 843, 843)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:  
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseReleased

    private void btnCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMousePressed

    private void btnSideBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSideBarActionPerformed
        // TODO add your handling code here:
        setSize(1200,720);
        setLocationRelativeTo(null);
        sideBarPanel.setVisible(true);
        btnSideBar.setVisible(false);
    }//GEN-LAST:event_btnSideBarActionPerformed

    private void btn_sideBarBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sideBarBackActionPerformed
        // TODO add your handling code here:
        btnSideBar.setVisible(true);
        setSize(1000,720);
        setLocationRelativeTo(null);
        sideBarPanel.setVisible(false);
    }//GEN-LAST:event_btn_sideBarBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Instructor.Login_Instructor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        setSize(1000,720);
        setLocationRelativeTo(null);
        sideBarPanel.setVisible(false);
        btnSideBar.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnProfileImgHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileImgHomeActionPerformed
        // TODO add your handling code here:   
        dispose();
        new ProfileImgsUser();
    }//GEN-LAST:event_btnProfileImgHomeActionPerformed

    private void lblTestPapersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTestPapersMouseEntered
        // TODO add your handling code here:
        lblTestPapers.setBorder(hoverBorder);
    }//GEN-LAST:event_lblTestPapersMouseEntered

    private void lblTestPapersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTestPapersMouseReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_lblTestPapersMouseReleased

    private void lblTestPapersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTestPapersMouseExited
        // TODO add your handling code here:
        lblTestPapers.setBorder(null);
    }//GEN-LAST:event_lblTestPapersMouseExited

    private void lblAlertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMouseEntered
        // TODO add your handling code here:
        lblAlert.setBorder(hoverBorder);
    }//GEN-LAST:event_lblAlertMouseEntered

    private void lblNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotesMouseEntered
        // TODO add your handling code here:
        lblNotes.setBorder(hoverBorder);
    }//GEN-LAST:event_lblNotesMouseEntered

    private void lblAlertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMouseExited
        // TODO add your handling code here:
        lblAlert.setBorder(null);
    }//GEN-LAST:event_lblAlertMouseExited

    private void lblNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotesMouseExited
        // TODO add your handling code here:
        lblNotes.setBorder(null);
    }//GEN-LAST:event_lblNotesMouseExited

    private void btnTestPapersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestPapersMousePressed
        // TODO add your handling code here:
        btnTestPapers.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnTestPapersMousePressed

    private void btnTestPapersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestPapersMouseReleased
        // TODO add your handling code here:
        btnTestPapers.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnTestPapersMouseReleased

    private void btnAlertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlertMousePressed
        // TODO add your handling code here:
        btnAlert.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnAlertMousePressed

    private void btnAlertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlertMouseReleased
        // TODO add your handling code here:
        btnAlert.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAlertMouseReleased

    private void btnNotesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotesMousePressed
        // TODO add your handling code here:
        btnNotes.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNotesMousePressed

    private void btnNotesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotesMouseReleased
        // TODO add your handling code here:
        btnNotes.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnNotesMouseReleased

    private void lblNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotesMouseClicked

    private void btnNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotesActionPerformed
        // TODO add your handling code here:
        dispose();
        new Notes();        
    }//GEN-LAST:event_btnNotesActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        dispose();
        new ProfileImgsUser();
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
        dispose();
        new Settings();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void lbl_AssignmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AssignmentMouseEntered
        // TODO add your handling code here:
        lbl_Assignment.setBorder(hoverBorder);
    }//GEN-LAST:event_lbl_AssignmentMouseEntered

    private void lbl_AssignmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AssignmentMouseExited
        // TODO add your handling code here:
        lbl_Assignment.setBorder(null);
    }//GEN-LAST:event_lbl_AssignmentMouseExited

    private void btnViewStuAttendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStuAttendanceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStuAttendanceMousePressed

    private void btnViewStuAttendanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStuAttendanceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStuAttendanceMouseReleased

    private void lblVstuAtenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVstuAtenMouseEntered
        // TODO add your handling code here:
        lblVstuAten.setBorder(hoverBorder);
    }//GEN-LAST:event_lblVstuAtenMouseEntered

    private void lblVstuAtenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVstuAtenMouseExited
        // TODO add your handling code here:
        lblVstuAten.setBorder(null);
    }//GEN-LAST:event_lblVstuAtenMouseExited

    private void lblMrkAtenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMrkAtenMouseEntered
        // TODO add your handling code here:
        lblMrkAten.setBorder(hoverBorder);
    }//GEN-LAST:event_lblMrkAtenMouseEntered

    private void lblMrkAtenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMrkAtenMouseExited
        // TODO add your handling code here:
        lblMrkAten.setBorder(null);
    }//GEN-LAST:event_lblMrkAtenMouseExited

    private void btn_AssignmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AssignmentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AssignmentMousePressed

    private void btn_AssignmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AssignmentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AssignmentMouseReleased

    private void btnMarkAttendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarkAttendanceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarkAttendanceMousePressed

    private void btnMarkAttendanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarkAttendanceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarkAttendanceMouseReleased

    private void lblTestPapersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTestPapersMousePressed
        // TODO add your handling code here:
        dispose();
        new TestPapers();
    }//GEN-LAST:event_lblTestPapersMousePressed

    private void btnTestPapersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPapersActionPerformed
        // TODO add your handling code here:
        dispose();
        new TestPapers();
    }//GEN-LAST:event_btnTestPapersActionPerformed

    private void lblNotesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotesMousePressed
        // TODO add your handling code here:
        dispose();
        new Notes();
    }//GEN-LAST:event_lblNotesMousePressed

    private void lblAlertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMousePressed
        // TODO add your handling code here:
        dispose();
        new INS_Alert();
    }//GEN-LAST:event_lblAlertMousePressed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertActionPerformed
        // TODO add your handling code here:
        dispose();
        new INS_Alert();
    }//GEN-LAST:event_btnAlertActionPerformed

    private void lblMrkAtenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMrkAtenMousePressed
        // TODO add your handling code here:  
        if(temp >= 12){
            
        }
        else{
            dispose();
            new MarkAttendance();
        }
    }//GEN-LAST:event_lblMrkAtenMousePressed

    private void btnMarkAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAttendanceActionPerformed
        // TODO add your handling code here:
        if(temp >= 12){
            
        }
        else{
            dispose();
            new MarkAttendance();
        }
    }//GEN-LAST:event_btnMarkAttendanceActionPerformed

    private void lblVstuAtenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVstuAtenMousePressed
        // TODO add your handling code here:
        dispose();
        new ViewStuAttendance();
    }//GEN-LAST:event_lblVstuAtenMousePressed

    private void btnViewStuAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStuAttendanceActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewStuAttendance();
    }//GEN-LAST:event_btnViewStuAttendanceActionPerformed

    private void btn_AssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignmentActionPerformed
        // TODO add your handling code here:
        dispose();
        new Assignments();
    }//GEN-LAST:event_btn_AssignmentActionPerformed

    private void lblMrkAtenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMrkAtenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMrkAtenMouseClicked

    private void lbl_AssignmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AssignmentMousePressed
        // TODO add your handling code here:
        dispose();  
        new Assignments();
    }//GEN-LAST:event_lbl_AssignmentMousePressed

    private void btnManageAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAttendanceActionPerformed
        // TODO add your handling code here:
        dispose();
        new ManageAttendance();
    }//GEN-LAST:event_btnManageAttendanceActionPerformed

    private void btn_VIAbtnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VIAbtnSettingActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewINSAttendance();
    }//GEN-LAST:event_btn_VIAbtnSettingActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        // TODO add your handling code here:
        dispose();
        new ChatINS();
    }//GEN-LAST:event_btnChatActionPerformed

    public static void main(String args[]) {      
        new Home();   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    public javax.swing.JPanel bodyPanel;
    public static javax.swing.JButton btnAlert;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnManageAttendance;
    public javax.swing.JButton btnMarkAttendance;
    public javax.swing.JButton btnNotes;
    private javax.swing.JButton btnProfile;
    public static javax.swing.JButton btnProfileImgHome;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnSideBar;
    public javax.swing.JButton btnTestPapers;
    public javax.swing.JButton btnViewStuAttendance;
    public javax.swing.JButton btn_Assignment;
    private javax.swing.JButton btn_VIA;
    private javax.swing.JButton btn_sideBarBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblMrkAten;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblNotificationCount;
    private javax.swing.JLabel lblTestPapers;
    private javax.swing.JLabel lblVstuAten;
    private javax.swing.JLabel lbl_Assignment;
    public static javax.swing.JLabel lbl_userName;
    private javax.swing.JLabel mrkAtenTimeUp_lbl;
    private javax.swing.JLabel msgReminder;
    public javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
