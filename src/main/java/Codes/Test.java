
package Codes;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Test {
    
    String time;

//    public void timer(){        
//        
//        SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss a");
//        
//        while(true){            
//            time = now.format(Calendar.getInstance().getTime());
//            System.out.println(time);
//            try {
//                Thread.sleep(1000);
//            } 
//            catch (Exception e) {
//                e.printStackTrace();
//            }            
//        }
//
//    }
    
    Timer timer = new Timer();
    
    int timeCount = 20;
    String n = "APRIL";

    
    Test(){        
        //timer();
        TimerTask timerTask = new TimerTask(){
            
            @Override
            public void run(){
                
                System.out.println("Task Completed");                
            }            
        };
        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR,2024);
//        date.set(Calendar.MONTH,Calendar.APRIL);
//        date.set(Calendar.DAY_OF_MONTH,17);
        date.set(Calendar.HOUR_OF_DAY,18);
        date.set(Calendar.MINUTE,16);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);
                
        //timer.schedule(timerTask, 3000);
        timer.schedule(timerTask, date.getTime());
        
    }
            
    
//    //sql items...
//    Connection con = null;
//    Statement stm = null;
//    PreparedStatement pt  = null;
//    
//    String qry = null;

// DB Connect..    
    /*public void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_attendance";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement(); 
            
// modify column...in database...
//            for(int j = 1; j <= 31; j++){                  
//                qry = "ALTER TABLE july_2023 MODIFY COLUMN `" + j + "` VARCHAR(1)";
//                pt = con.prepareStatement(qry);
//                pt.executeUpdate();
//            }

            String arr[] = {                
                "november_2023","december_2023","january_2024","february_2024","march_2024"
            };            
            
            for(int a = 0; a < arr.length; a++){
                for(int i = 1; i <= 1; i++){
                    int temp = 20000,itempInt = 10000;
                    String stemp = "JK23ICT5D", itemp = "INS23ICT5D";

                    temp = temp + i;
                    itempInt = itempInt + i;

                    String out = stemp + temp;
                    String out2 = itemp + itempInt;
                    
//                    qry = "ALTER TABLE " + arr[a] + " MODIFY COLUMN MIS VARCHAR(15)";
//                    pt = con.prepareStatement(qry);
//                    pt.executeUpdate();

                    qry = "ALTER TABLE "+ arr[a] + " CHANGE `MIS` `ID` VARCHAR(15)";
                    pt = con.prepareStatement(qry);
                    pt.executeUpdate();                        
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        
    */
   // public static final String fPath = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\Excel Text\\Book1.xlsx";
    
//    public String ReadExcel(String SheetName,int rNum,int cNum){
//        
//        String data = "";
//        
//        try {
//            FileInputStream fis = new FileInputStream(fPath);
//            Workbook wb = new XSSFWorkbook(fis);
//            Sheet sh = wb.getSheet(SheetName);
//            Row ro = sh.getRow(rNum);
//            Cell ce = ro.getCell(cNum);
//            data = ce.getStringCellValue();
//            
//        } 
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        return data;
//        
//    }
//    
//    public static void writeExcel(String sheetName,int rNum,int cNum,String DATA){
//        
//        try {
//            FileInputStream fis = new FileInputStream(fPath);
//            Workbook wb = new XSSFWorkbook(fis);
//            Sheet sh = wb.getSheet(sheetName);
//            Row ro = sh.getRow(rNum);
//            Cell ce = ro.createCell(cNum);
//            ce.setCellValue(DATA);
//            FileOutputStream fos = new FileOutputStream(fPath);
//            wb.write(fos);
//        } 
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//    }
//    
    
    public static void main(String[] args) {
        
        
//        Test o = new Test();
//        
//        //String get = o.ReadExcel("Sheet1", 2, 1);
//        writeExcel("Sheet1", 3, 1, "Dhanush");
//        writeExcel("Sheet1", 3, 2, "mjkd1896");
//        
//        //System.out.println("Name is : " + get);

        //new Test();
        
//        java.util.Date date = new java.util.Date();
//        SimpleDateFormat nowY = new SimpleDateFormat("yyyy");
//        SimpleDateFormat nowM = new SimpleDateFormat("MMMM");
//        SimpleDateFormat nowD = new SimpleDateFormat("dd");
//        
//        String month = nowM.format(date);
//        int year = Integer.parseInt(nowY.format(date));
//        int day = Integer.parseInt(nowD.format(date));
//        
//        Connection con = null;
//        Statement stm = null;
//        PreparedStatement pt = null;
//        ResultSet rs = null;
//        String qry = null;
//        
//        String temp = "JK23ICT5D";
//        int tempInt = 10001;
//        
//        
//        
//        try {
//            String url = "jdbc:mysql://localhost:3306/studb";
//            String username = "Dhanush";
//            String password = "Dhanush!1896$";
//            
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection(url,username,password);
//            stm = con.createStatement();
//            
////            qry = "CREATE TABLE " + month.toLowerCase() + "_"+ year + "( "
////                    + "MIS VARCHAR(14) PRIMARY KEY,"
////                    + "`1` VARCHAR(1),`2` VARCHAR(1),`3` VARCHAR(1),`4` VARCHAR(1),"
////                    + "`5` VARCHAR(1),`6` VARCHAR(1),`7` VARCHAR(1),`8` VARCHAR(1),"
////                    + "`9` VARCHAR(1),`10` VARCHAR(1),`11` VARCHAR(1),`12` VARCHAR(1),"
////                    + "`13` VARCHAR(1),`14` VARCHAR(1),`15` VARCHAR(1),`16` VARCHAR(1),"
////                    + "`17` VARCHAR(1),`18` VARCHAR(1),`19` VARCHAR(1),`20` VARCHAR(1),"
////                    + "`21` VARCHAR(1),`22` VARCHAR(1),`23` VARCHAR(1),`24` VARCHAR(1),"
////                    + "`25` VARCHAR(1),`26` VARCHAR(1),`27` VARCHAR(1),`28` VARCHAR(1),"
////                    + "`29` VARCHAR(1),`30` VARCHAR(1),`31` VARCHAR(1))";
////            pt = con.prepareStatement(qry);
////            pt.executeUpdate();
////            JOptionPane.showMessageDialog(null, "Table Created Success");
////            
//            
//            
//            qry = "INSERT INTO "+ month.toLowerCase() + "_"+ year + "(`MIS`) VALUES"
//                    + "(?)";
//            
//            pt = con.prepareStatement(qry);
//            
//            for(int i = 1; i <= 27; i++){
//                pt.setString(1, temp + tempInt);
//                pt.executeUpdate();
//                tempInt++;
//            }
//        } 
//        catch (Exception e) {
//            e.printStackTrace();
//        }
    }  
}
