import java.util.*;
public class X_Pattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number of rows : ");
            int row=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    if(i==j || (i+j==row-1)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }    
    }
    
}
