package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.validBST;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class Main {

    // Helper function to validate BST
    public static boolean validate(TreeNode node, long minVal, long maxVal) {
        if (node == null) return true;

        if (node.val <= minVal || node.val >= maxVal)
            return false;

        return validate(node.left, minVal, node.val) &&
               validate(node.right, node.val, maxVal);
    }

    // Main BST validation function
    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Builds a sample tree (Note: 30 is incorrect for BST)
    public static TreeNode buildValidBST() {
        //      5
        //     / \
        //    30  7   ← 30 breaks BST property!
        //   / \   \
        //  2   4   8
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(30); // Intentionally wrong to show "Invalid BST"
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildValidBST();
        if (isValidBST(root)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Invalid BST");
        }
    }
}
