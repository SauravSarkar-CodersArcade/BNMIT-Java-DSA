package com.bnmit.dsa.adv.dataStructures.linear;
class Node {
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}
public class DoublyLinkedList {
    Node head;
    // Insert at end
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("Empty List. Can't delete node.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position <= 0){
            System.out.println("Invalid Position.");
            return;
        }
        if (position == 1){
            newNode.next = head;
            if(head != null){ // For multiple nodes
                head.prev = newNode;
            }
           head = newNode;
           return;
        }
        Node temp = head;
        int i = 1;
        while (temp != null && i < position - 1){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;

    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.display();
        // dll.deleteFromEnd();
        dll.display();
        dll.insertAtPosition(25,3);
        dll.display();
        dll.insertAtPosition(250,30);
        dll.display();
    }
}
