package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.evenGrandParentSum;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class Main {

    // Recursive DFS to calculate sum
    public static void dfs(TreeNode node, TreeNode parent, TreeNode grandparent, int[] sum) {
        if (node == null) return;

        if (grandparent != null && grandparent.val % 2 == 0) {
            sum[0] += node.val;
        }

        dfs(node.left, node, parent, sum);
        dfs(node.right, node, parent, sum);
    }

    public static int sumEvenGrandparent(TreeNode root) {
        int[] sum = new int[1];  // Using array to simulate pass-by-reference
        dfs(root, null, null, sum);
        return sum[0];
    }

    public static void main(String[] args) {
        /*
                 6
               /   \
              7     8
             / \   / \ 
            2   7 1   3
           /  / \     \
          9  1   4     5  
        */
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);

        int result = sumEvenGrandparent(root);
        System.out.println("Sum of nodes with even-valued grandparents: " + result);
    }
}
