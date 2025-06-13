package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.topoSort.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFSKahn {
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V];
        // Step 1: Calculate the in-degrees of all nodes
        for (int i=0; i<V; i++){
            for (int it : adj.get(i)){
                inDegree[it]++;
            }
        }
        // Step 2: Add all nodes with in degree 0 to the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        // Step 3: BFS Call
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            // Reduce the in degree of adjacent nodes
            for (int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return topo;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortBFSKahn obj = new TopologicalSortBFSKahn();
        List<Integer> ans = obj.topoSort(V, adj);
        for (int node : ans){
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
