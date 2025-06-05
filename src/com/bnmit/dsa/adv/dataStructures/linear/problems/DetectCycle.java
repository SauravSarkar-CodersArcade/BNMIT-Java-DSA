package com.bnmit.dsa.adv.dataStructures.linear.problems;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {
    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = second; // Cycle
        if(detectCycle(head)){
            System.out.println("Cycle Detected");
        }else {
            System.out.println("No cycle.");
        }
    }
}
