
import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Ente Your age : ");
            int age=inp.nextInt();

            if(age>=18) {
                System.out.println("Eligilbe");
                if(age>=19 && age<=24) System.out.println("Adult vote");
                if(age>=25 && age <=59) System.out.println("Senior vote");
                if(age>=60) System.out.println("Senior citizen vote");

            }
            else System.out.println("Not Eligible");

        }
    }
    
}
