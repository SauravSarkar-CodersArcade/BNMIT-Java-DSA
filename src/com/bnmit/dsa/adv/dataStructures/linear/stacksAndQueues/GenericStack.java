package com.bnmit.dsa.adv.dataStructures.linear.stacksAndQueues;
public class GenericStack<T> {
    private static int MAX_SIZE = 5;
    private Object[] arr = new Object[MAX_SIZE];
    private int top = -1;
    public void push(T data){
        if(top == MAX_SIZE -1){
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed: " + data);
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        if(top == -1){
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        T popped = (T) arr[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }
    @SuppressWarnings("unchecked")
    public T peek(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return null;
        }
        return (T) arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE -1;
    }
    public int size(){
        return top + 1;
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i=0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.printStack();
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("BNMIT");
        stringStack.push("JAVA-DSA");
        stringStack.printStack();
    }
}
