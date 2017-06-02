import java.util.*;
import java.lang.*;


public class Solution {

    public static void main(String[] args) {


        int[] values = new int[]{5,6,3,4,1};

        BinarySearchTree tree = new BinarySearchTree(values[0]);

        for (int i = 1; i<values.length ;i++) {
            tree.insertNode(values[i]);
        }


        System.out.println("START OF PREORDER TRAVERSAL:");
        preorderTraversal(tree.root);
        System.out.println("START OF INORDER TRAVERSAL:");
        inorderTraversal(tree.root);
        System.out.println("START OF POSTORDER TRAVERSAL:");
        postorderTraversal(tree.root);
    }


    public static void preorderTraversal(Node root) {
        if (root == null) {
            // Do nothing
        }

        System.out.println(root.value);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null) {
            preorderTraversal(root.right);
        }

    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            // Do nothing
        }

        if (root.left != null) {
            inorderTraversal(root.left);
        }
        System.out.println(root.value);
        if (root.right != null) {
            inorderTraversal(root.right);
        }

    }

    public static void postorderTraversal(Node root) {
        if (root == null) {
            // Do nothing
        }

        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }

        System.out.println(root.value);
    }
}
