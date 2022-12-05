class Node1{
    int data;
    Node left , right;

    public Node1(int item){
        data = item;
        left=right=null;
    }

}

class BinaryTree{
    Node root;
    //constructor
    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        root=null;
    }

    void printpreOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.data);
        printpreOrder(node.left);
        printpreOrder(node.right);



    }

    void printpreOrder(){
        printpreOrder(root);
    }





}

public class preOrder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("preorder traversal of binary tree is " );
        tree.printpreOrder();




    }
}