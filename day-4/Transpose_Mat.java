
import java.util.Arrays;

public class Transpose_Mat {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6}};
        int row=mat.length;
        int col=mat[0].length;
        int[][] tran=new int[col][row];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                tran[j][i]=mat[i][j];
            }
        }
        System.out.println(Arrays.deepToString(tran).toCharArray());
    }
    
}
