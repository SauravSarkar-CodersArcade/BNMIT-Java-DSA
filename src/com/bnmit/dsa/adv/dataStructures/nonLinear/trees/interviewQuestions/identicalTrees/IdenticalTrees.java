package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.identicalTrees;
class Node {
    int data;
    Node left;
    Node right;
    Node(int x){
        data = x;
        left = right = null;
    }
}
public class IdenticalTrees {
    static boolean areIdentical(Node t1, Node t2){
        // If both of them are null, both are empty, they are identical
        if(t1 == null && t2 == null){
            return true;
        }
        // One f them is empty -> Not identical
        if(t1 == null || t2 == null){
            return false;
        }
        // Compare the root data of both the trees
        if(t1.data != t2.data){
            return false;
        }
        // Use recursion to check the left & right subtrees of both the trees
        return (areIdentical(t1.left,t2.left) &&
        areIdentical(t1.right, t2.right));
    }

    public static void main(String[] args) {
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);
        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);
        if(areIdentical(t1,t2)){
            System.out.println("t1 & t2 are identical");
        }else {
            System.out.println("t1 & t2 are not identical");
        }
        Node t3 = new Node(1);
        t3.left = new Node(2);
        t3.right = new Node(3);
        Node t4 = new Node(1);
        t4.left = new Node(2);
        t4.right = new Node(4);
        if(areIdentical(t3,t4)){
            System.out.println("t3 & t4 are identical");
        }else {
            System.out.println("t3 & t4 are not identical");
        }
    }
}
