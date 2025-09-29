public class Return_Obj_Con {
    public static void main(String[] args) {
        O o1=new O();
        o1.show();
        
    }
}

class O{
    O show(){
        return this;
    }
    void display(){
        System.out.println("This the Return Current Object....");
    }
}
