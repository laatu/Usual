/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author laatuji
 */
public class Fold {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String s=System.getProperty("user.home");
        File f = new File("/home/laatuji/NetBeansProjects/group/af");               
        boolean b = f.mkdirs();
        System.out.println(b);
        String path = path();
        String decodedPath = URLDecoder.decode(path, "UTF-8");
        System.out.println(decodedPath);         
    }
    
    public static String  path() throws URISyntaxException
    {
        return (Fold.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
    }
}
