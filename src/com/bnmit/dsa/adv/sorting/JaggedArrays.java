package com.bnmit.dsa.adv.sorting;
public class JaggedArrays {
    public static void main(String[] args) {
        // 2D array with unequal row length
        // Array of 3 arrays 3 rows x 4 cols
        int[][] jagged = {{1,2,3,4,5},
                          {4,5,6,7},
                          {7,8,9}};
        for (int i=0; i<jagged.length; i++){ // rows
            for (int j=0; j<jagged[i].length; j++){ // cols
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        // For each loop -> Enhanced For Loop
        for (int[] arr : jagged){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        char[][] languages = {{'J','A','V','A'},
                              {'C','+','+'},
                              {'P','Y','T','H','O','N'}};
        for (char[] ch : languages){
            for (char c : ch){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
