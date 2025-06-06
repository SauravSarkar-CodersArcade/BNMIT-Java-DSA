package com.bnmit.dsa.adv.collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("01", "xxxxx");
        hm1.put("03", "aaaaa");
        hm1.put("02", "ccccc");
        hm1.put("05", "bbbbb");
        hm1.put("04", "yyyyy");
        System.out.println("Iterating over hashmap: ");
        for (Map.Entry<String,String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // We use LinkedHashMap to maintain insertion order
        HashMap<String, String> hm2 = new LinkedHashMap<>();
        hm2.put("01", "xxxxx");
        hm2.put("03", "aaaaa");
        hm2.put("02", "ccccc");
        hm2.put("05", "bbbbb");
        hm2.put("04", "yyyyy");
        System.out.println("Iterating over linked hashmap: ");
        for (Map.Entry<String,String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
