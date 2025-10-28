

class Node {
    int data;
    Node l,r;
    Node(int a){
        this.data=a;
        l=r=null;
    }
}


public class Tree {
    Node root;

    void preorder(Node root){
        System.out.print(root.data+" ");
        preorder(root.l);
        
        preorder(root.r);
        
    }

    void postorder(Node root){
        postorder(root.l);
        postorder(root.r);
        System.out.print(root.data+" ");
    }

    void inorder(Node root){
        preorder(root.l);
        System.out.println(root.data+" ");
        preorder(root.r);
        
    }

    public static void main(String[] args) {
        
    }


    
}
