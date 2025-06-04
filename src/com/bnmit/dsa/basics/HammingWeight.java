package com.bnmit.dsa.basics;
public class HammingWeight {
    static int hammingWeight(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(15));
        System.out.println(hammingWeight(0));
        String str = "BNMIT";
        System.out.println(str.toLowerCase());
        System.out.println(str);
    }
}
