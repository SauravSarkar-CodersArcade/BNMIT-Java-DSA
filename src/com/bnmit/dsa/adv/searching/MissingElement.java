package com.bnmit.dsa.adv.searching;
public class MissingElement {
    public static int findMissingElement(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] != mid + 1){
                // Go to the left hand side
                // Perform the checks as well
                if(mid == 0 || arr[mid-1] == mid){
                    return mid + 1;
                }
                e = mid - 1;
            }
            else if(arr[mid] == mid + 1){
                // Go to the right hand side
                s = mid + 1;
            }
        }
        return arr.length+1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(findMissingElement(arr1));
        System.out.println(findMissingElement(arr2));
    }
}
