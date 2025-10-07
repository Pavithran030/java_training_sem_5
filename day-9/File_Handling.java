
import java.io.*;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) throws IOException {

        // Create a folders

        File f=new File("D:\\java_training\\day-9\\filehandling\\first_folder");
        f.mkdir(); 

        // Create a nested folders

        File f1=new File("D:\\java_training\\day-9\\filehandling\\nested_folder\\New_Folder");
        f1.mkdirs(); 

        // Create a File inside the Folder

        File f2=new File("D:\\java_training\\day-9\\filehandling\\first_folder\\empty.txt");
        f2.createNewFile();

        // To write in a File

        try(FileWriter wr=new FileWriter(f2);){
            wr.write("Hai this is my code for testing the File Handling........................");
            wr.close(); // or use wr.flush()
        }

        //To Read the file

        try(FileReader re=new FileReader(f2)){

            int str;
            while((str=re.read())!=-1){

                char c1=(char) str;
                System.out.print(c1);

            }
            re.close();
        }

        // Uisng a Scanner Class

        try(Scanner reader=new Scanner(f2)){
            while(reader.hasNextLine()){
                String st=reader.nextLine();
                System.out.print(st);
            }
        }
    }
    
}
