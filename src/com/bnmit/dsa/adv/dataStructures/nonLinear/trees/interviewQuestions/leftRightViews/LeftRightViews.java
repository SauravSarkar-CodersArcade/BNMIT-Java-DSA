package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.interviewQuestions.leftRightViews;
import java.util.LinkedList;
import java.util.Queue;
class Node{
    int val;
    Node left;
    Node right;
    Node(int x){
        val = x;
        left = right = null;
    }
}
public class LeftRightViews {

    public static void printLeftView(Node root){
        if(root == null){
            System.out.println("Empty tree. Can't print left view.");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++){
                Node node = q.poll();
                if(i == 0) System.out.print(node.val + " "); // First node @ that level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }
    public static void printRightView(Node root){
        if(root == null){
            System.out.println("Empty tree. Can't print left view.");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++){
                Node node = q.poll();
                if(i == levelSize-1) System.out.print(node.val + " "); // Last node @ that level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        System.out.print("Left View: ");
        printLeftView(root);
        System.out.print("Right View: ");
        printRightView(root);
    }
}
