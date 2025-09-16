import java.util.Scanner;

public class Right_Tri_Pattern {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            System.out.print("Enter the Number of Rows for a Right-Triangle Pattern : ");
            int ro=inp.nextInt();
            /*

            * 
            * *
            * * *
            * * * *
            * * * * *
            
            */  

            for(int i=0;i<ro;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
             
            /*

            * * * *
            * * *
            * *
            *

            */
            for(int i=0;i<ro;i++){
                for(int j=ro-1;j>i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("Using a While Loop");

            int m=0;
            while(m<ro){
                int n=0;
                while(n<=m){
                    System.out.print("* ");
                    n++;
                }
                System.out.println();
                m++;
            }

    }
    
}
}
