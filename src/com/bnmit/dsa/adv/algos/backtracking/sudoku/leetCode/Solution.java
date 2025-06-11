package com.bnmit.dsa.adv.algos.backtracking.sudoku.leetCode;

class Solution {
    public static boolean isPathSafe(int row, int col, char[][] board, char val){
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
    public static boolean solveSudoku(char[][] board){
        int n = 9;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if(board[row][col] == '.'){
                    for (char val = '1'; val<='9'; val++){
                        if(isPathSafe(row,col,board,val)){
                            board[row][col] = val;
                            if(solveSudoku(board)){
                                return true;
                            }else {
                                board[row][col] = '.'; // Backtracking
                            }
                        }
                    }return false; // No valid number found
                }
            }
        }
        return true; // Board successfully filled.
    }
}