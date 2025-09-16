
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Year to find Leap Year or Not : ");
            int year=inp.nextInt();
            if((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.println(year+ " is a Leap Year");
            }
            else {
                System.out.println(year+ " is Not a Leap Year");
            }
        }
    }
    
}
