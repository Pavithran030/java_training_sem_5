
class Node {

    int data;
    Node l, r;

    Node(int a) {
        this.data = a;
        l = r = null;
    }
}

public class Traversal_Tree {

    Node root;

    void preorder(Node val) {
        if (val == null) {
            return;
        }

        System.out.print(val.data + " ");
        preorder(val.l);
        preorder(val.r);

    }

    void postorder(Node val) {
        if (val == null) {
            return;
        }

        postorder(val.l);
        postorder(val.r);
        System.out.print(val.data + " ");
    }

    void inorder(Node val) {
        if (val == null) {
            return;
        }

        inorder(val.l);
        System.out.print(val.data + " ");
        inorder(val.r);

    }

    public static void main(String[] args) {
        Traversal_Tree n = new Traversal_Tree();
        n.root = new Node(1000);
        n.root.l = new Node(10);
        n.root.l.l = new Node(5);
        n.root.r = new Node(2000);
        n.root.r.l = new Node(1500);

        /*
                         1000
                        /    \
                      10     2000
                      /      /   
                     5     1500   
         */
        System.out.print("Inorder\n");
        n.inorder(n.root);
        System.out.println("\nPreorder");
        n.preorder(n.root);
        System.out.println("\nPostorder");
        n.postorder(n.root);

    }

}
