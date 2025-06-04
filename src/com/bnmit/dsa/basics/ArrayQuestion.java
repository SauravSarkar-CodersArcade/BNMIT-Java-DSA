package com.bnmit.dsa.basics;
public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,1,3,2,5,7};
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println
                ("The non-repeating element is: " + result);
        System.out.println(~-100);
    }
}
