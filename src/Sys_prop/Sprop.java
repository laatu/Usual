package Sys_prop;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Sprop {
  
   public static void main(String[] args) throws IOException {

   // this will list the current system properties
   Properties p = System.getProperties();
   p.list(System.out);
   //p.list(new PrintStream(new FileOutputStream("prop.txt",false)));
   //char [] c = new char[50];
   String c=new String();
   //StringBuilder c=new StringBuilder();
   new FileReader("prop.txt").read(c.toCharArray());
       System.out.println("In File");
   for(char ch:c.toCharArray())
   {
       System.out.println(ch);
       
   }
   //new FileWriter("a.txt",true).write();
}

    private static void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    