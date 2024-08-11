package Codes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dhanush extends javax.swing.JFrame {

    Box vertical = Box.createVerticalBox();
    
    /*
    
    if(e.getSource() == btnSend){                
                msgSend = txtMsg.getText();
                
                System.out.println(txtMsg.getText());
                
                try {
                    JPanel right = new JPanel(new BorderLayout());
                    right.setBackground(new Color(90,0,0));
                    right.add(setMsgesSend(txtMsg.getText()), BorderLayout.LINE_END);
                    vertical.add(right);
                    vertical.add(Box.createVerticalStrut(15));

                    msgControlPanel.add(vertical, BorderLayout.PAGE_START);

                    
                    dos = new DataOutputStream(s.getOutputStream());
                    dos.writeUTF(txtMsg.getText());
                    txtMsg.setText(null);
                    
                    repaint();
                    invalidate();
                    validate();
                } 
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                
        }
        
        @Override
    public void run() {
        
        while(true){            
            try {        
                dis = new DataInputStream(s.getInputStream());
                msgRe = dis.readUTF();                
                JPanel left = new JPanel(new BorderLayout());
                left.setBackground(new Color(90,0,0));
                left.add(setMsgesReceive(msgRe), BorderLayout.LINE_START);
                vertical.add(left);
                vertical.add(Box.createVerticalStrut(15));

                msgControlPanel.add(vertical, BorderLayout.PAGE_START);
                repaint();
                invalidate();
                validate();
            } 
            catch (Exception e) {
                
            }            
        }
        
    }
    
    
    */
    
    /*
        
        private int pX,pY;
        M Drag = this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
        M Press = pX = evt.getX(); pY = evt.getY();
    
    */
    
    public JLabel formatLabel(String txt){
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        
        
        JLabel lbl = new JLabel("<html><p style = \"width:120px; text-align:right;\">" + txt + " "
        + "<html><p style = \"font-size : 10px; text-align:right;\">" + sdf.format(date));
        
        lbl.setBackground(new Color(102,0,0));
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Arial",Font.PLAIN,18));
        lbl.setOpaque(true);
        lbl.setBorder(new EmptyBorder(0,5,0,10));

        return lbl;
        
    }
   
    public Dhanush() {
        initComponents();
        
        panelContainer.setLayout(new BorderLayout());
        
        ImageIcon img = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\After Login Instructor\\teachers.png");
        Image getImg  = img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        
        ImageIcon newImg = new ImageIcon(getImg);
        
        lblImg.setIcon(newImg);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtMsg = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("-");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        btnSend.setText("Send");
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(btnSend)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSend)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        panelContainer.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelContainer);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        if(txtMsg.getText() != null){
            
            String getMsg = txtMsg.getText();
            txtMsg.setText(null);
            txt2.setText("Okii");
            
            
//            JLabel lbl = new JLabel("<html><p style = \"width: 120px; text-align:right\">" + getMsg + "</p></html>");
//            lbl.setBackground(new Color(0,0,0,1));
//            lbl.setForeground(Color.WHITE);
//            lbl.setFont(new Font("Arial",Font.PLAIN,16));
//            lbl.setOpaque(true);
//            lbl.setBorder(new EmptyBorder(0,5,0,10));


                        
            JPanel right = new JPanel(new BorderLayout());
            right.setBackground(new Color(0,0,0,0));
            
            JPanel left = new JPanel(new BorderLayout());
            left.setBackground(new Color(0,0,0,0));
            
            right.add(formatLabel(getMsg),BorderLayout.EAST);
            left.add(formatLabel(txt2.getText()),BorderLayout.WEST);
            
            vertical.add(right);
            vertical.add(left);
            vertical.add(Box.createVerticalStrut(5));
                        
            panelContainer.add(vertical,BorderLayout.PAGE_START);
            
            
            repaint();            
            invalidate();
            validate();;
        }        
    }//GEN-LAST:event_btnSendActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formMouseDragged

    private int pX,pY;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
        
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        pX = evt.getX(); pY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {        
        new Dhanush();            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables
}
