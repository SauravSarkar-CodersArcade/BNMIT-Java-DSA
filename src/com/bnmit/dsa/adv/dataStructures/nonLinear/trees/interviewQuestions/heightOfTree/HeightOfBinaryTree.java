package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.heightOfTree;
class Node {
    int data;
    Node left;
    Node right;
    Node(int x){
        data = x;
        left = right = null;
    }
}
public class HeightOfBinaryTree {
    static int findHeight(Node root){
        // Base Case: If the root is null, tree is empty, height is 0
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
        // We are adding 1 for the root node
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        System.out.println("Height of the tree: " + findHeight(root)); // 3
        Node r1 = null;
        System.out.println("Height of r1: " + findHeight(r1));
    }
}
