import java.util.*;

public class Simple_Interest {
    public static void main(String[] args) {
        
        /* 
         SI = (P*R*T)/100

          here, P = Principle ( The initial amount of money borrowed or invested )
                R = Rate ( The annual interest rate, expressed as a percentage )
                T = Time ( The duration of the loan or investment, usually in years )
        */ 

        try(Scanner inp =new Scanner(System.in)){
            System.out.print("Enter the Principle Amount : ");
            int pri= inp.nextInt();
            System.out.print("Enter the Rate of Interest Percentage : ");
            float rate=inp.nextFloat();
            System.out.print("Enter the Time Period (in year only): ");
            int time=inp.nextInt();
            System.out.println("The Simple Interest For the Invested Amount : "+(pri*rate*time)/100);
            System.out.println("The Total Amount After the Interest Period : "+(pri+((pri*rate*time)/100)));
        }

    }
    
}
