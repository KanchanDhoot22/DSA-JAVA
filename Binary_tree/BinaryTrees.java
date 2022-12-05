class Node{
    int data;
    Node left , right;

    public Node(int item){
        data = item;
        left=right=null;
    }

}

class BinaryTrees{
    Node root;
    //constructor
    BinaryTrees(int data){
        root = new Node(data);
    }

    BinaryTrees(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("the value of nodes in our binary tree is: " );




    }
}