
class Node{
    int data;
    Node next;

    Node(int data) {
        this.data=data;

    }    
}


class Creation{
    Node top;

    // CREATION OF STACK AND INSERT THE ELEMENTS....

    void push(int data){
        Node n=new Node(data);
        n.next=top;
        top=n;
    }

    void show(){
        Node temp=top;

        

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}

public class Single_Stack {
    
}
