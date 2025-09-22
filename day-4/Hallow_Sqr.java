import java.util.Scanner;

public class Hallow_Sqr {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.err.print("Enter the Rows : ");
            int row=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    if(i==0||i==row-1||j==0||j==row-1) System.out.print(" * ");
                    else System.out.print("   ");
                }
                System.out.println();
            }

        }
    }
    
}
