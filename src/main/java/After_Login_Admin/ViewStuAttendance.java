
package After_Login_Admin;

/**
 *
 * @author Dhanush
 */

import java.awt.Color;
import java.awt.Font;


import javax.swing.table.DefaultTableModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.border.MatteBorder;

public class ViewStuAttendance extends javax.swing.JFrame {
    
    double avg = 0.0;
    
    DecimalFormat def = new DecimalFormat("00.00"); // decimal places set
    
// getting current month to set cmb month..        
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
    LocalDate now = LocalDate.now();

    int getMonth = Integer.parseInt(dtf.format(now)); // getting in as Integer..
    int getClassDays = 0;
    
 //sql items...
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    
    String qry = null;

// DB Connect..    
    public void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_attendance";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
// Constructor....    
    public ViewStuAttendance() {
        initComponents();  
        dbConnect();
        
        tblNotFound_lbl.setVisible(false);

        cmbYear.setSelectedIndex(1);   
        cmbMonth.setSelectedIndex(getMonth-1); //setting current month to cmb..
        
        lblStuP.setText(null);
        lblStuA.setText(null);
        lblStuAvg.setText(null);
        lblTotalStuP.setText(null);
        lblTotalStuA.setText(null);
        lblTotalStuAvg.setText(null);              
        
// set theme...        
        if(Home.getTheme.equalsIgnoreCase("blue")){        
            bgPannel.setBackground(Home.body);
            tblStuAttendance.getTableHeader().setBackground(Home.SideBar); 
            tblStuAttendance.setBackground(Home.body);
            cmbMonth.setBackground(Home.body);
            cmbYear.setBackground(Home.body);
            cmbMIS.setBackground(Home.body);
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){        
            bgPannel.setBackground(Home.body);
            tblStuAttendance.getTableHeader().setBackground(Home.SideBar);
            tblStuAttendance.setBackground(Home.body);
            cmbMonth.setBackground(Home.body);
            cmbYear.setBackground(Home.body);
            cmbMIS.setBackground(Home.body);
        }
        else if(Home.getTheme.equalsIgnoreCase("default")){        
            bgPannel.setBackground(Home.body);
            tblStuAttendance.getTableHeader().setBackground(Home.SideBar);
            tblStuAttendance.setBackground(Home.body);
            cmbMonth.setBackground(Home.body);
            cmbYear.setBackground(Home.body);
            cmbMIS.setBackground(Home.body);
        }

// table style and behaviour...        
        tblStuAttendance.getTableHeader().setBorder(null);
        tblStuAttendance.getTableHeader().setFont(new Font("Arial",Font.BOLD,18));
        tblStuAttendance.getTableHeader().setForeground(Color.WHITE);
        tblStuAttendance.getTableHeader().setResizingAllowed(false);
        tblStuAttendance.getTableHeader().setEnabled(false);                
              
        //tblStuAttendance.setEnabled(false);
        tblStuAttendance.getColumnModel().getColumn(0).setPreferredWidth(400);
        tblStuAttendance.setRowHeight(30);


        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPannel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tblNotFound_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStuAttendance = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        lblStuA = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblStuP = new javax.swing.JLabel();
        lblStuAvg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalStuP = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalStuA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTotalStuAvg = new javax.swing.JLabel();
        cmbMIS = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPannel.setBackground(new java.awt.Color(102, 0, 0));
        bgPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        bgPannel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1099, 6, 45, 30));

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
        bgPannel.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ICT - DIPLOMA");
        bgPannel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, 199, 40));

        tblNotFound_lbl.setFont(new java.awt.Font("Candara Light", 0, 70)); // NOI18N
        tblNotFound_lbl.setForeground(new java.awt.Color(255, 51, 51));
        tblNotFound_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tblNotFound_lbl.setText("Attendance Table Not Found..");
        bgPannel.add(tblNotFound_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1130, 290));

        tblStuAttendance.setBackground(new java.awt.Color(102, 0, 0));
        tblStuAttendance.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tblStuAttendance.setForeground(new java.awt.Color(255, 255, 255));
        tblStuAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MIS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
            }
        ));
        tblStuAttendance.setEnabled(false);
        tblStuAttendance.setRowHeight(30);
        tblStuAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStuAttendanceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblStuAttendanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblStuAttendanceMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblStuAttendance);

        bgPannel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 250, 1138, 328));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Month");
        bgPannel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 95, -1));

        cmbYear.setBackground(new java.awt.Color(102, 0, 0));
        cmbYear.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cmbYear.setForeground(new java.awt.Color(255, 255, 255));
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" }));
        cmbYear.setBorder(null);
        cmbYear.setFocusable(false);
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });
        bgPannel.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 200, 90, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STUDENTS ATTENDANCE");
        bgPannel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1140, 130));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Absent ");
        bgPannel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 120, 30));

        cmbMonth.setBackground(new java.awt.Color(102, 0, 0));
        cmbMonth.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cmbMonth.setForeground(new java.awt.Color(255, 255, 255));
        cmbMonth.setBorder(null);
        cmbMonth.setFocusable(false);
        cmbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthActionPerformed(evt);
            }
        });
        bgPannel.add(cmbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 200, 185, -1));

        lblStuA.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblStuA.setForeground(new java.awt.Color(255, 255, 255));
        lblStuA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStuA.setText("ABC");
        bgPannel.add(lblStuA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 120, 30));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Select MIS");
        bgPannel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 120, 30));

        lblStuP.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblStuP.setForeground(new java.awt.Color(255, 255, 255));
        lblStuP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStuP.setText("ABC");
        bgPannel.add(lblStuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 120, 30));

        lblStuAvg.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblStuAvg.setForeground(new java.awt.Color(255, 255, 255));
        lblStuAvg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStuAvg.setText("ABC");
        bgPannel.add(lblStuAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 720, 120, 30));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        bgPannel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 20, 30));

        lblTotalStuP.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblTotalStuP.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalStuP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalStuP.setText("ABC");
        bgPannel.add(lblTotalStuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 100, 30));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Total Presences ");
        bgPannel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 130, 30));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Total Absences ");
        bgPannel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, 130, 30));

        lblTotalStuA.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblTotalStuA.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalStuA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalStuA.setText("ABC");
        bgPannel.add(lblTotalStuA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 690, 120, 30));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Month  Average ");
        bgPannel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, 130, 30));

        lblTotalStuAvg.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblTotalStuAvg.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalStuAvg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalStuAvg.setText("ABC");
        bgPannel.add(lblTotalStuAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 720, 120, 30));

        cmbMIS.setBackground(new java.awt.Color(102, 0, 0));
        cmbMIS.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        cmbMIS.setForeground(new java.awt.Color(255, 255, 255));
        cmbMIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student MIS" }));
        cmbMIS.setBorder(null);
        cmbMIS.setFocusable(false);
        cmbMIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMISActionPerformed(evt);
            }
        });
        bgPannel.add(cmbMIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 200, 30));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Present ");
        bgPannel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 110, 30));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Average");
        bgPannel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 70, 30));

        jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        bgPannel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 720, 20, 30));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");
        bgPannel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 20, 30));

        jLabel15.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");
        bgPannel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 660, 20, 30));

        jLabel16.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");
        bgPannel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, 20, 30));

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        bgPannel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 720, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
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
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void tblStuAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStuAttendanceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStuAttendanceMouseClicked

    private void tblStuAttendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStuAttendanceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStuAttendanceMousePressed

    private void tblStuAttendanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStuAttendanceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStuAttendanceMouseReleased

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:        
        
        if(cmbYear.getSelectedIndex() == 0){
            cmbMonth.removeAllItems();
            cmbMonth.addItem("July");
            cmbMonth.addItem("August");
            cmbMonth.addItem("September");
            cmbMonth.addItem("October");
            cmbMonth.addItem("November");
            cmbMonth.addItem("December");            
        }
        else{
            cmbMonth.removeAllItems();
            
            cmbMonth.addItem("January");
            cmbMonth.addItem("February");
            cmbMonth.addItem("March");
            cmbMonth.addItem("April");
            cmbMonth.addItem("May");
            cmbMonth.addItem("June");
            cmbMonth.addItem("July");
            cmbMonth.addItem("August");
            cmbMonth.addItem("September");
            cmbMonth.addItem("October");
            cmbMonth.addItem("November");
            cmbMonth.addItem("December");  
            cmbMonth.setSelectedIndex(getMonth -1); //setting current month to cmb..
        }        
    }//GEN-LAST:event_cmbYearActionPerformed

    private void cmbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthActionPerformed
        // TODO add your handling code here:
        
        cmbMIS.removeAllItems();
        cmbMIS.addItem("Select Student Mis");
        
        
        if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() > getMonth - 1){
            cmbMonth.setForeground(Color.red);
            tblNotFound_lbl.setVisible(true);
            lblTotalStuP.setText(null);
            lblTotalStuA.setText(null);
            lblTotalStuAvg.setText(null);
            cmbMIS.setVisible(false);
            
            DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
            
            for(int j = model.getRowCount() - 1; j >= 0; j--){
                model.removeRow(j);
            }
        }
        else{
            cmbMonth.setForeground(Color.WHITE);
            tblNotFound_lbl.setVisible(false); 
            cmbMIS.setVisible(true);
            
            DefaultTableModel model = (DefaultTableModel) tblStuAttendance.getModel();

// set correct attendance..
// 2024..
            if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 0){
                try {                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM january_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 1){
                try {
//                    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM february_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 2){
                try {
//                    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM march_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 3){
                try {
                  //  DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM april_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 4){
                try {
                   // DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM may_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 5){
                try {
                  //  DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM june_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 6){
                try {
                  //  DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM july_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 7){
                try {
                  //  DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM august_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 8){
                try {
                   // DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM september_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 9){
                try {
                    //DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM october_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 10){
                try {
                 //   DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();
                    
                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }
                    
                    qry = "SELECT * FROM november_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 11){
                try {
                //    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM december_2024";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
// 2023..            
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0){
                try {
                //    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM july_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 1){
                System.out.println("2023 August");
                try {
                 //   DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM august_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 2){
                try {
               //     DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM september_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 3){
                try {
                //    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM october_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 4){
                try {
                //    DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM november_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }
            else if (cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 5){
                try {
               //     DefaultTableModel model = (DefaultTableModel)tblStuAttendance.getModel();

                    for(int j = model.getRowCount()-1; j >= 0; j--){
                        model.removeRow(j);
                    }

                    qry = "SELECT * FROM december_2023";            

                    rs = stm.executeQuery(qry);
                    while(rs.next()){
                        
                        cmbMIS.addItem(rs.getString(1));
                        
                        model.addRow(new Object[]{
                            rs.getString(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getString(7),rs.getString(8),rs.getString(9),
                            rs.getString(10),rs.getString(11),rs.getString(12),
                            rs.getString(13),rs.getString(14),rs.getString(15),
                            rs.getString(16),rs.getString(17),rs.getString(18),
                            rs.getString(19),rs.getString(20),rs.getString(21),
                            rs.getString(22),rs.getString(23),rs.getString(24),
                            rs.getString(25),rs.getString(26),rs.getString(27),
                            rs.getString(28),rs.getString(29),rs.getString(30),
                            rs.getString(31),rs.getString(32)
                        });
                    }            
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }            
            }


// getting the class days....                
            if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'july_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 1){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'august_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 2){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'september_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 3){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'october_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 4){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'november_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 3){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'december_2023'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 0){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'january_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 1){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'february_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 2){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'march_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 3){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'april_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 4){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'may_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 5){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'june_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 6){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'july_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 7){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'august_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 8){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'september_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 9){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'october_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 10){
                try {
                    qry = "SELECT No_of_Days FROM classdays WHERE Month = 'november_2024'";
                    rs = stm.executeQuery(qry);

                    while(rs.next()){
                        getClassDays = rs.getInt(1);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 11){
                    try {
                        qry = "SELECT No_of_Days FROM classdays WHERE Month = 'december_2024'";
                        rs = stm.executeQuery(qry);
                        
                        while(rs.next()){
                            getClassDays = rs.getInt(1);
                        }
                    } 
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0){
                try {
                    qry = "SELECT * FROM july_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;

                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 2;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 1){
                try {
                    qry = "SELECT * FROM august_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                   
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 2){
                try {
                    qry = "SELECT * FROM september_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 3){
                try {
                    qry = "SELECT * FROM october_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 4){
                try {
                    qry = "SELECT * FROM november_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 5){
                try {
                    qry = "SELECT * FROM december_2023";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
// 2024            
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 0){
                try {
                    qry = "SELECT * FROM january_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 1){
                try {
                    qry = "SELECT * FROM february_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 2){
                try {
                    qry = "SELECT * FROM march_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;                                
                            }                            
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                     
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 3){
                lblTotalStuAvg.setText(null);
                try {
                    qry = "SELECT * FROM april_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                     
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 4){
                try {
                    qry = "SELECT * FROM may_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 5){
                try {
                    qry = "SELECT * FROM june_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 6){
                try {
                    qry = "SELECT * FROM july_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 7){
                try {
                    qry = "SELECT * FROM august_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                     
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 8){
                try {
                    qry = "SELECT * FROM september_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 9){
                try {
                    qry = "SELECT * FROM october_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                     
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 10){
                try {
                    qry = "SELECT * FROM november_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                     
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }
            else if(cmbYear.getSelectedIndex() == 1 && cmbMonth.getSelectedIndex() == 11){
                try {
                    qry = "SELECT * FROM december_2024";
                    rs = stm.executeQuery(qry);
                    int p = 0, a = 0;
                    
                    while(rs.next()){
                        for(int i = 2; i <= 32; i++){
                            if(rs.getInt(i) == 1){
                                p++;
                            }
                            else if(rs.getString(i) != null && Integer.parseInt(rs.getString(i)) == 0){
                                a++;
                            }
                        }
                    }
                    int getStuCount = model.getRowCount() - 3;                    
                    double tD = getClassDays * getStuCount;
                    avg = ((double)p / tD) * 100;
                    
                    lblTotalStuP.setText(String.valueOf(p));
                    lblTotalStuA.setText(String.valueOf(a));  
                    lblTotalStuAvg.setText(def.format(avg));                      
                } 
                catch (Exception e) {
                    e.printStackTrace();
                    lblTotalStuP.setText(null);
                    lblTotalStuA.setText(null);
                }
            }            
        }
    }//GEN-LAST:event_cmbMonthActionPerformed

    private void cmbMISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMISActionPerformed
        // TODO add your handling code here:
        
        if(cmbMIS.getSelectedIndex() == 0){
            cmbMIS.setBorder(new MatteBorder(1,1,1,1,Color.RED));
            lblStuP.setText(null);
            lblStuA.setText(null);
            lblStuAvg.setText(null);
                        
        }
        else{            
            cmbMIS.setBorder(null); 
            
            DefaultTableModel model = (DefaultTableModel) tblStuAttendance.getModel();
            
// getting Selected MIS...and setting values..

            for(int i = 1; i <= model.getRowCount(); i++){
                
                if(cmbMIS.getSelectedIndex() == i){
                    
                    int p = 0,a = 0;
                    String tempStr = null;

                    for(int j = 1; j <= 31; j++){   
                        tempStr = String.valueOf(model.getValueAt(i-1, j));
                        try {
                            int tempInt = Integer.parseInt(tempStr);
                            if(tempInt == 1){
                                p++;
                            }
                            else if(tempInt == 0){
                                a++;
                            }
                        } 
                        catch (Exception e) {
                            //e.printStackTrace();
                        }                    
                    }                
// calculations... 

                    double avg = ((double)p * 100) ; // getting the average..

                    lblStuP.setText(String.valueOf(p));
                    lblStuA.setText(String.valueOf(a));
                    lblStuAvg.setText(def.format(avg / getClassDays));
                    
                }                
            }
        }
    }//GEN-LAST:event_cmbMISActionPerformed

    public static void main(String args[]) {
        new ViewStuAttendance();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPannel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> cmbMIS;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStuA;
    private javax.swing.JLabel lblStuAvg;
    private javax.swing.JLabel lblStuP;
    private javax.swing.JLabel lblTotalStuA;
    private javax.swing.JLabel lblTotalStuAvg;
    private javax.swing.JLabel lblTotalStuP;
    private javax.swing.JLabel tblNotFound_lbl;
    private javax.swing.JTable tblStuAttendance;
    // End of variables declaration//GEN-END:variables
}
