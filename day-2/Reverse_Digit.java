
import java.util.Scanner;

public class Reverse_Digit {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the number to print the Reverse Order : ");
            int n1=inp.nextInt();
            int store=n1;
            String st="";
            while(n1!=0){
                int digit=n1%10;
                st+=digit;
                n1/=10;
            }
            System.out.println("The Reverse Number of "+store+" is "+st);
        }
    }
    
}
