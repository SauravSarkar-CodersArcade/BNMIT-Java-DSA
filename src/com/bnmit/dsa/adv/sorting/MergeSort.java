package com.bnmit.dsa.adv.sorting;
import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int[] arr){
        if(arr.length < 2){ // If the length is 1, we stop dividing the array further
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        mergeSort(left); // Break down the left array using recursion
        mergeSort(right); // Break down the right array using recursion
        merge(arr,left,right); // Merge the two sorted arrays into a single array
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){ // Remaining elements from left part if any
            arr[k++] = left[i++];
        }
        while (j < right.length){ // Remaining elements from right part if any
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,-5,5,2,7,6,4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
