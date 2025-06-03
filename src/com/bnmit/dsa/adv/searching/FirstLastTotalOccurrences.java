package com.bnmit.dsa.adv.searching;
public class FirstLastTotalOccurrences {
    static int firstOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the ans.
                // Go to the extreme left hand side to find the first occurrence
                ans = mid;
                e = mid - 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the ans.
                // Go to the extreme right hand side to find the last occurrence
                ans = mid;
                s = mid + 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int totalOccurrences(int[] arr, int key){
        int fo = firstOccurrence(arr,key);
        int lo = lastOccurrence(arr,key);
        int total = lo - fo + 1;
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
        int f = firstOccurrence(arr,3);
        int l = lastOccurrence(arr,3);
        int t = totalOccurrences(arr,3);
        System.out.println("First " + f + " Last " + l + " Total " + t);
    }
}
