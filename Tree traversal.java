class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    
    public BinaryTree() {
        root = null;
    }
    
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }
    
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root);
        
        System.out.print("\nPreorder traversal: ");
        tree.preorderTraversal(tree.root);
        
        System.out.print("\nPostorder traversal: ");
        tree.postorderTraversal(tree.root);
    }
}
