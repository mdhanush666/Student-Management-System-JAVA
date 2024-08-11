package After_Login_Admin;
/**
 *
 * @author Dhanush
 */

import java.awt.Color;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class todayPresentINS extends javax.swing.JFrame {

Connection con = null;
Statement stm = null;
ResultSet rs = null;
PreparedStatement pt = null;
String qry = null;

public void dbConnect(){
    String url = "jdbc:mysql://localhost:3306/student_instructor_attendance";
    String username = "Dhanush";
    String password = "Dhanush!1896$";
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,password);
        stm = con.createStatement();
        //System.out.println("DB Connect success..");
    } 
    catch (Exception e) {
        System.out.println("DB Connect Failed!");
    }
}

String monthString = "";
    
// Constructor....    
    public todayPresentINS() {
        initComponents();
        dbConnect();        
        
        DefaultTableModel modelPresent = (DefaultTableModel) tblPresent.getModel();
        DefaultTableModel modelAbsent = (DefaultTableModel) tblAbsent.getModel();        


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

// getting today's attendance.. and storing in tables...

// Present set
        try {            
            qry = "SELECT ID FROM " + monthString + YearInt + " WHERE `" + DayInt + "` = '1'";
                    
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                modelPresent.addRow(new Object[]{
                    rs.getString(1)
                });
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

// Absent set      
        try {            
            qry = "SELECT ID FROM " + monthString + YearInt + " WHERE `" + DayInt + "` = '0'";
                    
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                modelAbsent.addRow(new Object[]{
                    rs.getString(1)
                });                               
            } 
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        if(modelPresent.getRowCount() == 0 && modelAbsent.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Attendace is Empty!","Attendance Details",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        bgPanel.setBackground(Home.body);

// table Present styling..        
        tblPresent.getTableHeader().setBackground(Home.SideBar);
        tblPresent.setBackground(Home.body);
        tblPresent.getTableHeader().setFont(new Font("Arial",Font.BOLD,18));
        tblPresent.getTableHeader().setForeground(Color.WHITE);
        tblPresent.getTableHeader().setEnabled(false);
        tblPresent.getTableHeader().setResizingAllowed(false);
        tblPresent.setBorder(null);
        tblPresent.getTableHeader().setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        tblPresent.setRowHeight(30);
        
// table Absent styling..        
        tblAbsent.getTableHeader().setBackground(Home.SideBar);
        tblAbsent.setBackground(Home.body);
        tblAbsent.getTableHeader().setFont(new Font("Arial",Font.BOLD,18));
        tblAbsent.getTableHeader().setForeground(Color.WHITE);
        tblAbsent.getTableHeader().setEnabled(false);
        tblAbsent.getTableHeader().setResizingAllowed(false);
        tblAbsent.setBorder(null);
        tblAbsent.getTableHeader().setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        tblAbsent.setRowHeight(30);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbsent = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPresent = new javax.swing.JTable();

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

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Today's Attendance");

        tblAbsent.setBackground(new java.awt.Color(102, 0, 0));
        tblAbsent.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tblAbsent.setForeground(new java.awt.Color(255, 255, 255));
        tblAbsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAbsent.setFocusable(false);
        tblAbsent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAbsentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAbsentMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAbsent);
        if (tblAbsent.getColumnModel().getColumnCount() > 0) {
            tblAbsent.getColumnModel().getColumn(0).setResizable(false);
        }

        tblPresent.setBackground(new java.awt.Color(102, 0, 0));
        tblPresent.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tblPresent.setForeground(new java.awt.Color(255, 255, 255));
        tblPresent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Present"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPresent.setFocusable(false);
        tblPresent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPresentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPresentMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblPresent);
        if (tblPresent.getColumnModel().getColumnCount() > 0) {
            tblPresent.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tblPresentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresentMousePressed
        // TODO add your handling code here:
        tblPresent.setSelectionBackground(Color.BLACK);
        tblPresent.setSelectionForeground(Color.red);
    }//GEN-LAST:event_tblPresentMousePressed

    private void tblAbsentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAbsentMousePressed
        // TODO add your handling code here:
        tblAbsent.setSelectionBackground(Color.BLACK);
        tblAbsent.setSelectionForeground(Color.red);
    }//GEN-LAST:event_tblAbsentMousePressed

    private void tblAbsentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAbsentMouseReleased
        // TODO add your handling code here:
        tblAbsent.setSelectionBackground(Home.body);
        tblAbsent.setSelectionForeground(Color.WHITE);
    }//GEN-LAST:event_tblAbsentMouseReleased

    private void tblPresentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresentMouseReleased
        // TODO add your handling code here:
        tblPresent.setSelectionBackground(Home.body);
        tblPresent.setSelectionForeground(Color.WHITE);
    }//GEN-LAST:event_tblPresentMouseReleased

    public static void main(String args[]) {
        new todayPresentINS();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAbsent;
    private javax.swing.JTable tblPresent;
    // End of variables declaration//GEN-END:variables
}
