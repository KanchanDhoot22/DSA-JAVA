class Node2{
    int data;
    Node left , right;

    public Node2(int item){
        data = item;
        left=right=null;
    }

}

class BinaryTree1{
    Node root;
    //constructor
    BinaryTree1(int data){
        root = new Node(data);
    }

    BinaryTree1(){
        root=null;
    }

    void printpostOrder(Node node){
        if (node==null){
            return;
        }

        printpostOrder(node.left);
        printpostOrder(node.right);
        System.out.println(node.data);



    }

    void printpostOrder(){
        printpostOrder(root);
    }





}














public class postOrder {
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("postorder traversal of binary tree is " );
        tree.printpostOrder();
    }
}
