public class Sum_Diagonal {
    public static void main(String[] args) {
        int[][] dia={{1,2,3},{4,5,6},{7,8,9}};
        int dia1=0,dia2=0;
        for(int i=0;i<dia.length;i++){
            for(int j=0;j<dia[i].length;j++){
                if(i==j) dia1+=dia[i][j];
            }
        }

        for(int i=0;i<dia.length;i++){
            for(int j=0;j<dia[i].length;j++){
                if(i+j==2) dia2+=dia[i][j];
            }
        }

        System.out.println("Diagonal : "+dia1);
        System.out.println("Anti-Diagonal : "+(dia2-dia[1][1]));
    }
    
}
