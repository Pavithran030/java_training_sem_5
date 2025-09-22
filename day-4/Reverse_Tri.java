
import java.util.Scanner;

public class Reverse_Tri{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Row Range : ");
            int row=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int k=0;k<i;k++){
                    System.out.print("   ");
                }
                for(int j=row;j>i;j--){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}