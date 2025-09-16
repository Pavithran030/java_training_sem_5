
import java.util.Scanner;

public class Greater_Nnumber {
    public static void main(String[] args) {
        try(Scanner inp =new Scanner(System.in)){
            System.out.print("Enter the Number -1 : ");
            int n1=inp.nextInt();
            System.out.print("Enter the Number -2 : ");
            int n2=inp.nextInt();
            System.out.print("Enter the Number -3 : ");
            int n3=inp.nextInt();
            System.out.print("Enter the Number -4 : ");
            int n4=inp.nextInt();
            if(n1>n2 && n1>n3 && n1>n4) System.out.println(n1+" is Greater");
            else if(n2>n3 && n2>n4 && n2>n1) System.out.println(n2+" is Greater");
            else if(n3>n4 && n3>n2 && n3>n1) System.out.println(n3+" is Greater");
            else System.out.println(n4+" is Greater");
        }
    }
}
