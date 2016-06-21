///*/*
//* To change this license header, choose License Headers in Project Properties.
//* To change this template file, choose Tools | Templates
//* and open the template in the editor.
//*/
//package sqlimagedatabase;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStream;
//import static java.lang.System.in;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//
///**
// *
// * @author laatuji
// */
//public class Retiv {
//    public static void main(String[] args) {
//        
//        System.out.println("Retrive Image Example!");
//        String driverName = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://localhost:3306/";
//        String dbName = "test";
//        String userName = "root";
//        String password = "";
//        Connection con = null;
//        try{
//            Class.forName(driverName);
//            con = DriverManager.getConnection(url+dbName,userName,password);
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select image from image");
//            int i = 0;
//  }          
//            
//            String sql = "Select * from tabimg where Nid='"+Integer.parseInt(img.getText())+"'";
//            Statement stmt2 = con.createStatement();
//            rs = stmt2.executeQuery(sql);
//            while(rs.next())
//            {
//                lblnid.setText(String.valueOf(rs.getInt("Nid")));
//                byte[] fileBytes;
//                fileBytes = rs.getBytes(2);
//                tmpFile = new File("tmpImage");
//                OutputStream targetFile=
//                        new FileOutputStream(tmpFile);
//                targetFile.write(fileBytes);
//                targetFile.close();
//                ImageIcon icon = new ImageIcon(ImageIO.read(f2));
//                String ss=f2.getAbsolutePath();
//                img.setText(ss);
//                jLabel1.setIcon(new ImageIcon(ss));f.close();
//                in.close();
//                f2.delete();
//                f2.deleteOnExit();
//                
//                targetFile.flush();
//                targetFile.close();
////
//tmpFile.delete();
//            }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//    
//}