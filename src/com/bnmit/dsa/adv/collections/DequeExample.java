package com.bnmit.dsa.adv.collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(100);
        System.out.println("Deque: " + deque);
        deque.removeLast();
        System.out.println("After removing last: " + deque);
    }
}
