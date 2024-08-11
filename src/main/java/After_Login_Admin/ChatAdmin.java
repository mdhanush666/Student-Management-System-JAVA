
package After_Login_Admin;

import After_Login_Instructor.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.sql.*;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Dhanush
 */
public class ChatAdmin extends javax.swing.JFrame implements ActionListener,Runnable{
    
    ImageIcon btnSendIcon = new ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\sendMsg.png");
    
    JButton btnSend,btn;
    JPanel panelFooter;
    
    public static JTextPane txtMsg;
    
    public static Box vertical = Box.createVerticalBox();
    public static Box verticalMsg = Box.createVerticalBox();
    
    public static DataInputStream dis;
    public static DataOutputStream dos;
    
    public static String msgSend,msgRe;
    
    public static Socket s;
    
    Thread chat;
    
    
// DB Connect elements..    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pt = null;
    String qry = null;

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
    
        String getImgPath = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile.png"; // to set in chatting panel body header

    public JPanel formatLabel(String txt, String Pimg){ 
        
        JPanel panel1 = new JPanel(new BorderLayout());
        
        panel1.setBackground(new Color(30,30,30));
        panel1.setBorder(new EmptyBorder(5,5,5,5));
        
        btn = new JButton("<html><p style = \"text-align:left;\">" + txt + "</p></html>");
        
        ImageIcon img = new ImageIcon(Pimg);
        Image getImg  = img.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        
        ImageIcon newImg = new ImageIcon(getImg);
        
        JLabel lblImg = new JLabel(newImg);
        lblImg.setBorder(new MatteBorder(1,0,1,0,Color.GRAY));
        
        btn.setContentAreaFilled(false);        
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial",Font.PLAIN,18));
        btn.setFocusable(false);
        btn.setBorder(new MatteBorder(1,0,1,0,Color.GRAY));
        btn.setPreferredSize(new Dimension(150,30));
        btn.addActionListener(this);
        
        panel1.add(lblImg,BorderLayout.LINE_START);
        panel1.add(btn,BorderLayout.LINE_END);
                

        return panel1;
        
    }
    
    public static JPanel setMsgesSend(String out) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(0,0,0,0));
        
        JLabel output = new JLabel("<html><p style=\"width: 150px; text-align:right;\">" + out + "</p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(0,0,0,0));
        output.setForeground(Color.WHITE);
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panel.add(output);
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        JLabel time = new JLabel("<html><p style=\"width: 150px; text-align:right;\">" + sdf.format(cal.getTime()) + "</p></html>");
        //time.setText(sdf.format(cal.getTime()));
        time.setBackground(new Color(0,0,0,0));
        time.setOpaque(true);
        time.setForeground(new Color(220,220,220));
        
        panel.add(time);
        
        return panel;
    }
// Receving msges..    
    public static JPanel setMsgesReceive(String out) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(0,0,0,0));
        
        JLabel output = new JLabel("<html><p style=\"width: 150px; text-align:left;\">" + out + "</p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(0,0,0,0));
        output.setForeground(Color.WHITE);
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(0, 30, 0, 10));
        
        panel.add(output);
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        time.setBackground(new Color(0,0,0,0));
        time.setOpaque(true);
        time.setForeground(new Color(220,220,220));
        time.setBorder(new EmptyBorder(0,10,0,0));
        
        panel.add(time);
        
        return panel;
    }
    
// Constructor..    
    public ChatAdmin() {
        initComponents();        
        dbConnect();
        
                
        msgControlPanel.setLayout(new BorderLayout());
        
        chatListPanel.setLayout(new BorderLayout());
        chatListPanel.setBackground(new Color(30,30,30));
        
        btn_sideBarShow.setVisible(false);
        
        panelBody.setLayout(new BorderLayout());
        panelBody.setBackground(new Color(40,0,0));
        
        panelFooter = new JPanel(new FlowLayout());
        panelFooter.setBackground(new Color(60,0,0));

        
        txtMsg = new JTextPane();
        txtMsg.setPreferredSize(new Dimension(350,30));
        txtMsg.setBackground(new Color(20,0,0));
        txtMsg.setForeground(Color.WHITE);
        txtMsg.setFont(new Font("Arial",Font.PLAIN,16));
        txtMsg.setMinimumSize(new Dimension(350,30));
        txtMsg.setText(null);
        
        btnSend = new JButton();
        btnSend.setContentAreaFilled(false);
        btnSend.setFocusable(false);
        btnSend.setIcon(btnSendIcon);
        btnSend.setBorder(new EmptyBorder(0,10,0,10));
        btnSend.addActionListener(this);
        
        panelFooter.add(txtMsg);
        panelFooter.add(btnSend);
        
        panelBody.add(scrlPaneMsg,BorderLayout.CENTER);
        panelBody.add(panelFooter,BorderLayout.SOUTH);
                
// connect to db and get user names and profile icon..
//        try {
//            qry = "SELECT Full_Name,ProIMG FROM student_login_details INNER JOIN "
//            + "student_registration ON student_login_details.MIS_No = student_registration.MIS_No; ";
//            
//            qry = "SELECT ProIMG FROM instructor_login_details";
//
//            rs = stm.executeQuery(qry);
//            
//            while(rs.next()){
// Side bar Contact list set....        
                vertical.add(formatLabel("Instructors",getImgPath));
                vertical.add(Box.createVerticalStrut(5));

                chatListPanel.add(vertical,BorderLayout.PAGE_START);

                repaint();            
                invalidate();
                validate();
//            }            
//        } 
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        chat = new Thread(this);
        chat.setDaemon(true);
        chat.start();
        
        lblName.setText(null);
        lblProfile.setText(null);

        panelFooter.setVisible(false);
        panelBody.setVisible(false);
        
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btn_sideBarBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrlPaneSidePanel = new javax.swing.JScrollPane();
        chatListPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        lblProfile = new javax.swing.JLabel();
        btn_sideBarShow = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        scrlPaneMsg = new javax.swing.JScrollPane();
        msgControlPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(40, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        sidePanel.setBackground(new java.awt.Color(20, 20, 20));

        btn_sideBarBack.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\backward_35px.png")); // NOI18N
        btn_sideBarBack.setToolTipText("Hide Contact List");
        btn_sideBarBack.setBorder(null);
        btn_sideBarBack.setContentAreaFilled(false);
        btn_sideBarBack.setFocusable(false);
        btn_sideBarBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sideBarBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Contacts");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout chatListPanelLayout = new javax.swing.GroupLayout(chatListPanel);
        chatListPanel.setLayout(chatListPanelLayout);
        chatListPanelLayout.setHorizontalGroup(
            chatListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        chatListPanelLayout.setVerticalGroup(
            chatListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        scrlPaneSidePanel.setViewportView(chatListPanel);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sideBarBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrlPaneSidePanel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_sideBarBack))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlPaneSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headerPanel.setBackground(new java.awt.Color(20, 20, 20));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setToolTipText("Close");
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
        headerPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 10, 50, 40));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setFont(new java.awt.Font("Eras Medium ITC", 0, 50)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setText("-");
        btnMinimize.setToolTipText("Minimize");
        btnMinimize.setBorder(null);
        btnMinimize.setBorderPainted(false);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseReleased(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        headerPanel.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 20, 40, 30));

        lblProfile.setText("jLabel1");
        headerPanel.add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 50));

        btn_sideBarShow.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\forward_35px.png")); // NOI18N
        btn_sideBarShow.setToolTipText("Show Contact List");
        btn_sideBarShow.setBorder(null);
        btn_sideBarShow.setContentAreaFilled(false);
        btn_sideBarShow.setFocusable(false);
        btn_sideBarShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sideBarShowActionPerformed(evt);
            }
        });
        headerPanel.add(btn_sideBarShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 60, 50));

        lblName.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        lblName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        headerPanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 40));

        panelBody.setBackground(new java.awt.Color(102, 102, 102));

        scrlPaneMsg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                scrlPaneMsgMouseDragged(evt);
            }
        });
        scrlPaneMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrlPaneMsgMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                scrlPaneMsgMousePressed(evt);
            }
        });
        scrlPaneMsg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                scrlPaneMsgPropertyChange(evt);
            }
        });

        msgControlPanel.setBackground(new java.awt.Color(100, 0, 0));

        javax.swing.GroupLayout msgControlPanelLayout = new javax.swing.GroupLayout(msgControlPanel);
        msgControlPanel.setLayout(msgControlPanelLayout);
        msgControlPanelLayout.setHorizontalGroup(
            msgControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        msgControlPanelLayout.setVerticalGroup(
            msgControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        scrlPaneMsg.setViewportView(msgControlPanel);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrlPaneMsg)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(scrlPaneMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

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

    private void btn_sideBarBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sideBarBackActionPerformed
//        // TODO add your handling code here:
        sidePanel.setVisible(false);
        setSize(480,500);
        btn_sideBarShow.setVisible(true);
    }//GEN-LAST:event_btn_sideBarBackActionPerformed

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

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeMouseReleased

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btn_sideBarShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sideBarShowActionPerformed
        // TODO add your handling code here:
        sidePanel.setVisible(true);
        setSize(735,520);
        btn_sideBarShow.setVisible(false);
    }//GEN-LAST:event_btn_sideBarShowActionPerformed
    private int pX,pY;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        pX = evt.getX(); pY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void scrlPaneMsgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrlPaneMsgMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_scrlPaneMsgMouseDragged

    private void scrlPaneMsgPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_scrlPaneMsgPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_scrlPaneMsgPropertyChange

    private void scrlPaneMsgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrlPaneMsgMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_scrlPaneMsgMousePressed

    private void scrlPaneMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrlPaneMsgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scrlPaneMsgMouseClicked

    public static void main(String args[]) {
       
       new ChatAdmin();
       
       try {            
            ServerSocket ss = new ServerSocket(1010);
            s = ss.accept();
            
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            
        } 
        catch (Exception e) {
            System.out.println("Here");                    
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btn_sideBarBack;
    private javax.swing.JButton btn_sideBarShow;
    private javax.swing.JPanel chatListPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProfile;
    public static javax.swing.JPanel msgControlPanel;
    private javax.swing.JPanel panelBody;
    private javax.swing.JScrollPane scrlPaneMsg;
    private javax.swing.JScrollPane scrlPaneSidePanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn){
            
            ImageIcon img = new ImageIcon(getImgPath);
            Image getImg  = img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        
            ImageIcon newImg = new ImageIcon(getImg);
            
            lblProfile.setIcon(newImg);
            lblName.setText("Instructors");
            
            panelFooter.setVisible(true);
            panelBody.setVisible(true);
            
        }
        if(e.getSource() == btnSend){  
            
            if(!txtMsg.getText().equals(null)){
                
                msgSend = txtMsg.getText();

                try {
                    JPanel right = new JPanel(new BorderLayout());
                    right.setBackground(new Color(90,0,0));
                    right.add(setMsgesSend(txtMsg.getText()), BorderLayout.LINE_END);

                    verticalMsg.add(right);
                    verticalMsg.add(Box.createVerticalStrut(10));

                    msgControlPanel.add(verticalMsg, BorderLayout.PAGE_START);


                    dos.writeUTF("Admin : " + txtMsg.getText());
                    txtMsg.setText(null);


                    repaint();
                    invalidate();
                    validate();
                } 
                catch (Exception ex) {
//                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "No Instructors have been Connected!","Chat Information",JOptionPane.ERROR_MESSAGE);
                    txtMsg.setText(null);
                }

                scrlPaneMsg.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){
                    public void adjustmentValueChanged(AdjustmentEvent e){
                        e.getAdjustable().setValue(e.getAdjustable().getMaximum());
                    }
                });
            }    
        }
    }
    
    
    
    @Override
    public void run() {
        
        while(true){            
            try {        
                msgRe = dis.readUTF();                
                JPanel left = new JPanel(new BorderLayout());
                left.setBackground(new Color(90,0,0));
                left.add(setMsgesReceive(msgRe), BorderLayout.LINE_START);
                verticalMsg.add(left);
                verticalMsg.add(Box.createVerticalStrut(15));

                msgControlPanel.add(verticalMsg, BorderLayout.PAGE_START);
                
                repaint();
                invalidate();
                validate();
            } 
            catch (Exception e) {
                
            }            
        }
        
    }

}
