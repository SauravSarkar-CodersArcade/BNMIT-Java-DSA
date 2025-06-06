package com.bnmit.dsa.adv.collections;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] duplicateData = {"Java", "Python", "SQL", "Python", "Java", "C++", "SQL"};
        Set<String> uniqueData = new LinkedHashSet<>();
        for (String str : duplicateData){
            uniqueData.add(str);
        }
        // System.out.println("After removing duplicates: " + uniqueData);
        // Lambda Expression
        uniqueData.forEach(x -> System.out.println(x));
    }
}
