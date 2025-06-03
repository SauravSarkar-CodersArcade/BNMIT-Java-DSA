package com.bnmit.dsa.adv.sorting;

import java.util.Arrays;

public class RadixSortAlgo {
    public static void radixSort(int[] arr){
        // Find the max
        int max = getMax(arr);
        // Call the count sort method to sort the array
        for (int exp = 1; max / exp > 0;  exp *= 10){
            countSort(arr, exp);
        }
    }
    private static int getMax(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    private static void countSort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 0-9 ten elements
        // Count the occurrences
        for (int i=0; i<n; i++){
            int digit = (arr[i]/exp)%10; // 325/1 = 325%10=5
            count[digit]++;
        }
        // Cumulative count
        // Skip index 0
        for (int i=1; i<10; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        for (int i=n-1; i>=0; i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }
        for (int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {325,3,246,192,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
