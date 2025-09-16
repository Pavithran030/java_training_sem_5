
import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.println("Enter the Number of Rows for a Square Pattern : ");
            int ro=inp.nextInt();
            for(int i=0;i<ro;i++){
                for(int j=0;j<ro;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
}