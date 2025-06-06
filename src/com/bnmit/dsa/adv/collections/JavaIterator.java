package com.bnmit.dsa.adv.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Porsche");
        names.add("Volkswagen");
        names.add("Ferrari");
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
