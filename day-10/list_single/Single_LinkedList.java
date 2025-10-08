
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

    //TO INSERT DATA AT THE LAST....

    void atlast(int num){

        Node l=new Node(num);
        l.next=null;

        if(head==null){
            head=l;
            tail=l;
            return;
        }

        tail.next=l;
        tail=l;

    }

    // TO INSERT A DATA INTO A LINKED LIST

    // void insert(int data){
    //     Node da=new Node(data);   
    //     da.next=null;

    //     if(head==null){
    //         head=da;
    //         tail=da;
    //     }
    //     else{
    //         tail.next=da;
    //         tail=da;
    //     }
        
    // }

    // INSERT DATA AT THE SPECIFIC LOCATION

    void location(int ind,int val){

        Node spec=head;

        Node s=new Node(val);

        for(int i=0;i<ind-1;i++){
            spec=spec.next;
        }

        s.next=spec.next;
        spec.next=s;

    }

    // INSERT DATA AFTER THE SPECIFIC VALUE

    void place(int pl,int val){
        Node temp=head;

        Node p=new Node(val);

        while(temp.data!=pl){
            temp=temp.next;
        }
        p.next=temp.next;
        temp.next=p;


    }

    //DELETE AT THE FIRST...

    void deletefirst(){

        Node temp=head;
        if(temp==head && temp==tail){
            head=null;
            tail=null;
            return;
        }

        head=temp.next;

    }

    //DELETE AT THE LAST

    void deletelast(){
        Node temp=head;

        if(head==null) {
            System.out.println("The list is Empty....Can't able to delete Elements....");
            return;
        }

        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }

    //DELETE AT THE SPECIFIC POSITION..

    void posdelete(int ind){
        Node pos=head;

        for(int i=0;i<ind-1;i++){
            pos=pos.next;
        }

        pos.next=pos.next.next;
        // pos.next=null;
    }

    // TO DISPLAY THE DATA IN FROM THE LINKED LIST..

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
        System.out.println();
    }

}
public class Single_LinkedList {

    public static void main(String[] args) {
        List ls=new List();

        for(int i=80;i>=0;i-=20){
            ls.atlast(i);
        }
        System.out.println("The Linked List After Insert the Initial Elements...");
        ls.print();
        System.out.println();

        ls.atfirst(22);
        ls.atlast(100);
        ls.location(2, 30);
        ls.place(60, 65);
        System.out.println("The Linked List After Performing Insertion at the first,last and Specific Location....");
        ls.print();
        System.out.println();

        
        ls.deletefirst();
        ls.deletelast();
        ls.posdelete(2);
        System.out.println("The Linked List After Performing Deletion at the first,last and Specific Location....");
        ls.print();
        System.out.println();

    }
    
}
