
import java.util.Scanner;

public class Increament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to Understand the Increment Operation : ");
        int a=sc.nextInt();
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);
    }
}
