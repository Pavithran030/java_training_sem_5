
import java.util.Scanner;

public class RightTriangle_Pattern {
    public static void main(String[] args) {
        try(Scanner inp =new Scanner(System.in)){
            System.out.print("Enter the Number of Rows : ");
            int si=inp.nextInt();
            for(int i=0;i<si;i++){
                for(int j=si;j>i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=0;i<si-1;i++){
                for(int j=0;j<=i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
}
