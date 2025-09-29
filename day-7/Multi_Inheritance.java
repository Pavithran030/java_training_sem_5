public class Multi_Inheritance {
    public static void main(String[] args) {
        Power t1=new Power();
        System.out.println(t1.engine1(100));

        Normal n1=new Normal();
        
        System.out.println(n1.engine_sub(20,30));
        t1.engine_sub();
        
    }
    
}

class Truck{
    int engine1(int a){
        return a;
    }
}

class Normal extends Truck{
    int engine_sub(int a,int b){
        return a*b;
    }
}

class Power extends Truck{
    void engine_sub(){
        System.out.println("Its a testing Process for the engine Durability....");
    }
}
