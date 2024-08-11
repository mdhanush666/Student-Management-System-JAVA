package User;

/**
 *
 * @author Dhanush
 */

import java.awt.Color;
import java.sql.*;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class UserRegister extends javax.swing.JFrame {
    
    Border lock_border = new MatteBorder(0, 0, 2, 0, Color.GRAY);
    
    public static boolean lockStatus = false;

    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    String qry = null;

    String url = "jdbc:mysql://localhost:3306/student_management_system";
    String username = "Dhanush";
    String password = "Dhanush!1896$";

    ImageIcon icon1 = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\face5.png");

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
    LocalDateTime now = LocalDateTime.now();

    public static String Panel1TempMIS,Panel1TempName,Panel1TempAddress;
    
    public static String tempDD,tempMM,tempYYYY,tempMail,tempGen,tempContactNo;
    
    Border none = new MatteBorder(0, 0, 0, 0, new Color(238, 238, 238));

    int currentYear = Integer.parseInt(dtf.format(now)); // geting current year as a int type

    String emailArr[];
    
    void dbConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            //System.out.println("Db Connect success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

// Constructor..    
    public UserRegister() {
        initComponents();

        dbConnector();
        String temp = null;
        int misPrint;
        
// getting registered emails count..
        try{
            qry = "SELECT COUNT(Email) FROM student_registration";
            rs = stm.executeQuery(qry);
            while(rs.next()){
                emailArr = new String[rs.getInt(1)];
            }
        }        
        catch(Exception e){
            System.out.println(e);
        }
// getting registered email..        
        try{
            qry = "SELECT Email FROM student_registration";
            rs = stm.executeQuery(qry);
            int tempCount1 = 0;
            while(rs.next()){
                emailArr[tempCount1] = rs.getString(1);
                tempCount1++;
            }
        }        
        catch(Exception e){
            System.out.println(e);
        }       

// getting mis number to print in the Frame        
        try {
            qry = "SELECT MIS_No FROM student_registration ORDER BY (Mis_No)ASC";
            rs = stm.executeQuery(qry);
            while (rs.next()) {
                temp = (rs.getString(1));
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        misPrint = Integer.parseInt(temp.substring(9));
        txtMisNo.setText("JK23ICT5D" + (misPrint + 1));

        Panel2.setVisible(false);

        for (int i = 1; i < 32; i++) {
            cmbDD.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cmbMM.addItem(String.valueOf(i));
        }
        for (int i = 1990; i <= currentYear; i++) {
            cmbYYYY.addItem(String.valueOf(i));
        }

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMisNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_close1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rdbM = new javax.swing.JRadioButton();
        rdbF = new javax.swing.JRadioButton();
        cmbDD = new javax.swing.JComboBox<>();
        cmbMM = new javax.swing.JComboBox<>();
        cmbYYYY = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_Icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(238, 238, 238));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION");

        btn_close.setBackground(new java.awt.Color(110, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(51, 51, 51));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setContentAreaFilled(false);
        btn_close.setFocusable(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MIS No");

        txtMisNo.setEditable(false);
        txtMisNo.setBackground(new java.awt.Color(238, 238, 238));
        txtMisNo.setForeground(new java.awt.Color(0, 0, 0));
        txtMisNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtMisNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMisNoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FULL NAME");

        txtFullName.setBackground(new java.awt.Color(238, 238, 238));
        txtFullName.setForeground(new java.awt.Color(0, 0, 0));
        txtFullName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("ADDRESS");

        txtAddress.setBackground(new java.awt.Color(238, 238, 238));
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMisNo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMisNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnNext.setBackground(new java.awt.Color(36, 124, 140));
        btnNext.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(36, 124, 140));
        btnClear.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setBorderPainted(false);
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 390, 500));

        Panel2.setBackground(new java.awt.Color(238, 238, 238));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRATION");
        Panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 378, 73));

        btn_close1.setBackground(new java.awt.Color(110, 0, 0));
        btn_close1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        btn_close1.setForeground(new java.awt.Color(51, 51, 51));
        btn_close1.setText("X");
        btn_close1.setBorder(null);
        btn_close1.setContentAreaFilled(false);
        btn_close1.setFocusable(false);
        btn_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close1ActionPerformed(evt);
            }
        });
        Panel2.add(btn_close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, 41, -1));

        jPanel5.setBackground(new java.awt.Color(238, 238, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Gender");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DOB");

        buttonGroupGender.add(rdbM);
        rdbM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbM.setForeground(new java.awt.Color(0, 0, 0));
        rdbM.setText("Male");
        rdbM.setContentAreaFilled(false);
        rdbM.setFocusable(false);
        rdbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMActionPerformed(evt);
            }
        });

        buttonGroupGender.add(rdbF);
        rdbF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbF.setForeground(new java.awt.Color(0, 0, 0));
        rdbF.setText("Female");
        rdbF.setContentAreaFilled(false);
        rdbF.setFocusable(false);
        rdbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFActionPerformed(evt);
            }
        });

        cmbDD.setBackground(new java.awt.Color(238, 238, 238));
        cmbDD.setForeground(new java.awt.Color(0, 0, 0));
        cmbDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        cmbDD.setBorder(null);
        cmbDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDDActionPerformed(evt);
            }
        });

        cmbMM.setBackground(new java.awt.Color(238, 238, 238));
        cmbMM.setForeground(new java.awt.Color(0, 0, 0));
        cmbMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        cmbMM.setBorder(null);
        cmbMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMMActionPerformed(evt);
            }
        });

        cmbYYYY.setBackground(new java.awt.Color(238, 238, 238));
        cmbYYYY.setForeground(new java.awt.Color(0, 0, 0));
        cmbYYYY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY" }));
        cmbYYYY.setBorder(null);
        cmbYYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYYYYActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Email ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Contact No");

        txtEmail.setBackground(new java.awt.Color(238, 238, 238));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        txtContactNo.setBackground(new java.awt.Color(238, 238, 238));
        txtContactNo.setForeground(new java.awt.Color(0, 0, 0));
        txtContactNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContactNo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbF)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(cmbMM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbM)
                    .addComponent(rdbF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Panel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 145, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(36, 124, 140));
        btnSubmit.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Next");
        btnSubmit.setBorder(null);
        btnSubmit.setBorderPainted(false);
        btnSubmit.setFocusable(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        Panel2.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 425, 98, 32));

        btnClear1.setBackground(new java.awt.Color(36, 124, 140));
        btnClear1.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(255, 255, 255));
        btnClear1.setText("Clear");
        btnClear1.setBorder(null);
        btnClear1.setBorderPainted(false);
        btnClear1.setFocusable(false);
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        Panel2.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 425, 98, 32));

        btnBack.setBackground(new java.awt.Color(36, 124, 140));
        btnBack.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        Panel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 425, 75, 32));

        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 390, 500));

        jPanel3.setBackground(new java.awt.Color(118, 171, 174));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\register2.png")); // NOI18N
        jPanel6.add(lbl_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 230));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("STUDENT MANAGEMENT ");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 310, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SYSTEM");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 310, -1));

        jLabel20.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("@ M.Dhanush");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

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
        jPanel6.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Animated\\1.gif")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 220));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STUDENT MANAGEMENT ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SYSTEM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 310, 30));

        jLabel9.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("@ M.Dhanush");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        if (txtFullName.getText().isEmpty()
                && txtAddress.getText().isEmpty()) {

        } else {

            JOptionPane.showMessageDialog(null, "Data Cleared Success", "Data Reset", JOptionPane.INFORMATION_MESSAGE);
            txtFullName.setText(null);
            txtAddress.setText(null);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (txtMisNo.getText().isEmpty() || txtFullName.getText().isEmpty()
                || txtAddress.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "All Fields must be filled", "Registration", JOptionPane.INFORMATION_MESSAGE);

        } 
        else {
            
            Panel1TempMIS = txtMisNo.getText();
            Panel1TempName = txtFullName.getText();
            Panel1TempAddress = txtAddress.getText();
            
            Panel1.setVisible(false);
            Panel2.setVisible(true);
            btn_back.setVisible(false);
            txtFullName.setFocusable(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtMisNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMisNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMisNoActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Panel2.setVisible(false);
        Panel1.setVisible(true);
        btn_back.setVisible(true);
        
        txtMisNo.setText(Panel1TempMIS);
        txtFullName.setText(Panel1TempName);
        txtAddress.setText(Panel1TempAddress);

        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        if (txtEmail.getText().isEmpty() && txtContactNo.getText().isEmpty()
                && cmbDD.getSelectedItem().equals("DD") && cmbMM.getSelectedItem().equals("MM")
                && cmbYYYY.getSelectedItem().equals("YYYY") && !rdbM.isSelected()
                && !rdbF.isSelected()) {

        } else {

            JOptionPane.showMessageDialog(null, "Data Cleared Success", "Data Reset", JOptionPane.INFORMATION_MESSAGE);
            cmbDD.setSelectedIndex(0);
            cmbMM.setSelectedIndex(0);
            cmbYYYY.setSelectedIndex(0);
            rdbM.setSelected(true);
            //rdbF.setSelected(false);
            txtEmail.setText(null);
            txtContactNo.setText(null);
            cmbDD.setBorder(none);
            cmbMM.setBorder(none);
            cmbYYYY.setBorder(none);

        }
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        if (!rdbM.isSelected() && !rdbF.isSelected()) {
            JOptionPane.showMessageDialog(null, "All Fields must be filled!", "Registration", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (txtEmail.getText().isEmpty() || txtContactNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields must be filled!", "Registration", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (cmbDD.getSelectedIndex() == 0) {
            cmbDD.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } 
        else if (cmbMM.getSelectedIndex() == 0) {
            cmbMM.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } 
        else if (cmbYYYY.getSelectedIndex() == 0) {
            cmbYYYY.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } 
        else if (txtContactNo.getText().length() < 10 || txtContactNo.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "Contact Number must contain only 10 Numbers!", "Registration", JOptionPane.ERROR_MESSAGE);
            txtContactNo.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
            txtContactNo.setFocusable(true);
        } 
        else if (txtContactNo.getText().length() < 10 || txtContactNo.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "Contact Number must contain only 10 Numbers!", "Registration", JOptionPane.ERROR_MESSAGE);
            txtContactNo.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
            txtContactNo.setFocusable(true);
        } 
        else {
            String temp = txtContactNo.getText();
            boolean chk_contactNo = true;
            boolean chkMail = true;


            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) >= 48 && temp.charAt(i) <= 58) {
                    txtContactNo.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
                    //JOptionPane.showMessageDialog(null, "Submitted","Registration",JOptionPane.INFORMATION_MESSAGE);
                    chk_contactNo = true;
                } 
                else {
                    chk_contactNo = false;
                    txtContactNo.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
                }
            }
            
            for (int i = 0; i < emailArr.length; i++) {
                if (txtEmail.getText().equalsIgnoreCase(emailArr[i])) {
                    JOptionPane.showMessageDialog(null, "Email already Registred!", "Registration", JOptionPane.ERROR_MESSAGE);
                    txtEmail.setText(null);
                    txtEmail.setFocusable(true);
                    chkMail = false;
                    break;
                } 
                else{
                    chkMail = true;
                }                
            }

            if (!chk_contactNo) {
                JOptionPane.showMessageDialog(null, "Contact Number must contain only numbers", "Registration", JOptionPane.INFORMATION_MESSAGE, icon1);
            } 
            else if(chkMail) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure that the entred details are correct", "Registration", JOptionPane.YES_NO_OPTION);
                if (result == 0) {
                    tempDD = String.valueOf(cmbDD.getSelectedItem());
                    tempMM = String.valueOf(cmbMM.getSelectedItem());
                    tempYYYY = String.valueOf(cmbYYYY.getSelectedItem());
                    
                    tempGen = String.valueOf(buttonGroupGender.getSelection());
                    
                    tempMail = txtEmail.getText();
                    tempContactNo = txtContactNo.getText();


                    this.setVisible(false);
                    new UserEmailConfirm();
                }
            }

        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close1ActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyPressed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void cmbYYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYYYYActionPerformed
        // TODO add your handling code here:
        if (cmbYYYY.getSelectedIndex() == 0) {
            cmbYYYY.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbYYYY.setBorder(none);
        }
    }//GEN-LAST:event_cmbYYYYActionPerformed

    private void cmbMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMMActionPerformed
        // TODO add your handling code here:
        if (cmbMM.getSelectedIndex() == 0) {
            cmbMM.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbMM.setBorder(none);
        }
    }//GEN-LAST:event_cmbMMActionPerformed

    private void cmbDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDDActionPerformed
        // TODO add your handling code here:
        if (cmbDD.getSelectedIndex() == 0) {
            cmbDD.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbDD.setBorder(none);
        }
    }//GEN-LAST:event_cmbDDActionPerformed

    private void rdbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMActionPerformed

    private void rdbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbFActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        
        if(lockStatus){
            dispose();
            new LoginUser();
            JOptionPane.showMessageDialog(null,"Sorry You have entered worng Login Details "
                                + "many times, Your Account has been locked! \n\n Click on Forgot Username / Password to Rest your Login Details",
                                "Login Details",JOptionPane.ERROR_MESSAGE);
            
            LoginUser lu1 = new LoginUser();
            
            lu1.txtUsername.setText(null);
            lu1.txtPassword.setText(null);
            lu1.txtUsername.setEnabled(false);
            lu1.txtPassword.setEnabled(false);
            lu1.btn_login.setEnabled(false);
            lu1.txtUsername.setBorder(lock_border);
            lu1.txtPassword.setBorder(lock_border);
            lu1.btn_forgot.setEnabled(true);
            
        }
        else{
            dispose();
            new LoginUser();
        }
        
        
    }//GEN-LAST:event_btn_backActionPerformed

    public static void main(String args[]) {
        new UserRegister();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Panel1;
    public static javax.swing.JPanel Panel2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_close1;
    private javax.swing.ButtonGroup buttonGroupGender;
    public static javax.swing.JComboBox<String> cmbDD;
    public static javax.swing.JComboBox<String> cmbMM;
    public static javax.swing.JComboBox<String> cmbYYYY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_Icon;
    public static javax.swing.JRadioButton rdbF;
    public static javax.swing.JRadioButton rdbM;
    public static javax.swing.JTextField txtAddress;
    public static javax.swing.JTextField txtContactNo;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtFullName;
    public static javax.swing.JTextField txtMisNo;
    // End of variables declaration//GEN-END:variables
}
