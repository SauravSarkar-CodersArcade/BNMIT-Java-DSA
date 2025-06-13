package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.questions.numberOfIslands;
class Solution {
    // Directions : 8 directions - up, down, left, right and 4 diagonals
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // Visited matrix to track visited cells
        boolean[][] visited = new boolean[n][m];
        int islandCount = 0;
        // Traverse each cell
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                // If it is a Land 'L' & it is not visited
                if(grid[i][j] == 'L' && !visited[i][j]){
                    // Call a DFS for that cell, visit the whole island
                    dfs(i,j,grid,visited,n,m);
                    islandCount++; // One island is completely traversed
                }
            }
        }
        return islandCount;
    }
    void dfs(int x, int y, char[][] grid, boolean[][] visited, int n, int m){
        visited[x][y] = true;
        // 8 directions
        for (int dir = 0; dir < 7; dir++){
            int newX = x + dx[dir];
            int newY = y + dy[dir];
            // Make sure the values are inside the boundary,
            // They should be Lands 'L', they should not be visited
            if(newX >= 0 && newY >= 0 && newX < n && newY < m &&
            grid[newX][newY] == 'L' && !visited[newX][newY]){
                dfs(newX,newY,grid,visited,n,m);
            }
        }
    }
}