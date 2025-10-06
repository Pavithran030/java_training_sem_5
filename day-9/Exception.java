public class Exception {
    public static void main(String[] args) {
        int nu=35;
        int de=0;
        try {
            int re=nu/de;
            System.out.println(re);
        } catch (ArithmeticException e) {
            System.out.println("The Exception Happened here is "+e);
        }
        finally{
            System.out.println("Exception Handle Successfully....");
        }
    }
}
