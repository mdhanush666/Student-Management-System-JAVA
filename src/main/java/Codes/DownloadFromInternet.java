package Codes;

import java.awt.Dimension;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;



public class DownloadFromInternet { 
    
    public static void saveUrl(final String fileName, final String url) throws MalformedURLException,IOException{
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        
        try {
            in = new BufferedInputStream(new URL(url).openStream());
            fout = new FileOutputStream(fileName);
            
            final byte data[] = new byte[1024];
            int count;
            
            int len, downloaded=0;
                
            while((len = in.read(data)) != -1){
                fout.write(data, 0, len);
                downloaded += len;
                System.out.printf("\rDownloaded...%2fkb",downloaded/1000.0f);

            }
            
            while((count = in.read(data,0,1024)) != -1){
                fout.write(data,0,count);
            }
        }
        finally{
            if(in != null){
                in.close();
            }
            if(fout != null){
                fout.close();
            }
        }        
    }
    
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Frame");
        
        JPanel panel = new JPanel();
        
        JButton btnDownload = new JButton("Download");
        JTextField txtFile = new JTextField();
        txtFile.setPreferredSize(new Dimension(100,30));
        JTextField txtUrl = new JTextField();
        txtUrl.setPreferredSize(new Dimension(100,30));
        
        frame.add(panel);
        
        panel.add(txtFile);
        panel.add(txtUrl);
        panel.add(btnDownload);
        
        btnDownload.addActionListener(e ->{
            try {
                saveUrl(txtFile.getText(), txtUrl.getText());
            }
            catch(IOException e1){
                e1.printStackTrace();
            }
        });
        
//        frame.setSize(400,400);
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.setLocation(null);
//        frame.setResizable(false);
        frame.setVisible(true);
        
    }            
}
