package com.bnmit.dsa.basics;
public class SillyQuestion {
    public static void main(String[] args) {
        int n1 = 7, n2 = 4;
        String[] result = {"Even", "Odd"};
        System.out.println(n1 + " is " + result[n1 % 2]); // n1 is Odd
        System.out.println(n2 + " is " + result[n2 % 2]); // n2 is Even
    }
}
