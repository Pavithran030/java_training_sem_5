
import java.util.Scanner;

public class Valid_Triangle {

    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Side-1 : ");
            int s1=inp.nextInt();
            System.out.print("Enter the Side-1 : ");
            int s2=inp.nextInt();
            System.out.print("Enter the Side-1 : ");
            int s3=inp.nextInt();
            if(s1==s2 && s1==s3) System.out.println("Equivalent Triangle");
            else if (s1==s2 || s1==s3 || s2==s3 ) System.out.println("Isoceles Triangle");
            else System.out.println("Scalene Triangle");
        }
    }
    
}
