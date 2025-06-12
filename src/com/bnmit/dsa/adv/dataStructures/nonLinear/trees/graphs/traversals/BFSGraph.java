package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.traversals;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V +1]; // Visited Array (0-Based)
        Queue<Integer> q = new LinkedList<>();
        // Start BFS from node 1
        visited[1] = true;
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            // Traverse all it's neighbours
            for (int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
public class BFSGraph {
    public static void main(String[] args) {
        int V = 5; // Number of nodes
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialize adjacency list
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        // Adding the edges (Undirected Graph)
        addEdge(adjList,1,3);
        addEdge(adjList,1,2);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);
        addEdge(adjList,4,5);
        addEdge(adjList,2,5);

        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V,adjList);
        printBFS(ans);
    }
    public static void addEdge(List<List<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); // Undirected Graph
    }
    public static void printBFS(List<Integer> ans){
        for(int num : ans){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
