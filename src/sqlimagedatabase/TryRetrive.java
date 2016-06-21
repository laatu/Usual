package sqlimagedatabase;
import java.sql.*;
import java.io.*;
public class TryRetrive{
	public static void main(String[] args){
		System.out.println("Retrive Image Example!");
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "feedback";
		String userName = "root";
		String password = "";
		Connection con = null;
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url+dbName,userName,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select image from image");
			int i = 0;
			while (rs.next()) {
				InputStream in = rs.getBinaryStream(1);
				OutputStream f = new FileOutputStream(new File("test"+i+".ico"));
				i++;
				int c = 0;
				while ((c = in.read()) > -1) {
					f.write(c);
				}
				f.close();
				in.close();
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}


//your source is good. but this part :
//InputStream in = rs.getBinaryStream(1);
//while ((c = in.read()) > -1) {
//f.write(c);
//}
//is very costly especially if the image is big. i tried above approach and it took about 27 seconds to write one file of 7.2MB.
//
//I found an alternative approach as below : 
//
//Blob b=rs.getBlob(2); 
//byte barr[]=b.getBytes(1,(int)b.length());
//FileOutputStream fout=new FileOutputStream("./sample/sample.jpg");
//fout.write(barr);
//
//This is significantly faster. It took about 0.1 seconds to write the same image of 7.2MB.