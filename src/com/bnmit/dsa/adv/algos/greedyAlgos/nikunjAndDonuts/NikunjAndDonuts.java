package com.bnmit.dsa.adv.algos.greedyAlgos.nikunjAndDonuts;
import java.util.Arrays;
import java.util.Scanner;
public class NikunjAndDonuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of donuts
        int n = scanner.nextInt();
        int[] calories = new int[n];
        // Input the calorie values
        for (int i=0; i<n; i++){
            calories[i] = scanner.nextInt();
        }
        // Sort the array in descending order to eat the highest-calorie donuts first
        Arrays.sort(calories);
        int left = 0;
        int right = n-1;
        while (left < right){
            int temp = calories[left];
            calories[left] = calories[right];
            calories[right] = temp;
            left++;
            right--;
        }
//        int totalMiles = 0;
//        for (int i=0; i<n; i++){
//            totalMiles += Math.pow(2,i) * calories[i];
//        }
        long totalMiles = 0;
        for (int i=0; i<n; i++){
            totalMiles += (1L << i) * calories[i];
        }
        System.out.println(totalMiles + " miles.");
    }
}
