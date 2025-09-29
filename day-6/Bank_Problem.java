
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
        return amo+depo;
    }

    double with_account(double with){
        return fin-with;
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Account Number : ");
            int acc=sc.nextInt();
            System.out.print("Enter the Amount to Deposite : ");
            double am=sc.nextDouble();
            System.out.print("Enter the Amount to Withdraw : ");
            double wi=sc.nextDouble();
            Bank_Problem ba=new Bank_Problem(am);
            System.out.println("Account No : "+acc+" Balance After Deposite : "+ba.dep_account(am));
            if(ba.with_account(wi)<0){
                System.out.println("Insufficient Balance");
            }
            else System.out.println("Total Amount After Withdrawed : "+ba.with_account(wi));
        }
    
    }   
}