public class Chaining_Con {
    public static void main(String[] args) {
        M m1=new M(100.50);
        m1.display();
    }

    
}

class M{
    double d;
    // M() {
    //     this.d=200.50;
    // }

    M(double d) {
        this.d=d;
    }

    void display(){
        System.out.println(d);
    }
    
    
}
