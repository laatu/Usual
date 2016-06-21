//package File.search;
////Following example demonstrares how to search and get a list of all files under a specified directory by using dir.list() method of File class.
//
//import java.io.File;
//
//
//
//
//public class TellFiles {
//   public static void main(String[] argv) 
//   throws Exception {
////      File dir = new File("directoryName");
//File dir = new File(System.getProperty());
//      String[] children = dir.list();
//      if (children == null) {
//         System.out.println("does not exist or  is not a directory");
//      }
//      else {
//         for (int i = 0; i < children.length; i++) {
//            String filename = children[i];
//            System.out.println(filename);
//         }
//      }
//   }
//}