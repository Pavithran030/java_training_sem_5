
import java.util.Scanner;

public class Triangle_Pattern {
    public static void main(String[] args) {
        try(Scanner inp =new Scanner(System.in)){
        System.out.print("Enter the Row Range : ");
        int range=inp.nextInt();
        for(int i=0;i<range;i++){
            for(int j=range;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println( );
        }
        inp.close();
        }
    }
   
}
