package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.mirrorTree;
public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
    private static void inorder(Tree root){ // LDR
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    private static Tree mirrorTree(Tree root){
        if(root == null){
            return root;
        }
        // Swap the left & right subtrees
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recursively swap the left & right subtrees
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
        return root;
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        System.out.println("Inorder of Original Tree: ");
        inorder(root);
        System.out.println();
        root = mirrorTree(root);
        System.out.println("InOrder of the mirror Tree: ");
        inorder(root);
        System.out.println();
    }

}
