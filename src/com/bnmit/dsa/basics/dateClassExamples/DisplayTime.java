package com.bnmit.dsa.basics.dateClassExamples;

import java.time.LocalTime;

public class DisplayTime {
    public static void main(String[] args) {
        LocalTime obj = LocalTime.now();
        System.out.println("The current time: " + obj);
    }
}
