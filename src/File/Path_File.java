/*
    1) Create File if not there and add content.
    2) Ouput the content of file.
    3) Output path of File
*/
package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;
import static java.nio.file.Files.lines;

/**
 *
 * @author laatuji
 */
public class Path_File {

    public static void main(String[] args) {

        try {

            Path testDirectoryPath = Paths.get("C:/home/tust");

            //Path testDirectory = Files.createDirectory(testDirectoryPath);
            //creates a single directory not the whole directory tree
            // that's why testdirectory is the name been given to 
            //  variable of the Path
            Files.createDirectories(testDirectoryPath);

            System.out.println("Directory created successfully!");
            Path newFilePath = FileSystems.getDefault().
                    getPath("C:/home/tust/Fim.txt");
            //System.out.println(newFilePath.toString() + "hello");
            File file = new File(newFilePath.toString());
            if (file.exists()) {
                System.err.println("existeo");
            }
            if (!file.exists()) {
                System.out.println("creatio");
                file.createNewFile();
                System.err.println("done");
            }
            Path testFile = Paths.get("C:/home/tust/Fim.txt");
            String contents = "Mai jai";

            Files.write(testFile, contents.getBytes(), StandardOpenOption.CREATE);
            System.out.println("\n The matter in the file is \n" + Files.newBufferedReader(testFile).readLine());
            

            System.out.println("\nwhich is testfile(Path) refferred to ->" + testFile.toFile());

            System.out.println("\nEnd of programme!");
        } catch (FileAlreadyExistsException a) {

            System.out.println("File or directory already exists!");
        } catch (IOException ex) {

            //ex.printStackTrace();
            System.out.println(ex);
        }

    }

}
