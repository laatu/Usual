package sqlimagedatabase;
import java.sql.*;
import java.io.*;
public class InsertImage{
	public static void main(String[] args){
		System.out.println("Insert Image Example!");
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "feedback";
		String userName = "root";
		String password = "";
		Connection con = null;
		try{
		   Class.forName(driverName);
		   con = DriverManager.getConnection(url+dbName,userName,password);
		   Statement st = con.createStatement();
                    System.out.println(System.getProperty("user.dir"));
		   File imgfile = new File("pic.ico");
		  String p=imgfile.getParent();
                   System.out.println(p);
		  FileInputStream fin = new FileInputStream(imgfile);
		 
		   PreparedStatement pre =
		   con.prepareStatement("insert into image values(?,?,?)");
		 
		   pre.setString(1,"test");
		   pre.setInt(2,3);
		   pre.setBinaryStream(3,(InputStream)fin,(int)imgfile.length());
		   pre.executeUpdate();
		   System.out.println("Successfully inserted the file into the database!");

		   pre.close();
		   con.close(); 
		}catch (Exception e1){
			System.out.println(e1.getMessage());
		}
	}
}
