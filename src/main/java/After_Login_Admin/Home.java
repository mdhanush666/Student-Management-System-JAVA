
package After_Login_Admin;
/**
 *
 * @author Dhanush
 */

import javax.swing.border.MatteBorder;
import javax.swing.border.Border;
import java.awt.Color;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {
    
    public static Color SideBar;
    public static Color body;
    public static Color BodyElements;
    
    public static String profileImgLocation;  
    
    Border hoverBorder = new MatteBorder(1,1,1,1,Color.WHITE);
    
// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;
    
    public static String getTheme;

// Today's Present set elements..    
    String monthString = "";
    int resultStu = 0, totStu = 0, resultINS = 0, totINS = 0;

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

// Constructor..    
    public Home() {
        initComponents();        
        dbConnect();     
        
        lblNotificationCount.setText(null);

// getting theme...        
        try{
            qry = "SELECT Theme FROM admin_profile";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                getTheme = rs.getString(1);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
                
        if(getTheme.equalsIgnoreCase("blue")){
            
            body = new Color(0,0,204);
            SideBar = new Color(0,0,102);
            BodyElements = new Color(0,0,153);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSetting.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnVSA.setBackground(BodyElements);
            btnVIA.setBackground(BodyElements);
            btnMI.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements);
            btnTodayStu.setBackground(BodyElements);
            btnTodayIns.setBackground(BodyElements);
            
        }
        else if(getTheme.equalsIgnoreCase("black")){
            
            body = Color.BLACK;
            SideBar = new Color(51,51,51);
            BodyElements = new Color(51,51,51);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSetting.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnVSA.setBackground(BodyElements);
            btnVIA.setBackground(BodyElements);
            btnMI.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements); 
            btnTodayStu.setBackground(BodyElements);
            btnTodayIns.setBackground(BodyElements);
        }
        else if(getTheme.equalsIgnoreCase("default")){
            
            body = new Color(102,0,0);
            SideBar = new Color(51,0,0);
            BodyElements = new Color(51,0,0);
            
            sideBarPanel.setBackground(SideBar);
            btnHome.setBackground(SideBar);
            btnChat.setBackground(SideBar);
            btnProfile.setBackground(SideBar);
            btnSetting.setBackground(SideBar);
            
            bgPanel.setBackground(body);
            bodyPanel.setBackground(body);
            
            btnVSA.setBackground(BodyElements);
            btnVIA.setBackground(BodyElements);
            btnMI.setBackground(BodyElements);
            btnAlert.setBackground(BodyElements);
            btnTodayStu.setBackground(BodyElements);
            btnTodayIns.setBackground(BodyElements);
            
        }

// getting profile icon..        
        try {
            qry = "SELECT IMG FROM admin_profile WHERE PID = 1";
            
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                profileImgLocation = rs.getString(1);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        ImageIcon pIcon = new ImageIcon(profileImgLocation);
        
        btnProfileImgHome.setIcon(pIcon);            
        
        sideBarPanel.setVisible(false);
        
        setSize(1000,720);
        setLocationRelativeTo(null);
        
        
// getting current year and month..

        DateTimeFormatter dtfMonth = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter dtfYear = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter dtfDay = DateTimeFormatter.ofPattern("dd");
        
        
        LocalDate now = LocalDate.now();

// getting current month and year as Integer type..        
        int MonthInt    = Integer.parseInt(dtfMonth.format(now));
        int YearInt     = Integer.parseInt(dtfYear.format(now));
        int DayInt      = Integer.parseInt(dtfDay.format(now));
        
        
// chking the month and assigning the correct month name..
        
        String arrMonth[] = {
            "january_","february_","march_","april_","may_","june_","july_","august_",
            "september_","october_","november_","december_"
        };
        
        for(int i = 1; i <= 12; i++){
            if(MonthInt == i){
                monthString = arrMonth[i-1];
            }
        }

// Connect DB Student_Attendance...
        try {
            String url = "jdbc:mysql://localhost:3306/student_attendance";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();

// Set Today's Present Count            
            qry = "SELECT MIS FROM " + monthString + YearInt + " WHERE `" + DayInt + "` = '1'";
                    
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                resultStu++;
            }
            
// getting total student count..
            qry = "SELECT COUNT(MIS) FROM " + monthString + YearInt;
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                totStu = rs.getInt(1);
            }            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
// Connect DB Student_Instructor_Attendance...
        try {
            String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
            String username = "Dhanush";
            String password = "Dhanush!1896$";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();

// Set Today's Present Count            
            qry = "SELECT ID FROM " + monthString + YearInt + " WHERE `" + DayInt + "` = '1'";
                    
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                resultINS++;
            }
            
// getting total student count..
            qry = "SELECT COUNT(ID) FROM " + monthString + YearInt;
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                totINS = rs.getInt(1);
            }            
        }
        catch (Exception e) {
            e.printStackTrace();
        }

// Set the Result...        
        btnTodayStu.setText(String.valueOf(resultStu) + " / " + String.valueOf(totStu));
        btnTodayIns.setText(String.valueOf(resultINS) + " / " + String.valueOf(totINS));
        
        
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
        btn_sideBarBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnProfileImgHome = new javax.swing.JButton();
        lbl_userName = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        lblNotificationCount = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        lblVSA = new javax.swing.JLabel();
        lblVIA = new javax.swing.JLabel();
        btnVIA = new javax.swing.JButton();
        btnVSA = new javax.swing.JButton();
        lblMI = new javax.swing.JLabel();
        btnMI = new javax.swing.JButton();
        lblAlert = new javax.swing.JLabel();
        btnTodayIns = new javax.swing.JButton();
        btnAlert = new javax.swing.JButton();
        btnTodayStu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIns = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblStu = new javax.swing.JLabel();

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

        bgPanel.setBackground(new java.awt.Color(102, 0, 0));

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

        sideBarPanel.setBackground(new java.awt.Color(51, 0, 0));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbl_userName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_userName.setText("Admin");
        sideBarPanel.add(lbl_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 30));

        btnHome.setBackground(new java.awt.Color(51, 0, 0));
        btnHome.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\home.png")); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnHome.setFocusable(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 280, 288, 40));

        btnSetting.setBackground(new java.awt.Color(51, 0, 0));
        btnSetting.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\setting.png")); // NOI18N
        btnSetting.setText("Settings");
        btnSetting.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnSetting.setFocusable(false);
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 430, 288, 40));

        btnChat.setBackground(new java.awt.Color(51, 0, 0));
        btnChat.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\chat_Icon.png")); // NOI18N
        btnChat.setText("chats");
        btnChat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnChat.setEnabled(false);
        btnChat.setFocusable(false);
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });
        sideBarPanel.add(btnChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 330, 288, 40));

        btnProfile.setBackground(new java.awt.Color(51, 0, 0));
        btnProfile.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\username.png")); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnProfile.setFocusable(false);
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

        bodyPanel.setBackground(new java.awt.Color(102, 0, 0));
        bodyPanel.setFocusable(false);
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVSA.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Attendance1.png")); // NOI18N
        lblVSA.setFocusable(false);
        lblVSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVSAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVSAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVSAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVSAMouseReleased(evt);
            }
        });
        bodyPanel.add(lblVSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 240, 210));

        lblVIA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVIA.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Attendance Teachers.png")); // NOI18N
        lblVIA.setFocusable(false);
        lblVIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVIAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVIAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVIAMousePressed(evt);
            }
        });
        bodyPanel.add(lblVIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 250, 210));

        btnVIA.setBackground(new java.awt.Color(51, 0, 0));
        btnVIA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnVIA.setForeground(new java.awt.Color(255, 255, 255));
        btnVIA.setText("View Instructors Attendance");
        btnVIA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnVIA.setBorderPainted(false);
        btnVIA.setFocusable(false);
        btnVIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVIAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVIAMouseReleased(evt);
            }
        });
        btnVIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIAActionPerformed(evt);
            }
        });
        bodyPanel.add(btnVIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 250, 40));

        btnVSA.setBackground(new java.awt.Color(51, 0, 0));
        btnVSA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnVSA.setForeground(new java.awt.Color(255, 255, 255));
        btnVSA.setText("View Students Attendance");
        btnVSA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnVSA.setBorderPainted(false);
        btnVSA.setFocusable(false);
        btnVSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVSAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVSAMouseReleased(evt);
            }
        });
        btnVSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVSAActionPerformed(evt);
            }
        });
        bodyPanel.add(btnVSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 240, 40));

        lblMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMI.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Add Instructors1.png")); // NOI18N
        lblMI.setFocusable(false);
        lblMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMIMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMIMousePressed(evt);
            }
        });
        bodyPanel.add(lblMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 240, 210));

        btnMI.setBackground(new java.awt.Color(51, 0, 0));
        btnMI.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnMI.setForeground(new java.awt.Color(255, 255, 255));
        btnMI.setText("Add, Update, Delete Instructor");
        btnMI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnMI.setBorderPainted(false);
        btnMI.setFocusable(false);
        btnMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMIMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMIMouseReleased(evt);
            }
        });
        btnMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMIActionPerformed(evt);
            }
        });
        bodyPanel.add(btnMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 240, 40));

        lblAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlert.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\setAlert1.png")); // NOI18N
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
        bodyPanel.add(lblAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 250, 210));

        btnTodayIns.setBackground(new java.awt.Color(51, 0, 0));
        btnTodayIns.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnTodayIns.setForeground(new java.awt.Color(255, 255, 255));
        btnTodayIns.setText("INSTRUCTORS - 2/2");
        btnTodayIns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnTodayIns.setBorderPainted(false);
        btnTodayIns.setFocusable(false);
        btnTodayIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTodayInsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTodayInsMouseReleased(evt);
            }
        });
        btnTodayIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodayInsActionPerformed(evt);
            }
        });
        bodyPanel.add(btnTodayIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 290, 40));

        btnAlert.setBackground(new java.awt.Color(51, 0, 0));
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
        bodyPanel.add(btnAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 250, 40));

        btnTodayStu.setBackground(new java.awt.Color(51, 0, 0));
        btnTodayStu.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnTodayStu.setForeground(new java.awt.Color(255, 255, 255));
        btnTodayStu.setText("STUDENTS - 20/24");
        btnTodayStu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnTodayStu.setBorderPainted(false);
        btnTodayStu.setFocusable(false);
        btnTodayStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTodayStuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTodayStuMouseReleased(evt);
            }
        });
        btnTodayStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodayStuActionPerformed(evt);
            }
        });
        bodyPanel.add(btnTodayStu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 40));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Today Present..");
        bodyPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 180, 30));

        lblIns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIns.setForeground(new java.awt.Color(255, 255, 255));
        lblIns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIns.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\teachers.png")); // NOI18N
        lblIns.setFocusable(false);
        lblIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInsMousePressed(evt);
            }
        });
        bodyPanel.add(lblIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 290, 210));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Today Present..");
        bodyPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        lblStu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStu.setForeground(new java.awt.Color(255, 255, 255));
        lblStu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStu.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\students.png")); // NOI18N
        lblStu.setFocusable(false);
        lblStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblStuMousePressed(evt);
            }
        });
        bodyPanel.add(lblStu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 210));

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
        new Admin.Login();
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
        new ProfileImgsAdmin();
    }//GEN-LAST:event_btnProfileImgHomeActionPerformed

    private void lblVSAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVSAMouseEntered
        // TODO add your handling code here:
        lblVSA.setBorder(hoverBorder);
    }//GEN-LAST:event_lblVSAMouseEntered

    private void lblVSAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVSAMouseReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_lblVSAMouseReleased

    private void lblVSAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVSAMouseExited
        // TODO add your handling code here:
        lblVSA.setBorder(null);
    }//GEN-LAST:event_lblVSAMouseExited

    private void lblVIAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVIAMouseEntered
        // TODO add your handling code here:
        lblVIA.setBorder(hoverBorder);
    }//GEN-LAST:event_lblVIAMouseEntered

    private void lblMIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMIMouseEntered
        // TODO add your handling code here:
        lblMI.setBorder(hoverBorder);
    }//GEN-LAST:event_lblMIMouseEntered

    private void lblVIAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVIAMouseExited
        // TODO add your handling code here:
        lblVIA.setBorder(null);
    }//GEN-LAST:event_lblVIAMouseExited

    private void lblMIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMIMouseExited
        // TODO add your handling code here:
        lblMI.setBorder(null);
    }//GEN-LAST:event_lblMIMouseExited

    private void btnVSAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVSAMousePressed
        // TODO add your handling code here:
        btnVSA.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnVSAMousePressed

    private void btnVSAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVSAMouseReleased
        // TODO add your handling code here:
        btnVSA.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnVSAMouseReleased

    private void btnVIAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVIAMousePressed
        // TODO add your handling code here:
        btnVIA.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnVIAMousePressed

    private void btnVIAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVIAMouseReleased
        // TODO add your handling code here:
        btnVIA.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnVIAMouseReleased

    private void btnMIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMIMousePressed
        // TODO add your handling code here:
        btnMI.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnMIMousePressed

    private void btnMIMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMIMouseReleased
        // TODO add your handling code here:
        btnMI.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMIMouseReleased

    private void lblMIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMIMouseClicked

    private void btnMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMIActionPerformed
        // TODO add your handling code here:
        dispose();
        new ManipulateINS();
    }//GEN-LAST:event_btnMIActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        dispose();
        new ProfileImgsAdmin();
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
        dispose();
        new Settings();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void lblAlertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMouseEntered
        // TODO add your handling code here:
        lblAlert.setBorder(hoverBorder);
    }//GEN-LAST:event_lblAlertMouseEntered

    private void lblAlertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMouseExited
        // TODO add your handling code here:
        lblAlert.setBorder(null);
    }//GEN-LAST:event_lblAlertMouseExited

    private void btnTodayInsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodayInsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodayInsMousePressed

    private void btnTodayInsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodayInsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodayInsMouseReleased

    private void lblInsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsMouseEntered
        // TODO add your handling code here:
        lblIns.setBorder(hoverBorder);
    }//GEN-LAST:event_lblInsMouseEntered

    private void lblInsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsMouseExited
        // TODO add your handling code here:
        lblIns.setBorder(null);
    }//GEN-LAST:event_lblInsMouseExited

    private void lblStuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStuMouseEntered
        // TODO add your handling code here:
        lblStu.setBorder(hoverBorder);
    }//GEN-LAST:event_lblStuMouseEntered

    private void lblStuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStuMouseExited
        // TODO add your handling code here:
        lblStu.setBorder(null);
    }//GEN-LAST:event_lblStuMouseExited

    private void btnAlertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlertMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlertMousePressed

    private void btnAlertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlertMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlertMouseReleased

    private void btnTodayStuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodayStuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodayStuMousePressed

    private void btnTodayStuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodayStuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodayStuMouseReleased

    private void lblVSAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVSAMousePressed
        // TODO add your handling code here:
        dispose();
        new ViewStuAttendance();
    }//GEN-LAST:event_lblVSAMousePressed

    private void btnVSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVSAActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewStuAttendance();
    }//GEN-LAST:event_btnVSAActionPerformed

    private void lblMIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMIMousePressed
        // TODO add your handling code here:
        dispose();
        new ManipulateINS();
    }//GEN-LAST:event_lblMIMousePressed

    private void lblVIAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVIAMousePressed
        // TODO add your handling code here:
        dispose();
        new ViewINSAttendance();
    }//GEN-LAST:event_lblVIAMousePressed

    private void btnVIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIAActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewINSAttendance();
    }//GEN-LAST:event_btnVIAActionPerformed

    private void lblStuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStuMousePressed
        // TODO add your handling code here:
        dispose();
        new todayPresentStu();
    }//GEN-LAST:event_lblStuMousePressed

    private void btnTodayStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodayStuActionPerformed
        // TODO add your handling code here:
        dispose();
        new todayPresentStu();
    }//GEN-LAST:event_btnTodayStuActionPerformed

    private void lblInsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsMousePressed
        // TODO add your handling code here:
        dispose();
        new todayPresentINS();
    }//GEN-LAST:event_lblInsMousePressed

    private void btnTodayInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodayInsActionPerformed
        // TODO add your handling code here:
        dispose();
        new todayPresentINS();
    }//GEN-LAST:event_btnTodayInsActionPerformed

    private void lblAlertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertMousePressed
        // TODO add your handling code here:
        dispose();
        new Admin_Alert();
    }//GEN-LAST:event_lblAlertMousePressed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertActionPerformed
        // TODO add your handling code here:
        dispose();
        new Admin_Alert();
    }//GEN-LAST:event_btnAlertActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        // TODO add your handling code here:
        dispose();
        new ChatAdmin();
    }//GEN-LAST:event_btnChatActionPerformed

    public static void main(String args[]) {      
        new Home();   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    public javax.swing.JPanel bodyPanel;
    public javax.swing.JButton btnAlert;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    public javax.swing.JButton btnMI;
    private javax.swing.JButton btnProfile;
    public static javax.swing.JButton btnProfileImgHome;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnSideBar;
    public javax.swing.JButton btnTodayIns;
    public javax.swing.JButton btnTodayStu;
    public javax.swing.JButton btnVIA;
    public javax.swing.JButton btnVSA;
    private javax.swing.JButton btn_sideBarBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblIns;
    private javax.swing.JLabel lblMI;
    private javax.swing.JLabel lblNotificationCount;
    private javax.swing.JLabel lblStu;
    private javax.swing.JLabel lblVIA;
    private javax.swing.JLabel lblVSA;
    private javax.swing.JLabel lbl_userName;
    public javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
