/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collec;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class N {

   public static void main(String[] args) {

      // Create the sorted set
      SortedSet set = new TreeSet(); 

      // Add elements to the set
       String a = new String("a");
       String b = new String("d");
       String c = new String("h");
       set.add(a);
       set.add(b);
       set.add(c);
       System.out.println(set);
       if (set.contains(c)) {
           System.out.println("changed");
           c="m";
//         //set.remove();
System.out.println("value of c is "+c);
         }

      // Iterating over the elements in the set
      Iterator it = set.iterator();
      while (it.hasNext()) {
         // Get element
         Object element = it.next();
         
         System.out.println(element.toString());       
      }
   }
}