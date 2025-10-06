
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {

    int depo=0;
    int balance;

    void deposit(int dep){
        depo+=dep;
    }

    void withdraw(int with){
        if(with>0 && depo<0 ){
            System.out.println("The Account Balance is Zero");
        }
        else{
        depo-=with;
        balance=depo;
        System.out.println("Current balance after Withdraw of Money : "+balance);
        }

    }
    int checkbalance(){
        return depo;
    }
    
}

public class Atm{
    public static void main(String[] args) {

        try(Scanner inp=new Scanner(System.in)){
            BankAccount s1=new BankAccount();
            boolean n=true;
            List<String> store=new ArrayList<>(); 

            while (n) {
                System.out.println("---------------ATM-------------");
                System.out.println("\n1.Check Balance \n2.Deposit Money \n3.Withdraw Money \n4.Transaction History \n5.Exit");
                System.out.print("Enter Your Choice : ");
                int cho=inp.nextInt();
                // System.out.println("____________________________________________");
                
                switch (cho) {
                    case 1 -> System.out.println("Current Balance :"+s1.checkbalance());
                    case 2 -> {
                        System.out.print("Enter the Amount to Deposit : ");
                        int de=inp.nextInt();
                        s1.deposit(de);
                        // System.out.println("____________________________________________");
                        store.add("Deposited money :"+de);
                    }
                    case 3 -> { 
                        System.out.print("Enter the Amount to Withdrawl : ");
                        int wi=inp.nextInt();
                        s1.withdraw(wi);
                        
                        // System.out.println("____________________________________________");
                        store.add("Withdrawl money :"+wi);
                    }
                    case 4 -> {
                        System.out.println("Transaction History : ");
                        if(store.isEmpty()){
                            System.out.println("No Transaction History");
                        }
                        else{
                            for(String str:store){
                                System.out.println(str);
                            }
                        }
                        // System.out.println("____________________________________________");
                    }
                    case 5 -> {
                        System.out.println("Exit...");
                        n=false;
                    }
                }
            }
            
        }
        
    }
}