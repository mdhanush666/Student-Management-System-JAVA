
package Main_Forms;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class index extends javax.swing.JFrame {
    
    ImageIcon frameIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\VTA-Logo.png");


    public index() {
        initComponents();
        
        setIconImage(frameIcon.getImage());
        
        setVisible(true);
        
        progressBarIndex.setBackground(new Color(0,0,50));
        progressBarIndex.setStringPainted(true);        
        
        for(int i = 0; i <= 100; i++){
            
            if(i > 80){
                
                try {
                    progressBarIndex.setValue(i);
                    Thread.sleep(20);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            else if(i > 70){
                
                try {
                    progressBarIndex.setValue(i);
                    Thread.sleep(150);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            else if(i > 50){
                
                try {
                    progressBarIndex.setValue(i);
                    Thread.sleep(70);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else{
            
                try {
                    progressBarIndex.setValue(i);
                    Thread.sleep(20);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            
            if(i % 2 == 0){
                pleaseWait.setText("Please Wait.");
            }
            else{
                pleaseWait.setText("Please Wait..");
            }
            
            if(i == 100){
                
                this.setVisible(false);
                new first();
                
                
            }
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        progressBarIndex = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        pleaseWait = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBarIndex.setBackground(new java.awt.Color(0, 0, 51));
        progressBarIndex.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        progressBarIndex.setForeground(new java.awt.Color(204, 0, 204));
        progressBarIndex.setBorder(null);
        progressBarIndex.setBorderPainted(false);
        jPanel2.add(progressBarIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, 720, 20));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STUDENT MANAGEMENT SYSTEM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 700, -1));

        pleaseWait.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        pleaseWait.setForeground(new java.awt.Color(255, 255, 255));
        pleaseWait.setText("Please Wait");
        jPanel2.add(pleaseWait, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Main_img.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 260, 280));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\1.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\bg1.jpg")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
 
        new index();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pleaseWait;
    private javax.swing.JProgressBar progressBarIndex;
    // End of variables declaration//GEN-END:variables
}
