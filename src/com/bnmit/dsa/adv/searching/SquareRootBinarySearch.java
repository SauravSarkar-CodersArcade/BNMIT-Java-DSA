package com.bnmit.dsa.adv.searching;
public class SquareRootBinarySearch {
    static int sqRootBinarySearch(int n){
        int s = 0;
        int e = n;
        int ans = 0;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            } else if (square < n) {
                // Store the ans & move to the right
                ans = mid;
                s = mid + 1;
            }else {
                // We are out of range, go to the left to find the answer
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqRootBinarySearch(36));
        System.out.println(sqRootBinarySearch(37));
    }
}
