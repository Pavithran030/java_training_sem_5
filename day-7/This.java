public class This {
    public static void main(String[] args) {
        Man m1=new Man("Ben-10");
        m1.display();
    }
    
}

class Man{
    String a;

    Man(String b) {
        a=b;
    }
    void display(){
        System.out.print(a);
        this.show();
    }
    void show(){
        System.out.println(" "+"Ultimate Alien....");
    }

 
}
