package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.traversalsAndImplementation.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree {
    public static void levelOrderTraversal(TreeNode root){
        // Base Case
        // If the root is empty, don't traverse
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll(); // Removes & stores the front element
            System.out.print(temp.data + " ");
            // Left subtree
            if(temp.left != null){
                queue.add(temp.left);
            }
            // Right subtree
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println("BFS or Level Order Traversal: ");
        levelOrderTraversal(root);
    }
}

