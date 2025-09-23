
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Number to find the Factorial : ");
            int n=sc.nextInt();
            Factorial n1=new Factorial();
            System.out.println("The Factorial for "+n+" is "+n1.fact(n));
        }
    }

    long fact(int a ){
        // if(a<=1) return a;
        // else return a*fact(a-1);
        return a<=1?a:a*fact(a-1);
    }
    
}
