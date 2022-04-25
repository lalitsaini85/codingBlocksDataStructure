package BST;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 21-04-2022
 * Time: 09:19
 * File Name : BinarySearchTree.java
 */
public class BinarySearchTree {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    private Node root;
    public BinarySearchTree(int[] inArr){
        this.root = createTree(inArr, 0, inArr.length-1);
    }
    private Node createTree(int[] inArr, int low, int high){
        if(high < low)
            return null;
        int mid = (low + high) / 2;
        Node newNode = new Node(inArr[mid]);
        newNode.left = createTree(inArr, low, mid-1);
        newNode.right = createTree(inArr, mid+1, high);
        return newNode;
    }
    private void display(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        display(node.left);
        display(node.right);
    }
    public void display(){
        display(root);
    }
}
