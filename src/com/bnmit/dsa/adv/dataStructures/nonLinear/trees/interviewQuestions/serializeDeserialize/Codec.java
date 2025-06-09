package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.serializeDeserialize;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0}; // acts as a pointer during recursion
        return deserializeHelper(values,index);
    }
    public TreeNode deserializeHelper(String[] values, int[] index){
        if(index[0] >= values.length || values[index[0]].equals("null")){
            index[0]++;
            return null;
        }
        // Now we need to form the Tree
        TreeNode node = new TreeNode(Integer.parseInt(values[index[0]]));
        index[0]++;
        node.left = deserializeHelper(values,index);
        node.right = deserializeHelper(values,index);
        return node;
    }
    public static void main(String[] args) {
        String str = "Kamal1Is1In1AIML1Seventh1Semester";
        String[] words = str.split("1");
        System.out.println(words[0]);
        for (String s : words){
            System.out.print(s + " ");
        }
    }
}