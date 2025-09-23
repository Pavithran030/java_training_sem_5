
import java.util.Scanner;

public class Sqr_Method {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number to find the Square : ");
            int s=sc.nextInt();
            Sqr_Method sq=new Sqr_Method();
            System.out.println(sq.square(s));
        }
    }
    long square(int a){
        return a*a;
    }
    
}
