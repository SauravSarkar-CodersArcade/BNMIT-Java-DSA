package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.questions.numberOfProvinces;
import java.util.ArrayList;
class Solution {
    // dfs traversal function
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis){
        vis[node] = 1;
        for (Integer it : adjLs.get(node)){
            if(vis[it] == 0){
                dfs(it,adjLs,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<V; i++){
            adjLs.add(new ArrayList<Integer>());
        }
        // To change adjacency matrix to list
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                // Self nodes are not considered
                if(adj.get(i).get(j) == 1 && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i); // Undirected Graph given in question
                }
            }
        }
        int[] vis = new int[V];
        int cnt = 0;
        for (int i=0; i<V; i++){
            if(vis[i] == 0){
                cnt++;
                dfs(i,adjLs,vis);
            }
        }
        return cnt;
    }
}