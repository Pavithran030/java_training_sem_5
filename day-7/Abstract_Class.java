abstract class Abstraction{
    abstract int add(int a,int b);  // Abstract method..
    void sub(){                     // Concrete calss..
        System.out.println("Its is a Sub Class...");
    }
}

class Addition extends Abstraction{
    @Override
    int add(int a ,int b){
        return a+b;
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        Addition a1=new Addition();
        System.out.println(a1.add(10, 20));
        a1.sub();
        
    }
}

