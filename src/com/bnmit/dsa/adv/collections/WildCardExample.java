package com.bnmit.dsa.adv.collections;
import java.util.ArrayList;
import java.util.List;
public class WildCardExample {
    public static void printListElements(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        printListElements(integerList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("C++");
        printListElements(stringList);
    }
}
