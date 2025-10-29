
class Node {

    int data;
    Node left, right;

    public Node(int a) {
        this.data = a;
    }
}

class Operations {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);

    }

    public Node insertRec(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

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
        Operations b = new Operations();
        b.insert(100);
        b.insert(30);
        b.insert(20);
        b.insert(80);
        System.out.println("PreOrder Traversal....");
        b.preorder(b.root);
    }

}
