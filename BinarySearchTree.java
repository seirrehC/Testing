import java.util.*;
import java.lang.*;

public class BinarySearchTree {
    
    public Node root;
    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public void insertNode(int value) {
        Node current = root;

        while (current != null) {
            if (value >= current.value && current.right == null) {
                current.right = new Node(value);
                break;
            }
            else if (value < current.value && current.left == null) {
                current.left = new Node(value);
                break;
            }

            if (value >= current.value) {
                current = current.right;
            }
            else {
                current = current.left;
            }
        }
    }
}

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int v) {
        value = v;
    }
}
