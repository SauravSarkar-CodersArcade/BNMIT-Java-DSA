package com.bnmit.dsa.basics.samInterface;
public interface Demo {
    void function();
}
class BNMIT {
    public static void main(String[] args) {
        // Boiler Plate Code
        Demo obj = new Demo(){
            public void function(){
                System.out.println("Boiler-plate code");
            }
        };
        // Scala -> Java
        obj.function();
        Demo obj1 = () -> System.out.println("Lambda Expression - Scala Inspired");
        obj1.function();
    }
}
