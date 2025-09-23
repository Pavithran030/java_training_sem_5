
import java.util.Scanner;

public class Max_Method {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print(" Enter Number-1 : ");
            int n1=sc.nextInt();
            System.out.print(" Enter Number-2 : ");
            int n2=sc.nextInt();
            Max_Method ma=new Max_Method();
            System.out.println("The Maximum Number Among the given Numbers : "+ma.max(n1, n2));
        }
    }
    int max(int m,int n){
        if(m>n) return m;
        else return n;
    }
    
}
