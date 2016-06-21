/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dektopentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author laatuji
 */
public class Crea {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            String mycontent = "[Desktop Entry]\n"
                    + "Type=Application\n"
                    + "Name=Technic Launcher\n"
                    + "Comment=trying to make a desktop entry programatically\n"
                    + "Exec=/home/laatuji/lOGIN.jar\n"
                    + "Icon=/usr/share/idons/ico.png\n"
                    + "Terminal=true\n"
                    + "Categories=trying;";
            //Specify the file name and path here
            File file = new File("/usr/share/applications/lOGIN.desktop");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}
