
import java.util.Scanner;

public class Longest_String {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the String to find the Longest word : ");
            String str=sc.nextLine();
            String[] temp=str.split(" ");
            StringBuffer fin= new StringBuffer();
            int big=temp[0].length();
            for(String temp1 : temp) {
                if (big <temp1.length()) {
                    // big = temp1.length();
                    fin.append(temp1);
                }
            }
            
            System.out.println(fin);
        }
    }
    
}
