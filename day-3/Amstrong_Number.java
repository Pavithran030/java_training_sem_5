
import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the number to Check for Amstrong Number : ");
            int num=inp.nextInt();
            int fin=num,co=num,count=0;
            int re=0;

            // efficient way to count the length of the integer without inbuilt functions
            
            do{
                count++;
                co/=10;
            }while(co!=0);

            while(num!=0){
                int digit=num%10;
                re+=Math.pow(digit,count);
                num/=10;
            }
            if(fin==re) System.out.println("Its is a Amstrong Number ");
            else System.out.println("Not a Amstrong Number");
        }
    }
}
