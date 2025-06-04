package com.bnmit.dsa.adv.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp){
                // Shift Operation
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp; // Fill the space with the temporary value
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,1,4,3,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
