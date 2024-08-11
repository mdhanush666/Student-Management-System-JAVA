
package After_Login_Admin;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.*;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhanush
 */
public class ManipulateINS extends javax.swing.JFrame {
    
    
    Border tblHeadBorder = new MatteBorder(0,0,2,0,Color.GRAY);
    
    int tableSHowCount = 1;
    
    String tempID = null,newID,getUpatePressID;
    int Id; 
    
    int rowIndex; // this variable is to get the row index of the user selecting record in the table
    
    boolean chkPhoneNo;
    
    String qry = null;
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    
    void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }        
    }   

// Fillter method..    
    public void fillter(String query){
        DefaultTableModel model = (DefaultTableModel)tbl_Ins_details.getModel();
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbl_Ins_details.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
        
    }

// Constructor......   
    public ManipulateINS() {
        initComponents();
        dbConnect();    
        
        tbl_Ins_details.getTableHeader().setBackground(new Color(51,0,0));

        if(Home.getTheme.equalsIgnoreCase("blue")){        
            MPanelSide.setBackground(Home.SideBar);
            PanelTableContainer.setBackground(Home.body);
            tbl_Ins_details.setBackground(Home.body);
            
            txtFullName.setBackground(Home.SideBar);
            cmbDD.setBackground(Home.SideBar);
            cmbMM.setBackground(Home.SideBar);
            cmbYYYY.setBackground(Home.SideBar);
            cmbGender.setBackground(Home.SideBar);
            txtEmail.setBackground(Home.SideBar);
            txtPhoneNo.setBackground(Home.SideBar);
            txtAddress.setBackground(Home.SideBar);
            txtSearch.setBackground(Home.body);
            
            btn_showTable.setBackground(new Color(0,0,150));
            tbl_Ins_details.getTableHeader().setBackground(new Color(0,0,80));
  
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){        
            MPanelSide.setBackground(Home.SideBar);
            PanelTableContainer.setBackground(Home.body);
            tbl_Ins_details.setBackground(Home.body);
            
            txtFullName.setBackground(Home.SideBar);
            cmbDD.setBackground(Home.SideBar);
            cmbMM.setBackground(Home.SideBar);
            cmbYYYY.setBackground(Home.SideBar);
            cmbGender.setBackground(Home.SideBar);
            txtEmail.setBackground(Home.SideBar);
            txtPhoneNo.setBackground(Home.SideBar);
            txtAddress.setBackground(Home.SideBar);
            txtSearch.setBackground(Home.body);
            
            btn_showTable.setBackground(new Color(30,30,30));
            tbl_Ins_details.getTableHeader().setBackground(new Color(30,30,30));
  
        }
        else if(Home.getTheme.equalsIgnoreCase("default")){        
            MPanelSide.setBackground(Home.SideBar);
            PanelTableContainer.setBackground(Home.body);
            tbl_Ins_details.setBackground(Home.body);
            
            txtFullName.setBackground(Home.SideBar);
            cmbDD.setBackground(Home.SideBar);
            cmbMM.setBackground(Home.SideBar);
            cmbYYYY.setBackground(Home.SideBar);
            cmbGender.setBackground(Home.SideBar);
            txtEmail.setBackground(Home.SideBar);
            txtPhoneNo.setBackground(Home.SideBar);
            txtAddress.setBackground(Home.SideBar);
            txtSearch.setBackground(Home.body);
            
            btn_showTable.setBackground(new Color(80,0,0));
            tbl_Ins_details.getTableHeader().setBackground(new Color(60,0,0));
        }


        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        
        for (int i = 1; i < 32; i++) {
            if(i <=9){
                cmbDD.addItem("0" + String.valueOf(i));
            }
            else{
                cmbDD.addItem(String.valueOf(i));
            }
        }
        for (int i = 1; i < 13; i++) {
            if(i <=9){
                cmbMM.addItem("0" + String.valueOf(i));
            }
            else{
                cmbMM.addItem(String.valueOf(i));
            }
        }
        for (int i = 1946; i <=2006 ; i++) {
            cmbYYYY.addItem(String.valueOf(i));
        }
        
        tbl_Ins_details.getColumnModel().getColumn(0).setPreferredWidth(140);
        tbl_Ins_details.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_Ins_details.getColumnModel().getColumn(2).setPreferredWidth(95);
        tbl_Ins_details.getColumnModel().getColumn(3).setResizable(false);
        tbl_Ins_details.getColumnModel().getColumn(4).setPreferredWidth(140);
        tbl_Ins_details.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbl_Ins_details.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        
// getting stored Instructors detils to table..        
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_Ins_details.getModel();
            qry = "SELECT * FROM instructor_registration";
            rs = stm.executeQuery(qry);
            
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), 
                            rs.getString(3), rs.getString(4), rs.getString(5), 
                            rs.getString(6), rs.getString(7)});
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        PanelTableContainer.setVisible(false);
        lblIconTop.setVisible(false);
        setSize(340, 600);
        setLocationRelativeTo(null);
        
        tbl_Ins_details.getTableHeader().setForeground(Color.WHITE);
        tbl_Ins_details.getTableHeader().setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        tbl_Ins_details.getTableHeader().setBorder(tblHeadBorder);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MPanelSide = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        cmbMM = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btn_showTable = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        btnClose2 = new javax.swing.JButton();
        lblHead2 = new javax.swing.JLabel();
        cmbYYYY = new javax.swing.JComboBox<>();
        cmbDD = new javax.swing.JComboBox<>();
        btn_back = new javax.swing.JButton();
        lblIconTop = new javax.swing.JLabel();
        PanelTableContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Ins_details = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        lblHead1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MPanelSide.setBackground(new java.awt.Color(120, 0, 0));
        MPanelSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        MPanelSide.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOB");
        MPanelSide.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 36, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");
        MPanelSide.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        MPanelSide.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");
        MPanelSide.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        MPanelSide.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        txtFullName.setBackground(new java.awt.Color(120, 0, 0));
        txtFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        MPanelSide.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 30));

        txtEmail.setBackground(new java.awt.Color(120, 0, 0));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        MPanelSide.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 190, 30));

        txtPhoneNo.setBackground(new java.awt.Color(120, 0, 0));
        txtPhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        MPanelSide.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 30));

        txtAddress.setBackground(new java.awt.Color(120, 0, 0));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        MPanelSide.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 30));

        btnAdd.setBackground(new java.awt.Color(204, 102, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusable(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        MPanelSide.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 470, 60, 35));

        cmbMM.setBackground(new java.awt.Color(120, 0, 0));
        cmbMM.setForeground(new java.awt.Color(255, 255, 255));
        cmbMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        cmbMM.setBorder(null);
        cmbMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMMActionPerformed(evt);
            }
        });
        MPanelSide.add(cmbMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 60, 30));

        btnUpdate.setBackground(new java.awt.Color(204, 102, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
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
        MPanelSide.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 470, 70, 35));

        btnDelete.setBackground(new java.awt.Color(204, 102, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        MPanelSide.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 70, 35));

        btnClear.setBackground(new java.awt.Color(204, 102, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
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
        MPanelSide.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 470, 70, 35));

        btn_showTable.setBackground(new java.awt.Color(80, 0, 0));
        btn_showTable.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_showTable.setForeground(new java.awt.Color(255, 255, 255));
        btn_showTable.setText("Show Table View");
        btn_showTable.setBorder(null);
        btn_showTable.setBorderPainted(false);
        btn_showTable.setFocusable(false);
        btn_showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showTableActionPerformed(evt);
            }
        });
        MPanelSide.add(btn_showTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 520, 300, 40));

        cmbGender.setBackground(new java.awt.Color(120, 0, 0));
        cmbGender.setForeground(new java.awt.Color(255, 255, 255));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cmbGender.setBorder(null);
        cmbGender.setFocusable(false);
        MPanelSide.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 190, 30));

        btnClose2.setBackground(new java.awt.Color(255, 255, 255));
        btnClose2.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        btnClose2.setForeground(new java.awt.Color(255, 255, 255));
        btnClose2.setText("X");
        btnClose2.setBorder(null);
        btnClose2.setBorderPainted(false);
        btnClose2.setContentAreaFilled(false);
        btnClose2.setFocusable(false);
        btnClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClose2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClose2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClose2MouseReleased(evt);
            }
        });
        btnClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose2ActionPerformed(evt);
            }
        });
        MPanelSide.add(btnClose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 45, 30));

        lblHead2.setFont(new java.awt.Font("Onyx", 0, 120)); // NOI18N
        lblHead2.setForeground(new java.awt.Color(255, 255, 255));
        lblHead2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead2.setText("SMS");
        MPanelSide.add(lblHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 324, 130));

        cmbYYYY.setBackground(new java.awt.Color(120, 0, 0));
        cmbYYYY.setForeground(new java.awt.Color(255, 255, 255));
        cmbYYYY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY" }));
        cmbYYYY.setBorder(null);
        cmbYYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYYYYActionPerformed(evt);
            }
        });
        MPanelSide.add(cmbYYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 60, 30));

        cmbDD.setBackground(new java.awt.Color(120, 0, 0));
        cmbDD.setForeground(new java.awt.Color(255, 255, 255));
        cmbDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        cmbDD.setBorder(null);
        cmbDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDDActionPerformed(evt);
            }
        });
        MPanelSide.add(cmbDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 50, 30));

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
        MPanelSide.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        lblIconTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconTop.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Admin After Login\\add.png")); // NOI18N
        lblIconTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconTopMousePressed(evt);
            }
        });
        MPanelSide.add(lblIconTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 220));

        getContentPane().add(MPanelSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 600));

        PanelTableContainer.setBackground(new java.awt.Color(102, 0, 0));

        tbl_Ins_details.setBackground(new java.awt.Color(102, 0, 0));
        tbl_Ins_details.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        tbl_Ins_details.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tbl_Ins_details.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Ins_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "DOB", "Gender", "Email", "Phone No", "Address"
            }
        ));
        tbl_Ins_details.setAutoResizeMode(0);
        tbl_Ins_details.setFocusable(false);
        tbl_Ins_details.setRowHeight(30);
        tbl_Ins_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_Ins_detailsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_Ins_detailsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_Ins_detailsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Ins_details);

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

        lblHead1.setFont(new java.awt.Font("Onyx", 0, 100)); // NOI18N
        lblHead1.setForeground(new java.awt.Color(255, 255, 255));
        lblHead1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead1.setText("Student Management System");

        txtSearch.setBackground(new java.awt.Color(102, 0, 0));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search");

        javax.swing.GroupLayout PanelTableContainerLayout = new javax.swing.GroupLayout(PanelTableContainer);
        PanelTableContainer.setLayout(PanelTableContainerLayout);
        PanelTableContainerLayout.setHorizontalGroup(
            PanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableContainerLayout.createSequentialGroup()
                .addGroup(PanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTableContainerLayout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTableContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTableContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableContainerLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelTableContainerLayout.setVerticalGroup(
            PanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableContainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(PanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTableContainerLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PanelTableContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 810, 600));

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        
        if(txtFullName.getText().isEmpty() || cmbYYYY.getSelectedIndex() == 0 ||
           cmbMM.getSelectedIndex() == 0 || cmbDD.getSelectedIndex() == 0 ||
           txtEmail.getText().isEmpty() || txtPhoneNo.getText().isEmpty() ||
           txtAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All Fields must be filled!", "INFORMATION",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPhoneNo.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "Phone Number must contain 10 Numbers!","ERROR",JOptionPane.ERROR_MESSAGE);
            txtPhoneNo.setText(null);
            txtPhoneNo.setFocusable(true);
        }
        else{
            
            if(txtEmail.getText().contains("@gmail.com")){
                
                for(int i=0; i < txtPhoneNo.getText().length(); i++){

                    if(txtPhoneNo.getText().charAt(i) >= 48 && txtPhoneNo.getText().charAt(i) <= 58){
                        chkPhoneNo = true;
                    }
                    else{
                        chkPhoneNo = false;
                        JOptionPane.showMessageDialog(null, "Phone Number must contain only Numbers","ERROR",JOptionPane.ERROR_MESSAGE);
                        txtPhoneNo.setText(null);
                        txtPhoneNo.setFocusable(true);
                        break;
                    }
                }

                if(chkPhoneNo){
                String getDOB = cmbYYYY.getSelectedItem() + "-" + cmbMM.getSelectedItem() + "-" + cmbDD.getSelectedItem();

// getting ID to print in the Table and DB...          
                try {
                    qry = "SELECT ID FROM instructor_registration ORDER BY (ID)ASC";
                    rs = stm.executeQuery(qry);
                    while (rs.next()) {
                        tempID = (rs.getString(1));
                    }
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
                Id = Integer.parseInt(tempID.substring(10));
                newID = ("INS23ICT5D" + (Id + 1));
                
// Insert Data..   
                try{

                    qry = "INSERT INTO instructor_registration(ID,Full_Name,DOB,Gender,Email,Phone_No,Address)"
                            + "VALUES (?,?,?,?,?,?,?)";
                    pt = con.prepareStatement(qry);

                    pt.setString(1, newID);
                    pt.setString(2, txtFullName.getText().toLowerCase());
                    pt.setString(3, getDOB);
                    pt.setString(4, String.valueOf(cmbGender.getSelectedItem()));
                    pt.setString(5, txtEmail.getText().toLowerCase());
                    pt.setString(6, txtPhoneNo.getText());
                    pt.setString(7, txtAddress.getText()); 

                    pt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Insert Success","INFORMATIOn",JOptionPane.INFORMATION_MESSAGE);
                    
                    DefaultTableModel model = (DefaultTableModel) tbl_Ins_details.getModel();

                    model.addRow(new Object[]{newID, txtFullName.getText().toLowerCase(),getDOB,cmbGender.getSelectedItem(), txtEmail.getText().toLowerCase(), txtPhoneNo.getText(), txtAddress.getText()});

                    txtFullName.setText(null);
                    cmbYYYY.setSelectedIndex(0);
                    cmbMM.setSelectedIndex(0);
                    cmbDD.setSelectedIndex(0);
                    txtEmail.setText(null);
                    cmbGender.setSelectedIndex(0);
                    txtPhoneNo.setText(null);
                    txtAddress.setText(null);

                    cmbYYYY.setBorder(null);
                    cmbMM.setBorder(null);
                    cmbDD.setBorder(null);
                
                }
                catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Email or Phone Number have been Already Registered!","INFORMATION",JOptionPane.ERROR_MESSAGE);                                         
                }
            }            
        
            }        
            else{
                JOptionPane.showMessageDialog(null, "Invalid Email Address!","INFORMATION",JOptionPane.ERROR_MESSAGE);
                txtEmail.setBorder(new MatteBorder(1,1,1,1,Color.red));
            }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btn_showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showTableActionPerformed
        // TODO add your handling code here:
        
        if(tableSHowCount % 2 == 0){
            PanelTableContainer.setVisible(false);
            btn_showTable.setText("Show Table View");
            btnClose2.setVisible(true);
            lblHead2.setVisible(true);  
            lblIconTop.setVisible(false);
            setSize(340, 600);
            setLocationRelativeTo(null);
            MPanelSide.setBorder(null);
        }
        else{
            setSize(1150, 600);
            btn_showTable.setText("Hide Table View");
            PanelTableContainer.setVisible(true);
            btnClose2.setVisible(false);
            lblIconTop.setVisible(true);
            lblHead2.setVisible(false);
            setLocationRelativeTo(null);
            MPanelSide.setBorder(new MatteBorder(0,0,0,10,Color.WHITE));
            
        }
        tableSHowCount++;
        
        
    }//GEN-LAST:event_btn_showTableActionPerformed

    private void btnClose2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClose2MouseEntered

    private void btnClose2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClose2MousePressed

    private void btnClose2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClose2MouseReleased

    private void btnClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnClose2ActionPerformed

    private void cmbYYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYYYYActionPerformed
        // TODO add your handling code here:
        if (cmbYYYY.getSelectedIndex() == 0) {
            cmbYYYY.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbYYYY.setBorder(null);
        }
    }//GEN-LAST:event_cmbYYYYActionPerformed

    private void cmbMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMMActionPerformed
        // TODO add your handling code here:
        if (cmbMM.getSelectedIndex() == 0) {
            cmbMM.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbMM.setBorder(null);
        }
    }//GEN-LAST:event_cmbMMActionPerformed

    private void cmbDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDDActionPerformed
        // TODO add your handling code here:
        if (cmbDD.getSelectedIndex() == 0) {
            cmbDD.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        } else {
            cmbDD.setBorder(null);
        }
    }//GEN-LAST:event_cmbDDActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Data Clear Success","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        
        txtFullName.setText(null);
        cmbYYYY.setSelectedIndex(0);
        cmbMM.setSelectedIndex(0);
        cmbDD.setSelectedIndex(0);
        cmbGender.setSelectedIndex(0);
        txtEmail.setText(null);
        txtPhoneNo.setText(null);
        txtAddress.setText(null);

        cmbYYYY.setBorder(null);
        cmbMM.setBorder(null);
        cmbDD.setBorder(null);   
        
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:     
            String tempGetText = txtSearch.getText();  
            fillter(tempGetText);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tbl_Ins_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_Ins_detailsMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_tbl_Ins_detailsMouseClicked

    private void tbl_Ins_detailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_Ins_detailsMouseReleased
        // TODO add your handling code here:
        
        if(Home.getTheme.equalsIgnoreCase("blue")){
            tbl_Ins_details.setSelectionBackground(new Color(0,0,204));
            tbl_Ins_details.setSelectionForeground(Color.WHITE);
        }
        else if(Home.getTheme.equalsIgnoreCase("black")){
            tbl_Ins_details.setSelectionBackground(Color.BLACK);
            tbl_Ins_details.setSelectionForeground(Color.WHITE);
        }        
        else{
            tbl_Ins_details.setSelectionBackground(new Color(102,0,0));
            tbl_Ins_details.setSelectionForeground(Color.WHITE);
        }
    }//GEN-LAST:event_tbl_Ins_detailsMouseReleased

    private void tbl_Ins_detailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_Ins_detailsMousePressed
        // TODO add your handling code here:
        
        if(Home.getTheme.equalsIgnoreCase("black")){
            tbl_Ins_details.setSelectionBackground(new Color(255,255,255));
            tbl_Ins_details.setSelectionForeground(Color.RED);
        }
        else{
            tbl_Ins_details.setSelectionBackground(Color.BLACK);
            tbl_Ins_details.setSelectionForeground(Color.RED);
        }

        rowIndex = tbl_Ins_details.getSelectedRow(); //getting row index
        
        DefaultTableModel model = (DefaultTableModel) tbl_Ins_details.getModel();
        
        getUpatePressID = model.getValueAt(rowIndex, 0).toString();
        
        txtFullName.setText(model.getValueAt(rowIndex, 1).toString());
        
        String getDOB = model.getValueAt(rowIndex, 2).toString();
        
        cmbDD.setSelectedItem(getDOB.substring(8, 10));
        cmbMM.setSelectedItem(getDOB.substring(5, 7));
        cmbYYYY.setSelectedItem(getDOB.substring(0, 4));
        
        cmbGender.setSelectedItem(model.getValueAt(rowIndex, 3));
        
        txtEmail.setText(model.getValueAt(rowIndex, 4).toString());
        txtPhoneNo.setText(model.getValueAt(rowIndex, 5).toString());
        txtAddress.setText(model.getValueAt(rowIndex, 6).toString());
        
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
                
    }//GEN-LAST:event_tbl_Ins_detailsMousePressed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        txtEmail.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                
        if(txtFullName.getText().isEmpty() || cmbYYYY.getSelectedIndex() == 0 ||
           cmbMM.getSelectedIndex() == 0 || cmbDD.getSelectedIndex() == 0 ||
           txtEmail.getText().isEmpty() || txtPhoneNo.getText().isEmpty() ||
           txtAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All Fields must be filled!", "INFORMATION",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPhoneNo.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "Phone Number must contain 10 Numbers!","ERROR",JOptionPane.ERROR_MESSAGE);
            txtPhoneNo.setText(null);
            txtPhoneNo.setFocusable(true);
        }
        else{
            
            if(txtEmail.getText().contains("@gmail.com")){
                
                for(int i=0; i < txtPhoneNo.getText().length(); i++){

                    if(txtPhoneNo.getText().charAt(i) >= 48 && txtPhoneNo.getText().charAt(i) <= 58){
                        chkPhoneNo = true;
                    }
                    else{
                        chkPhoneNo = false;
                        JOptionPane.showMessageDialog(null, "Phone Number must contain only Numbers","ERROR",JOptionPane.ERROR_MESSAGE);
                        txtPhoneNo.setText(null);
                        txtPhoneNo.setFocusable(true);
                        break;
                    }
                }

                if(chkPhoneNo){
                    
                    String getDOB = cmbYYYY.getSelectedItem() + "-" + cmbMM.getSelectedItem() + "-" + cmbDD.getSelectedItem();

// Updating data in Database...          
                    try {
                        qry = "UPDATE instructor_registration SET Full_Name = ?, DOB = ?, Gender = ?,"
                                + "Email = ?, Phone_No = ?, Address = ? WHERE ID = '" + getUpatePressID + "'";

                        pt = con.prepareStatement(qry);

                        pt.setString(1, txtFullName.getText());
                        pt.setString(2, getDOB);
                        pt.setString(3, String.valueOf(cmbGender.getSelectedItem()));
                        pt.setString(4, txtEmail.getText());
                        pt.setString(5, txtPhoneNo.getText());
                        pt.setString(6, txtAddress.getText()); 

                        pt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Update Success","INFORMATIOn",JOptionPane.INFORMATION_MESSAGE);
                        
                        btnUpdate.setEnabled(false);
                        btnDelete.setEnabled(false);

// Updating in Table
                        DefaultTableModel model = (DefaultTableModel)tbl_Ins_details.getModel();
                        rowIndex = tbl_Ins_details.getSelectedRow(); //getting row index
                        
                        model.setValueAt(txtFullName.getText(), rowIndex,1);
                        model.setValueAt(getDOB, rowIndex,2);
                        model.setValueAt(cmbGender.getSelectedItem(), rowIndex,3);
                        model.setValueAt(txtEmail.getText(), rowIndex,4);
                        model.setValueAt(txtPhoneNo.getText(), rowIndex,5);
                        model.setValueAt(txtAddress.getText(), rowIndex,6);
                        
                        txtFullName.setText(null);
                        cmbYYYY.setSelectedIndex(0);
                        cmbMM.setSelectedIndex(0);
                        cmbDD.setSelectedIndex(0);
                        txtEmail.setText(null);
                        cmbGender.setSelectedIndex(0);
                        txtPhoneNo.setText(null);
                        txtAddress.setText(null);

                        cmbYYYY.setBorder(null);
                        cmbMM.setBorder(null);
                        cmbDD.setBorder(null);
                    } 
                    catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }        
            else{
                JOptionPane.showMessageDialog(null, "Invalid Email Address!","INFORMATION",JOptionPane.ERROR_MESSAGE);
                txtEmail.setBorder(new MatteBorder(1,1,1,1,Color.red));
            }
        }      
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int delResutl = JOptionPane.showConfirmDialog(null,"Are you sure to Delete \n" + getUpatePressID +" Record", "Delete Information",JOptionPane.YES_NO_OPTION);
        
        if(delResutl == 0){

// Delete in Database..            
            try {
                qry = "DELETE FROM instructor_registration WHERE ID = '" + getUpatePressID + "'";
                
                pt = con.prepareStatement(qry);
                pt.executeUpdate();
                
            } 
            catch (Exception e) {
                System.out.println(e);
            }
            
// Delete in Table..

            DefaultTableModel model = (DefaultTableModel)tbl_Ins_details.getModel();
            
            model.removeRow(rowIndex);
            
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully","Delete Information",JOptionPane.INFORMATION_MESSAGE);
            
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            
            txtFullName.setText(null);
            cmbYYYY.setSelectedIndex(0);
            cmbMM.setSelectedIndex(0);
            cmbDD.setSelectedIndex(0);
            txtEmail.setText(null);
            cmbGender.setSelectedIndex(0);
            txtPhoneNo.setText(null);
            txtAddress.setText(null);

            cmbYYYY.setBorder(null);
            cmbMM.setBorder(null);
            cmbDD.setBorder(null);
        }        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();       
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void lblIconTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconTopMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIconTopMousePressed

    public static void main(String args[]) {
        new ManipulateINS();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel MPanelSide;
    public javax.swing.JPanel PanelTableContainer;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_showTable;
    public static javax.swing.JComboBox<String> cmbDD;
    private javax.swing.JComboBox<String> cmbGender;
    public static javax.swing.JComboBox<String> cmbMM;
    public static javax.swing.JComboBox<String> cmbYYYY;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHead1;
    private javax.swing.JLabel lblHead2;
    private javax.swing.JLabel lblIconTop;
    public javax.swing.JTable tbl_Ins_details;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
