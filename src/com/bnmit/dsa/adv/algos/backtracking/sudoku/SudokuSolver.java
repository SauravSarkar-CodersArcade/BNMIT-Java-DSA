package com.bnmit.dsa.adv.algos.backtracking.sudoku;

public class SudokuSolver {
    public static boolean isPathSafe(int row, int col, int[][] board, int val){
        for (int i=0; i<board.length; i++){
            // Check the row
            if (board[row][i] == val) {
                return false;
            }
            // Check the column
            if(board[i][col] == val){
                return false;
            }
            // Check each 3x3 matrix
            int subGridRow = 3 * (row/3) + i / 3;
            int subGridCol = 3 * (col/3) + i % 3;
            if(board[subGridRow][subGridCol] == val){
                return false;
            }
        }
        return true;
    }
    public static boolean solveSudoku(int[][] board){
        int n = board.length;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if(board[row][col] == 0){
                    for (int val = 1; val<=9; val++){
                        if(isPathSafe(row,col,board,val)){
                            board[row][col] = val;
                            if(solveSudoku(board)){
                                return true;
                            }else {
                                board[row][col] = 0; // Backtracking
                            }
                        }
                    }return false; // No valid number found
                }
            }
        }
        return true; // Board successfully filled.
    }
    public static void printBoard(int[][] board){
        for (int[] row : board){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solveSudoku(board)){
            System.out.println("Solution Board:");
            printBoard(board);
        }else {
            System.out.println("No solution found.");
        }
    }
}
