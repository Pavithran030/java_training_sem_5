
class Node {

    int data;
    Node left, right;

    public Node(int a) {
        this.data = a;
    }
}

class Operationss {

    Node root;

    // function to call the function to recursively insert...
    public void insert(int data) {
        root = insertRec(root, data);

    }

    // function to create a tree 
    public Node insertRec(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {      // small elements to the left of the root...
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {     // large elements to the right of the root...
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // to display the display the element in the tree...
    public void preorder(Node val) {
        if (val == null) {
            return;
        }

        System.out.print(val.data + " ");
        preorder(val.left);
        preorder(val.right);
    }

}

public class Binary_Tree {

    public static void main(String[] args) {
        Operationss b = new Operationss();
        b.insert(100);
        b.insert(30);
        b.insert(20);
        b.insert(80);
        System.out.println("PreOrder Traversal....");
        b.preorder(b.root);
    }

}
