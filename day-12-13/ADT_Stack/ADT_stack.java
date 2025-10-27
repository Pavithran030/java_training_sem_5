public class ADT_stack {

    private final int size;
    private final int[] arr;
    private int top;

    ADT_stack(int si){
        this.size=si;
        this.arr=new int[si];
        this.top=-1;
    }


    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==size-1;
    }

    // INSERT THE ELEMENTS IN THE STACK....

    void  push(int data){
        if(isFull()){   // or if(size-1==top)
            System.out.println("Stack is Full OR OverFlow...");
            return;
        }
        arr[++top]=data;
    }

    // DISPLAYING THE ELEMENTS IN THE STACK  -> always in a reverse order....

    void show(){
        if(isEmpty()){   // if (top==-1)
            System.out.println("Stack is Empty OR UnderFlow....");
            return;
        }

        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }


    // DELETE THE TOP ELEMENT FORM THE STACK.....

    int pop(){
        if(isEmpty()){   // if (top==-1)
            System.out.println("Stack is Empty OR UnderFlow....");
            return -1;
        }

        return arr[top--];
    }

    int peek(){
        if(isEmpty()){   // if (top==-1)
            System.out.println("Stack is Empty OR UnderFlow....");
            return -1;
        }
        return arr[top];
    }



    public static void main(String[] args) {
        ADT_stack st=new ADT_stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.show();
        
        System.out.println("\nDelete the Top element in the Stack.....");
        st.pop();
        st.show();
        System.out.println("\nThe Top Element in the Stack...  : "+st.peek());

    }
}
