package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.topoSort.bfsKahns;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class TopologicalSortBFSKahnCycleDetection {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V];
        // Step 1: Calculate the in degree for each node
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
        // Step 3: Count nodes processed in the Topological Sort
        int count = 0;
        while (!q.isEmpty()){
            int node = q.poll();
            count++;
            for (int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }
        // If all the nodes are processed, there is no cycle
        // If even one single node is not processed, there is a cycle
        return count != V;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        TopologicalSortBFSKahnCycleDetection obj = new TopologicalSortBFSKahnCycleDetection();
        boolean ans = obj.isCyclic(V,adj);
        if(ans){
            System.out.println("Cycle Detected.");
        }
        else {
            System.out.println("No cycle.");
        }
    }
}
