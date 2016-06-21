/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusHirear;

/**
 *
 * @author laatuji
 */
public class Main {
        public static void main(String args[]) throws Exception {

        for(int i=1;i<=4;i++)
        {
       Manager R1 = new Manager("Manager-"+i);
        R1.start();
        }
        Thread.sleep(20000);
        System.exit(0);
   

    }
    
}
