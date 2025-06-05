package com.bnmit.dsa.adv.dataStructures.linear.stacksAndQueues;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Pineapple");
        System.out.println("Stack: " + stack);
        String popped = stack.pop();
        System.out.println("Popped item: " + popped);
        System.out.println("Current Size: " + stack.size());
    }
}
