package com.bnmit.dsa.adv.sorting;
public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        // Place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr,pivotIndex,s);
        // Let's manage the left & the right side of the pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base case
        if(s >= e){ // Single element or out of bounds, just return
            return;
        }
        // Find the pivot for partition
        int p = partitionIndex(arr,s,e);
        // Now, use recursion to sort the left & right part of the pivot
        // Left Part
        quickSort(arr,s,p-1);
        // Right Part
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args) {
        int[] arr = {8,4,7,3,10,2,6};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
