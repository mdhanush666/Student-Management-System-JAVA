package Codes;

/**
 *
 * @author Dhanush
 */

import java.io.DataInputStream;
import java.net.Socket;
import java.io.DataOutputStream;
import java.net.InetAddress;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;


public class Client extends javax.swing.JFrame implements Runnable {
    
    DataInputStream dis;
    DataOutputStream dos;
            
    String reMsg,seMsg;
    
    Thread chat;
    
    public Client() {
        initComponents();
        
        setTitle("Client");
        setVisible(true);
        
        try {
            
            InetAddress add = InetAddress.getLocalHost();
            System.out.println(add);
            
            Socket s = new Socket(add,16000);
            
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
        txtMsg = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        t = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        t.setEditable(false);
        t.setForeground(new java.awt.Color(0, 0, 0));
        t.setBorder(null);
        t.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t)
                    .addComponent(btnSend)
                    .addComponent(txtMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSend)
                .addGap(32, 32, 32))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        if(txtMsg.getText().isEmpty()){
            
        }
        else{
            seMsg = txtMsg.getText();
            txtMsg.setText(null);

            try {
                t.setHorizontalAlignment(RIGHT);
                t.setText(t.getText() + "me : " + seMsg + "\n");
                dos.writeUTF(seMsg);
                dos.flush();
            } 
            catch (Exception e) {

            }
        }        
    }//GEN-LAST:event_btnSendActionPerformed

    public static void main(String args[]) {
        new Client();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){            
            try {
                reMsg = dis.readUTF();
                t.setHorizontalAlignment(LEFT);
                t.setText(t.getText() + "Server : " + reMsg + "\n");
            } 
            catch (Exception e) {
                
            }            
        }
    }
}
