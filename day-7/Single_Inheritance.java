class Car{
    void wheel(){
        System.out.println("This is the Main car System....");
    }
}

class Steering extends Car{
    void power(){
        System.out.println("Its is a power Steering Car....");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Steering s1=new Steering();
        s1.power();
        s1.wheel();
        
    }
    
}