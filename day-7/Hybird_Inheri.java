interface A{
    void a();
}

interface B{
    void b();
}

class Parent{
    void dum(){
        System.out.println("Its a Dummy Class...");
    }
}

class Inter extends Parent implements A,B{
    @Override
    public void a(){
        System.out.println("A Interface...");
    }

    @Override
    public void b(){
        System.out.println("B Interface...");
    }
}

public class Hybird_Inheri {
    public static void main(String[] args) {
        Inter i=new Inter();
        i.a();
        i.b();
        i.dum();
        
    }
    
}
