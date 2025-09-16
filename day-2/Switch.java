
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.println("Enter the Number-1 : ");
            int n1=inp.nextInt();
            System.out.println("Enter the Number-2 : ");
            int n2=inp.nextInt();
            System.out.println("Enter the Operator : ");
            char c=inp.next().charAt(0);
            switch(c){
            case '+' -> System.out.printf("Addition of %d + %d is %d ",n1,n2,(n1+n2));
            case '-' -> System.out.printf("Subtraction of %d - %d is %d ",n1,n2,(n1-n2));
            case '*' -> System.out.printf("Multiplication of %d * %d is %d ",n1,n2,(n1*n2));
            case '/' -> {
                if(n2>0) System.out.printf("Division of %d / %d is %d ",n1,n2,(n1/n2));
                else System.out.printf("Division of %d / %d is Infinity",n1,n2);   
            }
            case '%' -> System.out.printf("Modulus of %d %% %d is %d ",n1,n2,(n1%n2));
            default -> System.out.println("Cant Perform the Operation....");
        }
        
    }
}
}