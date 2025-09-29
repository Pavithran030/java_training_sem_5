interface A{
    void a();
}

interface B{
    void b();
}

class Inter implements A,B{
    @Override
    public void a(){
        System.out.println("A Interface...");
    }

    @Override
    public void b(){
        System.out.println("B Interface...");
    }
}


public class Multiple_Inheri {
    public static void main(String[] args) {
        Inter i=new Inter();
        i.a();
        i.b();
    }
    
}
