
import java.util.Scanner;

public class Swap_No {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Number-1 : ");
            int n1=inp.nextInt();
            System.out.print("Enter the Number-2 : ");
            int n2=inp.nextInt();
            System.out.println("The Number Before Swap "+n1+" and "+n2);

            // Using * / Operators
            int s1=n1,s2=n2;
            
            // Using + - Operators
            
            n2=n1+n2;
            n1=n2-n1;
            n2=n2-n1;

            System.out.println("The Number After Swap "+n1+" and "+n2);

            s2=s1*s2;
            s1=s2/s1;
            s2=s2/s1;

            System.out.println("The Number After Swap Using (* / Operators) "+s1+" and "+s2);
        }
    }
}
