class A{
    final void show(int a ){
        System.out.println(a);
    }

    void show(){
        System.out.println("..............");
    }
}

class B extends A{
    // void show(){
        
    // }
}

public class Final_Method {
    public static void main(String[] args) {
        A a1=new A();
        a1.show(10);
        a1.show();
        
    }
}
