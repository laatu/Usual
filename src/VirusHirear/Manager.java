/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusHirear;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Manager implements Runnable {

    private Thread t;
    private String threadName;
    

    Manager(String name) {
        threadName = name;
    
        //System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            String l = "virus_area/";
            for (int folder = 1; folder <6; folder++) {
                Files.createDirectories(Paths.get(l + String.valueOf(folder)));
                System.out.println(l + " from " + threadName + " going for " + folder);
                for (int fileno = 1; fileno < 8; fileno++) {

                    ThreWorker Tw = new ThreWorker("ThreWorker", l + String.valueOf(folder), fileno);
                    Tw.start();
                }

            }
        } catch (/*Interrupted*/Exception e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
