package com.bnmit.dsa.adv.collections;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(13);
        numbers.add(11);
        System.out.println(numbers);
        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Java");
        names.add("Java");
        System.out.println(names);

        @Deprecated
        ArrayList data = new ArrayList();
        data.add("1");
        data.add('c');
        data.add(true);
        System.out.println(data);

    }
}
