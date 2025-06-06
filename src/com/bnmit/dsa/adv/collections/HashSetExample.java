package com.bnmit.dsa.adv.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Sachin");
        names.add("Rahul");
        names.add("Kamal");
        names.add("Kamal");
        names.add("Rahul");
        names.add("Rohit");
        HashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(1);
        numbers.add(12);
        numbers.add(1);
        System.out.println(names);
        System.out.println(numbers);
        System.out.println(names.contains("Rahul"));
        names.clear();
        System.out.println(names.isEmpty());
    }
}
