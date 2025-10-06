public class Throw_Exception {


    static void check(int a){
        
        if(a>15){
            throw new ArithmeticException("its a minimum value");
            // System.out.println("The minimum requirement is not satisfied....");
        }
   
        System.out.println("The value is greater than minimum value....");

    }
    public static void main(String[] args) {
        try {
            Throw_Exception.check(20);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
