
import java.io.*;

public class File_Handling {
    public static void main(String[] args) throws IOException {

        // Create a folders
        File f=new File("D:\\java_training\\day-9\\filehandling\\first_folder");
        f.mkdir(); 

        // Create a nested folders
        File f1=new File("D:\\java_training\\day-9\\filehandling\\nested_folder\\New_Folder");
        f1.mkdirs(); 

        // Create a File inside the Folder
        File f2=new File("D:\\java_training\\day-9\\filehandling\\first_folder\\empty1.txt");
        f2.createNewFile();
    }
    
}
