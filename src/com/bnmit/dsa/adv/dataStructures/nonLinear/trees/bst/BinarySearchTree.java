package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.bst;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class BinarySearchTree { // Left < Node < Right for each node TC : O(log N)
    // The height is not balanced -> That's a disadvantage of BST - 1962
    // To solve this problem, we use AVL trees & Red Black Trees Height (0, + or - 1)
    // For Ascending or Descending order data, it becomes a Linked List TC : O(N)
    static void inOrderTraversal(TreeNode root){
        if(root != null){ // LDR
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key); // Create a new node & return that
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // 1 Empty
        // 2 What if the data is at the root only
        if(root == null || root.data == key){
            return root;
        }
       if(root.data < key){
           return search(root.right,key);
       }
       return search(root.left,key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode current = root;
        while (current != null && current.left != null){
            current = current.left;
        }
        return current;
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left,key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{
            // Only 1 child
            if(root.left == null){ // Left child doesn't exist
                TreeNode temp = root.right;
                root = null;
                return temp;
            }else if(root.right == null){ // Right child doesn't exist
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with 2 children
            // Find the in-order successor & replace the root node with that value
            // Find the minimum @ the right side subtree
            TreeNode temp = findMin(root.right);
            // Replace the root node with that value
            root.data = temp.data;
            // From the right side, call delete again to delete the duplicate data
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root,50);
        insert(root,30);
        insert(root,20);
        insert(root,40);
        insert(root,60);
        insert(root,70);
        insert(root,80);
        System.out.println("InOrder Traversal: ");
        inOrderTraversal(root);
        System.out.println("\nDelete50:");
        root = deleteNode(root,50);
        inOrderTraversal(root);
        System.out.println("\nDelete90:");
        root = deleteNode(root,90);
        inOrderTraversal(root);
        System.out.println();
        TreeNode result = search(root,400);
        if(result == null){
            System.out.println("Key not found");
        }else {
            System.out.println("Key found");
        }
    }
}
