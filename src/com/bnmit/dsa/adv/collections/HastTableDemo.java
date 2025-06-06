package com.bnmit.dsa.adv.collections;
import java.util.Hashtable;
import java.util.Map;
public class HastTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Pramath");
        ht.put(117,"Yathin");
        ht.put(128,"Vishakh");
        ht.put(100,"Sagar");
        ht.put(99,"Kamal");
        for (Map.Entry<Integer,String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
