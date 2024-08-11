
package After_Login_Admin;

/**
 *
 * @author Dhanush
 */
public class SettingsAbout extends javax.swing.JFrame {

    public SettingsAbout() {
        initComponents();
        
        txtAbout.setEditable(false);
        
        jPanel1.setBackground(Home.body);
        txtAbout.setBackground(Home.body);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAbout = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 39, 37));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Main_img.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 700, 240));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ABOUT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, 80));

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txtAbout.setEditable(false);
        txtAbout.setBackground(new java.awt.Color(51, 0, 0));
        txtAbout.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAbout.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtAbout.setForeground(new java.awt.Color(255, 255, 255));
        txtAbout.setText("\t\t• Abstract\n\nOur project aims to develop a comprehensive Student Management System that \nstreamlines administrative tasks related to student information, academic records, \nand performance tracking.The system will enhance efficiency, reduce manual effort,\nand provide a user-friendly interface for both students and administrators.\n\n\t\t• Proposed System\n\nThis Student Management System will offer the following features :\n\n1. User Registration and Authentication:\n\ta.Users (students and administrators) can register and log in securely. \n2.Student Profile Management:\n\ta.Students can view and update their personal information\n\t  (e.g., name, contact details, address). Administrators can manage user \n\t  accounts (add, edit, delete).\n\tb.Students can select their Course and semester.\n3.Attendance Entry and Display:\n\ta.Administrators can mark and manage student.\n\tb.Students can view their Attendance & Attendance percentage.\n4.Notes, Assignments, Question Papers:\n\ta.Instructors can update Notes, Assignments, Question Papers\n\tb.Instructors can Assign Task\n5.User-Friendly Interface:\n\ta.Intuitive design for ease of use.\n6.Role-Based Access Control:\n\ta.Secure access for administrators and students.\n\n\t\t• Conclusion\n\nThe proposed Student Management System will revolutionize student administration, \nenhance data accuracy, and improve overall efficiency. By implementing this system, \neducational institutions can focus more on student development and less on administrative\noverhead.\n");
        txtAbout.setFocusable(false);
        jScrollPane1.setViewportView(txtAbout);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 680, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        new Settings();
    }//GEN-LAST:event_btn_backActionPerformed

    public static void main(String args[]) {
        new SettingsAbout();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtAbout;
    // End of variables declaration//GEN-END:variables
}
