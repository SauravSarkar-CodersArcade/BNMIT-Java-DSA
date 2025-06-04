package com.bnmit.dsa.adv.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=1; i < n; i++){
            for (int j=0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
