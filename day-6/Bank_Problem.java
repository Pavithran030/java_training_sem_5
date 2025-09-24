
import java.util.Scanner;

public class Bank_Problem{

    // int acc_no;
    double amo;
    double fin;
    public Bank_Problem(double  deposit) {
        this.amo=5000;
        fin=amo+deposit;
    }

    double dep_account(double  depo){
        return (amo+depo);
    }

    double with_account(double with){
        return fin-with;
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int acc=sc.nextInt();
            double am=sc.nextDouble();
            double wi=sc.nextDouble();
            Bank_Problem ba=new Bank_Problem(am);

            // Bank_Problem dp=new Bank_Problem(am);
            System.out.println("Account No : "+acc+" Balance After Deposite : "+ba.dep_account(am));
            if(ba.with_account(wi)<0){
                System.out.println("Insufficient Balance");
            }
            else System.out.println(ba.with_account(wi));
        }
    
    }   
}