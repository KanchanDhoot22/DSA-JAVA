class Node3{
    int data;
    Node left , right;

    public Node3(int item){
        data = item;
        left=right=null;
    }

}

class BinaryTree2{
    Node root;
    //constructor
    BinaryTree2(int data){
        root = new Node(data);
    }

    BinaryTree2(){
        root=null;
    }

    void printinorder(Node node){
        if (node==null){
            return;
        }

        printinorder(node.left);
        printinorder(node.right);
        System.out.println(node.data);



    }

    void printinorder(){
        printinorder(root);
    }





}
















public class inorder {
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("inorder traversal of binary tree is " );
        tree.printinorder();
    }
}
