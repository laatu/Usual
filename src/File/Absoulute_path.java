/*
returns Absolute Path
 */
package File;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author laatuji
 */
public class Absoulute_path {

    public static void main(String[] args) throws IOException {
        //Runtime.getRuntime().exec("/");
        String homedir = System.getProperty("user.home");
        
    File wd = new File(homedir+"sam");
        
        File f = new File(homedir+"/pic.ico");
        System.out.println(f);
               
        String path = "";
        boolean bool = false;
        try {
            // create new files
            //f = new File(+"sam");
            // returns true if the file exists
            bool = f.exists();
            System.out.println(bool);
            // if file exists
            if (bool) {
                // get absolute path
                path = f.getAbsolutePath();
                // prints
                System.out.print("Absolute Pathname " + path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
