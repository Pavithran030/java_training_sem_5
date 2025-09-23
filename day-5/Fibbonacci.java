
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number to find the Series : ");
            int n=sc.nextInt();
            Fibbonacci f=new Fibbonacci();
            for(int i=0;i<n;i++){
                System.out.print(f.fib(i)+" ");
            }
        }
    }
    int fib(int a){
        if(a<=0) return 0;
        else if (a==1) return 1;
        else return fib(a-1)+fib(a-2);
    }
    
}
