
public class Copy_Constructor {

    String s;
    int a;

    public Copy_Constructor(String s1, int a1) {
        this.s = s1;
        this.a = a1;
    }

    public Copy_Constructor(Copy_Constructor obj) {  // Copy Constructor...
        s = obj.s;
        a = obj.a;
    }

    public static void main(String[] args) {

        Copy_Constructor c = new Copy_Constructor("Apple", 20);
        Copy_Constructor c2 = new Copy_Constructor(c);

        System.out.println(c2.s);
        c2.s = "Car";
        System.out.println(c2.s);

    }

}
