
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class List{
    Node head,tail;   // Refernce for a variable head and tail.

    // TO INSERT AT THE BEGINNING

    void atfirst(int num){
        Node f=new Node(num);
        f.next=head;
        head=f;
    }

    // To Insert a Data into a linked list

    void insert(int data){
        Node da=new Node(data);   
        da.next=null;

        if(head==null){
            head=da;
            tail=da;
        }
        else{
            tail.next=da;
            tail=da;
        }
        
    }

    // To display the data in from the linked list..

    void print(){
        Node temp=head;

        if(head==null) System.out.println("The Linked List is Empty.....");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        
            if(temp!=null) 
            {
                System.out.print("-> ");
            }
            
        }
    }
}
public class Single_LinkedList {

    public static void main(String[] args) {
        List ls=new List();
        ls.insert(10);
        ls.insert(40);
        ls.insert(60);
        ls.insert(80);
        ls.atfirst(0);
        ls.print();
    }
    
}
