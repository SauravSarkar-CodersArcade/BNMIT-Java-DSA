package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.lca;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or matches one of the nodes
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null child
        return (left != null) ? left : right;
    }
}