
package Codes;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Dhanush
 */
public class DownloadURLTest {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the URL : ");
        String address = scan.nextLine();
        
        
        //while(!(address).equalsIgnoreCase("stopDhanush")){
                        
//            try {
//                URL url = new URL(address);
//                String paths[] = address.split("/");
//                String fileName = paths[paths.length -1];
//                InputStream is = url.openStream();
//                OutputStream os = new FileOutputStream("D:\\Download\\" + fileName);
//                byte [] bytes = new byte[1024];
//                int len, downloaded=0;
//                
//                while((len = is.read(bytes)) != -1){
//                    os.write(bytes, 0, len);
//                    downloaded += len;
//                    System.out.printf("\rDownloaded...%2fkb",downloaded/1000.0f);
//                    
//                } 
//                System.out.println("\nDownload Completed"); 
//                is.close();
//                os.close();
//                
//            } 
//            catch (Exception e) {
//                e.printStackTrace();
//            }
        //}
        
//        if(!Desktop.isDesktopSupported()){
//                System.out.println("Desktop not Supportted!");                
//            }
//            else{
//                try {
//                    Desktop desktop = Desktop.getDesktop();
//                    desktop.open(selectedFile);
//                    
//                } 
//                catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
        
    }
    
}
