import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Mark to find the Grade : ");
            int score=inp.nextInt();
            if(score==100) System.out.println("O Grade");
            else if(score >=90 && score<100 ) System.out.println("A+ Grade");
            else if(score >=80 && score<90 ) System.out.println("A Grade");
            else if(score >=70 && score<80 ) System.out.println("B+ Grade");
            else if(score >=60 && score<70 ) System.out.println("B Grade");
            else if(score >=50 && score<60 ) System.out.println("C Grade");
            else if(score <=49) System.out.println("U Grade");
        }
    }
}