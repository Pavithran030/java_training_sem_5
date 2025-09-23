
import java.util.Scanner;

public class Method_odd_even {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Number to check for odd ro even : ");
            int n=sc.nextInt();
            Method_odd_even ch=new Method_odd_even();
            System.out.println(ch.check(n));
            
        }
    }
    String check(int a){
        if(a%2==0) return "Even";
        else return "Odd";
    }
    
}
