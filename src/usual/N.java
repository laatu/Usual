/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usual;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author laatuji
 */
public class N {
    public static void main(String[] args) {
        try {
    // Execute command
    String command = "cmd /c start cmd.exe";
    Process child = Runtime.getRuntime().exec(command);
    // Get output stream to write from it
    OutputStream out = child.getOutputStream();
    out.write("cd C:/ /r/n".getBytes());
    out.flush();
    out.write("dir /r/n".getBytes());
    out.close();
} catch (IOException e) {
}
    }
            
}
