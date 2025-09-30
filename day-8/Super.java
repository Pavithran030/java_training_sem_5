class Pc{
    Pc(){
        System.out.println("It is a Pc class....");
    }
}

class Cpu extends Pc{
    Cpu(){
        super();
        System.out.println("Its is a Cpu class...");
    }
}

public class Super {
    public static void main(String[] args) {
        Cpu c=new Cpu();
    }
    
}
