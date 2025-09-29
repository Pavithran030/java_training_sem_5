public class Argument_Con {
    public static void main(String[] args) {
        Arg a1=new Arg();
        a1.display();
        
    }
    
}

class Arg{

    void show(Arg a1){    // To pass a current obj as a Argument....
        System.out.println("Its a Show meth....");
    }

    void display(){
        show(this);
    }
}
