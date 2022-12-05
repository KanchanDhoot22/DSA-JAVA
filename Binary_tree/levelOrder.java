import java.util.*;

class Node4{
    int data;
    Node left , right;

    public Node4(int item){
        data = item;
        left=right=null;
    }

}

class BinaryTree3{
    Node root;
    void printLevelOrder(){
        Queue<Node>queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println(tempNode.data);
            if (tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if (tempNode.right!=null){
                queue.add(tempNode.right);
            }


        }
    }





}











public class levelOrder {
    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is " );
        tree.printLevelOrder();
    }
}
