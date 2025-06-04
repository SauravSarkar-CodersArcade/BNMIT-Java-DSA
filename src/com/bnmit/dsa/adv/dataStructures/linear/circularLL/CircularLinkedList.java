package com.bnmit.dsa.adv.dataStructures.linear.circularLL;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {
    private Node head;
    public CircularLinkedList(){
        head = null;
    }
    public void printListElements(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
    public void insertAtFront(int newValue){
        Node newNode = new Node(newValue);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        newNode.next = head;
        last.next = newNode;
        head = newNode;
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFront(3);
        cll.insertAtFront(2);
        cll.insertAtFront(1);
        cll.printListElements();
    }
}
