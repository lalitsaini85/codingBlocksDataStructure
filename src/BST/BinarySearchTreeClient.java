package BST;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 21-04-2022
 * Time: 09:38
 * File Name : BinarySearchTreeClient.java
 */
public class BinarySearchTreeClient {
    public static void main(String[] args) {
        int[] inarr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        BinarySearchTree bst = new BinarySearchTree(inarr);
        bst.display();
    }
}
