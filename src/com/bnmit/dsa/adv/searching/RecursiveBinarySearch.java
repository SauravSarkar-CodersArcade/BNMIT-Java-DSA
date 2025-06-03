package com.bnmit.dsa.adv.searching;
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int s, int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] < key){
            return recursiveBinarySearch(arr,key,mid+1,e);
        }else {
            return recursiveBinarySearch(arr,key,s,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,10,13,15};
        System.out.println(recursiveBinarySearch(arr,10,0,arr.length-1));
    }
}
