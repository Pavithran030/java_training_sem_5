class A{
    void print(){
        System.out.println("This is a Class A");
    }
}

class B extends A{
    @Override
    void print(){
        System.out.println("This is a Class B");
    }

    void show(){
        print();
        super.print();
    }
}

public class Super_method {
    public static void main(String[] args) {

        B ca=new B();
        ca.show();
        
    }
    
}
