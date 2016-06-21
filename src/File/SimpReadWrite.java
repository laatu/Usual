/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class SimpReadWrite{

   public static void main(String args[])throws IOException{

      File file = new File("Hello1.txt");
      // creates the file
      file.createNewFile();
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file,true); 
      // Writes the content to the file      TRUE to append
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      //Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      List <String> l=new ArrayList();
      char [] a = new char[50]; 
      fr.read(a); // reads the content to the array
     
      for(char c : a)
          System.out.print(c); //prints the characters one by one
      fr.close();
   }
}