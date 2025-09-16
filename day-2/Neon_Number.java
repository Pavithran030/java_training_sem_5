
import java.util.Scanner;

public class Neon_Number {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Number : ");
            int n=inp.nextInt();
            int re=n*n;
            int digit=0;
            while(re!=0){
                digit+=re%10;
                re/=10;
            }
            if(n==digit) System.out.println("Neon Number.");
            else System.out.println("Not a Neon Number.");
        }
    } 
}
