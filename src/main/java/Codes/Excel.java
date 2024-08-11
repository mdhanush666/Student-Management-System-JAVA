
package Codes;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.sql.*;

public class Excel {
    
    String fPath = "D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\Excel Text\\Stu_Attendance.xlsx";
    
    public static Connection con = null;
    public static Statement stm = null;
    public static PreparedStatement pt = null;
    public static ResultSet rs =  null;
    public static String qry = null;
    
    public static void dbConnect(){
        
        String url = "jdbc:mysql://localhost:3306/student_attendance";
        String username = "Dhanush";
        String password = "Dhanush!1896$";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
            //System.out.println("DB Connect success");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("DB Connect Failed!");
        }
        
    }
    public String readExcelMIS(String sheetName,int rNum,int cNum){
    
        String data = null;
        
        try {          
            FileInputStream fis = new FileInputStream(fPath);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sh = wb.getSheet(sheetName);
            Row ro = sh.getRow(rNum);
            Cell ce = ro.getCell(cNum);
            data = ce.getStringCellValue();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
        
    }
    
    public int readExcel(String sheetName,int rNum,int cNum){
    
        int data = 0;
        
        try {          
            FileInputStream fis = new FileInputStream(fPath);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sh = wb.getSheet(sheetName);
            Row ro = sh.getRow(rNum);
            Cell ce = ro.getCell(cNum);
            data = (int)ce.getNumericCellValue();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
        
    }
    
    public static void main(String[] args) {
        
        dbConnect();
       /* 
        try {
            qry = "CREATE TABLE april_2024("
                    + "`MIS` VARCHAR(14) PRIMARY KEY,"
                    + "`1` INT, `2` INT, `3` INT, `4` INT, `5` INT,"
                    + "`6` INT, `7` INT, `8` INT, `9` INT, `10` INT,"
                    + "`11` INT, `12` INT, `13` INT, `14` INT, `15` INT,"
                    + "`16` INT, `17` INT, `18` INT, `19` INT, `20` INT,"
                    + "`21` INT, `22` INT, `23` INT, `24` INT, `25` INT,"
                    + "`26` INT, `27` INT, `28` INT, `29` INT, `30` INT, `31` INT"                    
                    + ")";
            pt = con.prepareStatement(qry);
            pt.executeUpdate();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
*/
        
        Excel obj1 = new Excel();      

        try {
            qry = "INSERT INTO `july_2023`(MIS, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pt = con.prepareStatement(qry);
            
            
            for(int i= 1; i <= 27; i++){
                
                pt.setString(1, obj1.readExcelMIS("JULYNEW",i,0));
                
                for(int j = 1; j <= 31; j++){
                    pt.setInt(j+1, obj1.readExcel("JULYNEW", i, j));
                }
                pt.executeUpdate();
            }
              
            System.out.println("Success");
        } 
        catch (Exception e) {
            System.out.println(e);
        }        
    }
    
}
