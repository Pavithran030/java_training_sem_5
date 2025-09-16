import java.util.*;
public class Circle {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Radius of the Circle : ");
            int ra=sc.nextInt();
            System.out.println("The Radius of the Circle is : "+(3.14*(ra*ra)));
        }
    }
}
