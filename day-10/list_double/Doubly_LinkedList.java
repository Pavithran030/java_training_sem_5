
class Node{
    int data;
    Node next;
    Node pre;

    Node(int data){
        this.data=data;
    }
}

class Doubly{

    Node head,tail;

    void insert(int val){

        Node ins=new Node(val);
        ins.next=null;
        ins.pre=null;

        if(head==null){
            head=ins;
            tail=ins;
        }

        else{
            tail.next=ins;
            ins.pre=tail;
            tail=ins;
        }

    }

    void print(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null) System.out.print(" <-> ");
        }
    }

    // TO PRINT IN REVERSE.....

    void printrev(){
        Node temp=tail;

        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.pre;
            if(temp!=null) System.out.print(" <-> ");
        }
    }
}


public class Doubly_LinkedList {
    public static void main(String[] args) {
        Doubly du=new Doubly();
        du.insert(10);
        du.insert(20);
        du.insert(30);
        du.insert(40);
        System.out.println("Doubly Linked List in a Forward.....");
        du.print();

        System.out.println("\n\nDoubly Linked List in a Backward.....");
        
        du.printrev();
    }
    
}
