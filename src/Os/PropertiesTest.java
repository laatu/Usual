package Os;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args)
        throws Exception {

        // set up new properties object
        // from file "myProperties.txt"
        File f=new File("myProperties.txt");
        if (f.exists());else f.createNewFile();
        FileInputStream propFile =
            new FileInputStream( "myProperties.txt");
        
        Properties p =
            new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
    }
}