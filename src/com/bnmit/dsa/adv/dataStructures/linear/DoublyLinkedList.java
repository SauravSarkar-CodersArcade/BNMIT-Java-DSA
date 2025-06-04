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
    }
}
