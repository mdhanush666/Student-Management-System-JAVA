 
package After_Login_Instructor;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.sql.*;

/**
 *
 * @author Dhanush
 */
public class Assignments extends javax.swing.JFrame{
    

    String getPath;
    
    JFileChooser fileChooser = new JFileChooser();
    
    File[] selectedFile;
    
    ArrayList <String> selFirst = new ArrayList<>();
    ArrayList <String> selectedFileName = new ArrayList<>();
    
    boolean isDuplicate = false;
    
    public int OpenFileChooser(String OpenPath){

        fileChooser.setCurrentDirectory(new File(OpenPath));
        
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setDialogTitle("Select Assignments / Projects");
        int response = fileChooser.showOpenDialog(null);
        
        return response;
    }
    
// DB Connect..

    Connection con = null;
    Statement stm = null;
    PreparedStatement pt = null;
    String qry = "";
    
    public void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_management_system";
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
    public Assignments() {
        initComponents();
        dbConnect();

// set theme..        
        if(Home.getTheme.equalsIgnoreCase("default")){
            bgPanel.setBackground(new Color(160,160,0));
            txtPane.setBackground(new Color(120,120,0));
            btnUpload.setBackground(new Color(180,180,0));
            btnUploadMore.setBackground(new Color(160,160,0));
            btnShareNotes.setBackground(new Color(160,160,0));
            btnSharedAssignments.setBackground(new Color(160,160,0));
        }
        else{
            bgPanel.setBackground(Home.body);
            txtPane.setBackground(Home.BodyElements);
            btnUpload.setBackground(Home.SideBar);
            btnUploadMore.setBackground(Home.SideBar);
            btnShareNotes.setBackground(Home.SideBar);
            btnSharedAssignments.setBackground(Home.SideBar);
        }
        
        btnShareNotes.setEnabled(false);
        btnUploadMore.setEnabled(false);      
        
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        btnUpload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();
        lblHeading = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btnShareNotes = new javax.swing.JButton();
        btnUploadMore = new javax.swing.JButton();
        btnSharedAssignments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(140, 140, 0));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpload.setBackground(new java.awt.Color(180, 180, 0));
        btnUpload.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload Assignments");
        btnUpload.setFocusable(false);
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        bgPanel.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 50));

        txtPane.setEditable(false);
        txtPane.setBackground(new java.awt.Color(120, 120, 0));
        txtPane.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPane.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txtPane.setForeground(new java.awt.Color(255, 255, 255));
        txtPane.setFocusable(false);
        jScrollPane1.setViewportView(txtPane);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, 588, 150));

        lblHeading.setFont(new java.awt.Font("Agency FB", 0, 60)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Share Assignments");
        bgPanel.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, 588, 80));

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
        bgPanel.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 39, 37));

        btnShareNotes.setBackground(new java.awt.Color(160, 160, 0));
        btnShareNotes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnShareNotes.setForeground(new java.awt.Color(255, 255, 255));
        btnShareNotes.setText("Share ");
        btnShareNotes.setFocusable(false);
        btnShareNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareNotesActionPerformed(evt);
            }
        });
        bgPanel.add(btnShareNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 120, 40));

        btnUploadMore.setBackground(new java.awt.Color(160, 160, 0));
        btnUploadMore.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUploadMore.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadMore.setText("Add More");
        btnUploadMore.setFocusable(false);
        btnUploadMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadMoreActionPerformed(evt);
            }
        });
        bgPanel.add(btnUploadMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 40));

        btnSharedAssignments.setBackground(new java.awt.Color(160, 160, 0));
        btnSharedAssignments.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSharedAssignments.setForeground(new java.awt.Color(255, 255, 255));
        btnSharedAssignments.setText("Shared Assignments");
        btnSharedAssignments.setFocusable(false);
        btnSharedAssignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSharedAssignmentsActionPerformed(evt);
            }
        });
        bgPanel.add(btnSharedAssignments, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Assignments / Project (pdf, jpg, jpeg, png, pptx)","pdf","jpeg","jpg","png","pptx");
        
        fileChooser.setFileFilter(filter);
        
        int getResponse = OpenFileChooser(".");
        
        if(getResponse == JFileChooser.APPROVE_OPTION){
            btnUpload.setVisible(false);
            btnShareNotes.setEnabled(true);
            btnUploadMore.setEnabled(true);   
            
            getPath = fileChooser.getSelectedFile().getAbsolutePath();
            
            selectedFile = fileChooser.getSelectedFiles();
            
            
            for(int i = 0; i < selectedFile.length; i++){
                selectedFileName.add(selectedFile[i].getName());
                
                selFirst.add(String.valueOf(selectedFile[i]));                  
            }
            
            for(int i = 0; i < selFirst.size(); i++){
                txtPane.setText(txtPane.getText() + selFirst.get(i) + "\n");
            }            
            
        }
        else if(getResponse == JFileChooser.CANCEL_OPTION){
            btnUpload.setVisible(true);
            btnShareNotes.setEnabled(false);
            btnUploadMore.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnShareNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareNotesActionPerformed
        // TODO add your handling code here:
        
        try {
            qry = "INSERT INTO students_assignments (File_Name,File_Location) VALUES(?,?)";
            pt = con.prepareStatement(qry);
            
            for(int i = 0; i < selFirst.size(); i++){
                pt.setString(1, selectedFileName.get(i));
                pt.setString(2, selFirst.get(i));
                pt.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(null, "Assignments / Projects Shared Success","Share Notes",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new Home();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnShareNotesActionPerformed

    private void btnUploadMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadMoreActionPerformed
        // TODO add your handling code here:

        
        int getResponse = OpenFileChooser(getPath);
        
        if(getResponse == JFileChooser.APPROVE_OPTION){
            
            selectedFile = fileChooser.getSelectedFiles();
            
            for(int i = 0; i < selectedFile.length; i++){
                selFirst.add(String.valueOf(selectedFile[i]));
                
                selectedFileName.add(selectedFile[i].getName());
            }
            
            txtPane.setText(null);
            
            for(int i = 0; i < selFirst.size(); i++){                
                for(int j = i+1; j < selFirst.size(); j++){
                    
                    if(selFirst.get(i).equals(selFirst.get(j))){
                        selFirst.remove(j);
                        selectedFileName.remove(j);
                        isDuplicate = true;
                    }
                } 
            }
            
            if(isDuplicate){
                JOptionPane.showMessageDialog(null,"Duplicate Files are Removed!");
                isDuplicate = false;
            }
            
            for(int i = 0; i < selFirst.size(); i++){
                txtPane.setText(txtPane.getText() + selFirst.get(i) + "\n");
            }
            
        }
    }//GEN-LAST:event_btnUploadMoreActionPerformed

    private void btnSharedAssignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSharedAssignmentsActionPerformed
        // TODO add your handling code here:
        new SharedAssignments();
    }//GEN-LAST:event_btnSharedAssignmentsActionPerformed

    public static void main(String args[]) {
        new Assignments();
       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnShareNotes;
    private javax.swing.JButton btnSharedAssignments;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnUploadMore;
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables
}
