package com.bnmit.dsa.adv.streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers = numbers.stream().
                filter(n -> n % 2 == 0).
                collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

    }
}
