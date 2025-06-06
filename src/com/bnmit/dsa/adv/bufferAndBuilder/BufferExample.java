package com.bnmit.dsa.adv.bufferAndBuilder;
public class BufferExample {
    public void stringAppend(){
        StringBuffer buffer = new StringBuffer("Core");
        System.out.println("Original String: " + buffer);
        buffer.append(" Java");
        System.out.println("New String: " + buffer); // Core Java
    }
    public void stringInsert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuffer buffer = new StringBuffer("TIMNB");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer); // BNMIT
    }
    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
