package com.bnmit.dsa.adv.bufferAndBuilder;
public class BuilderExample {
    public void stringAppend(){
        StringBuilder buffer = new StringBuilder("Core");
        System.out.println("Original String: " + buffer);
        buffer.append(" Java");
        System.out.println("New String: " + buffer); // Core Java
    }
    public void stringInsert(){
        StringBuilder buffer = new StringBuilder("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuilder buffer = new StringBuilder("TIMNB");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer); // BNMIT
    }
    public static void main(String[] args) {
        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}
