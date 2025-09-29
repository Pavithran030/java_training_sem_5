public class Multi_Inheritance {
    public static void main(String[] args) {

        Ev v1=new Ev();
        v1.wheel2();
        v1.wheel4();
        v1.ac();
        v1.fast_charge();
    }   
}

class Vehicle{

    void wheel2(){
        System.out.println("It is a 2 Wheeler....");
    }

    void wheel4(){
        System.out.println("It is a 4 Wheeler....");
    }
}

class Car extends Vehicle{

    void ac(){
        System.out.println("It is a AC car....");
    }
}

class Ev extends Car{

    void fast_charge(){
        System.out.println("It is a Fast charging EV....");
    }
}
