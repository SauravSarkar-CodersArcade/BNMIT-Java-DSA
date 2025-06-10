package com.bnmit.dsa.adv.algos.backtracking;

import java.util.Scanner;

public class RatInMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n,
                             int[][] resultantArray){
        // Base Case
        // If the rat has reached the destination [n-1][n-1]
//        if(arr[n-1][n-1] == 0){
//            return false;
//        }
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if the rat can stand at the current position / cell (x,y)
        if(isPathSafe(arr,x,y,n)){
            resultantArray[x][y] = 1;
            // Move forward to find a path
            if(ratInMaze(arr,x+1,y,n,resultantArray)){
                return true;
            }
            // Move downward to find a path
            if(ratInMaze(arr,x,y+1,n,resultantArray)){
                return true;
            }
            // We couldn't find a path, so we backtrack
            resultantArray[x][y] = 0; // Backtracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        // Input Array (Maze) n x n
        int[][] arr = new int[n][n];
        System.out.println("Enter the Maze Array Values: (0 & 1)");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Take the resultant array (n x n) initialized with 0s
        int[][] resultantArray = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr,0,0,n,resultantArray)){
            // A path exists, it is in the resultant array
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No path for the Rat in the Maze exists.");
        }
    }
}
