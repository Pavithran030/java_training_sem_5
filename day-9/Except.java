public class Except {
    public static void main(String[] args) {
        int nu=35;
        int de=0;
        try {
            int re=nu/de;
            System.out.println(re);
            // int[] arr=new int[2];
            // arr[5]=10;
        } catch (Exception e) {
            System.out.println("The Exception Happened here is "+e);
        }
        finally{
            System.out.println("Exception Handle Successfully....");
        }
    }
}
