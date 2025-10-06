public class Throws_Exception {
    public static int check(int a,int b) throws ArithmeticException,IndexOutOfBoundsException{
        if(b==0) throw new ArithmeticException("the number cant divisible by zero.....");
        return a/b;
    }
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            System.out.println(check(a,b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("The code was Successfully Executed....");
        }
    }
}
