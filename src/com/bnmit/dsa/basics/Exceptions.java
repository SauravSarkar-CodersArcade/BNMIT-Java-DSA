package com.bnmit.dsa.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exceptions {
    {
        System.out.println("Kamal");
    }
    public static void main(String[] args) throws IOException {
        new Exceptions();
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            System.out.println(str);
        }
    }
    {
        System.out.println("Yathin"); // IIB Instance Initializer Block
    }
    static {
        System.out.println("BNMIT");
    }
}
