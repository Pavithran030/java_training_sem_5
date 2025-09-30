class Apple{
    private int a;
    public void set(int v){
        a=v;
    }

    public int dis(){
        return a;
    }
}

public class Get_Set_encap {
    public static void main(String[] args) {
        Apple m=new Apple();
        m.set(20);
        m.dis();
        
    }   
}
