package Codes;
/**
 *
 * @author Dhanush
 */

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends javax.swing.JFrame implements Runnable {

    DataInputStream dis;
    DataOutputStream dos;
            
    String reMsg,seMsg;
    
    Thread chat;
        
    
    public Server() {
        initComponents();
        
        setTitle("Server");
        setVisible(true);
        
        txtPane.setLayout(new BorderLayout());
        
        
        try {
            
            ServerSocket ss = new ServerSocket(16000);
            Socket s = ss.accept();
            
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            
            
            chat = new Thread(this);
            chat.setDaemon(true);
            chat.start();
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSend = new javax.swing.JButton();
        txtMsg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 248, -1, -1));
        jPanel1.add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 204, 209, -1));

        txtPane.setEditable(false);
        txtPane.setBackground(new java.awt.Color(51, 51, 51));
        txtPane.setForeground(new java.awt.Color(255, 255, 255));
        txtPane.setFocusable(false);
        jScrollPane1.setViewportView(txtPane);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        if(txtMsg.getText().isEmpty()){
            
        }
        else{
            seMsg = txtMsg.getText();
            txtMsg.setText(null);
            
            try {
                txtPane.setText(txtPane.getText() + "me : " + seMsg + "\n");
                dos.writeUTF(seMsg);
                dos.flush();
            } 
            catch (Exception e) {

            }
        }
        
    }//GEN-LAST:event_btnSendActionPerformed

    
    public static void main(String args[]) {
        new Server();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){            
            try {                               
                reMsg = dis.readUTF();                
                txtPane.setText(txtPane.getText() + "Client : " + reMsg + "\n"); 
                txtPane.add(this,BorderLayout.EAST);
            } 
            catch (Exception e) {
                
            }            
        }
    }
}
