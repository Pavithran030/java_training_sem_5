
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

    // CREATION OF A LINKED LIST OR INSERITON.....

    void insert(int val){

        Node ins=new Node(val);
        ins.next=null;
        ins.pre=null;

        if(head==null){
            head=ins;
            tail=ins;
            return;
        }

        tail.next=ins;
        ins.pre=tail; // this is the changes between single and a doubly linked list
        tail=ins;

    }

    // TO INSERT AT THE BEGINNING

    void begin(int val){

        Node b=new Node(val);
        b.next=head;

        // If the list was not empty, update the original head's previous pointer

        if(head!=null){
            head.pre=b; 
        }

        // The new node is now the head of the list
        head=b;
    }

    // INSERTION AT POSITION

    void posinsert(int ind,int val){
        Node p=new Node(val);
        Node temp=head;

        for(int i=0;i<ind-1;i++){
            temp=temp.next;
        }
        p.next=temp.next;

        if(temp.next!=null) {    // to hand the NULLPOINTEREXCEPTION
            temp.next.pre=p;
        }

        p.pre=temp;
        temp.next=p;
    }

    // TO DELETE AT THE SPECIFIC POSITION...

    void posdelete(int ind){

        Node temp=head;

        for(int i=0;i<ind-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        if(temp.next!=null){
            temp.next.pre=temp;
        }

    }


    //DELETE AT FIRST..

    void lastdelete(){

        if(tail==null){
            System.out.println("No element to delete....");
            return ;
        }

        if(tail==null){
            head=null;
            tail=null;
            System.out.println("The only one node is deleted.....");
            return;

        }

        Node lst=tail.pre;
        lst.next=null;
        tail=lst;


    }

    // TO PRINT IN FORWARD.....

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

        System.out.println("\n\nAfter Insertion Position.....");
        du.posinsert(1, -10);
        du.print();

        System.out.println("\n\nAfter Insertion at the Begin.....");
        du.begin(-10);
        du.print();

        System.out.println("\n\nDelete at the Position.....");
        du.posdelete(2);
        du.print();

        System.out.println("\n\nDelete at Last.....");
        du.lastdelete();
        du.print();
    }
    
}
