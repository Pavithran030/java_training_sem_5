
class Node{
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }
    
}

class Circular{
    
    Node head,tail;

    // TO INSERT THE ELEMENTS IN THE NODE.... or 
    // INSERT AT LAST....

    void insert(int val){
        
        Node ins=new Node(val);
        ins.next=null;

        if(head==null){
            head=ins;
            tail=ins;
            ins.next=head;
            return;
        }

        tail.next=ins;
        tail=ins;
        tail.next=head;
    }

    // TO INSERT AT THE BEGIN

    void insertbegin(int val){
        Node b=new Node(val);

        if(head==null){
            System.out.println("Unable to Insert at the Begin...");
            return;
        }
        b.next=head;
        head=b;
        tail.next=head;

    }

    // TO DELETE AT BEGIN


    void deletebegin(){
        
        // to checkif the head is null....
        if(head==null){
            System.out.println("The list is Empty Unable to Delete....");
            return;
        }

        // check if the head and tail are same.(initial node)...

        if(head==tail){
            head=null;
            tail=null;
        }

        // changing head to the next element...

        head=head.next;
        tail.next=head;

    }

    // TO DELETE AT THE SPECIFIC LOCATION

    void deletepos(int ind){

        Node temp=head;
        if(ind==0){
            deletebegin();
        }

        for(int i=0;i<ind-1;i++){
            temp=temp.next;
        }

        if(temp!=head){
            System.out.println("Its a Last Element ...Unable to delete it...");
        }
        else{
            temp.next=temp.next.next;
        }

    }

    // TO DELETE AT THE LAST

    void deletelast(){
        Node temp=head;
        while (temp.next!=tail) { 
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
    }

    // TO DISPLAY

    void print(){
        Node temp=head;

        do { 
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=head){
                System.out.print(" -> ");
            }
        } while (temp!=head);
    }



}
public class Single_Circular {
    public static void main(String[] args) {

        Circular cr=new Circular();
        cr.insert(101);
        cr.insert(102);
        cr.insert(103);

        System.out.println("Initial Linked List....");
        cr.print();

        System.out.println("\n\nAfter Deleting the last Element from the List...");
        cr.deletelast();
        cr.print();

        System.out.println("\n\nAfter Inserting at the First...");
        cr.insertbegin(0);
        cr.print();

        System.out.println("\n\nAfter Deleting the Element from First...");
        cr.deletebegin();
        cr.print();

        System.out.println("\n\nAfter Deleting the Element from the Specific Position...");
        cr.deletepos(1);
        cr.print();
        
        
    }
    
}
