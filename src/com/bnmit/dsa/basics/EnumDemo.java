package com.bnmit.dsa.basics;
enum BugPriority{
    HIGH,
    LOW,
    MEDIUM
}
public class EnumDemo {
    public static void main(String[] args) {
        BugPriority priority = BugPriority.MEDIUM;
        System.out.println("The bug priority is: " + priority);
        for (BugPriority p : BugPriority.values()){
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
