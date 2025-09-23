
import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        try(Scanner inp=new Scanner(System.in)){
            int[][] jag=new int[4][];

            jag[0]=new int[1];
            jag[1]=new int[2];
            jag[2]=new int[3];
            jag[3]=new int[4];

            for(int i=0;i<jag.length;i++){
                for(int j=0;j<jag[i].length;j++)
                {
                    jag[i][j]=inp.nextInt();
                }
                System.out.println();
            }

            for(int i=0;i<jag.length;i++){
                for(int j=0;j<jag[i].length;j++)
                {
                    System.out.print(jag[i][j]);
                }
                System.out.println();
            }
        }
    }
    
}
