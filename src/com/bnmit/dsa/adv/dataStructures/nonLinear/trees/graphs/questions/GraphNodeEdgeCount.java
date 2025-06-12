package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GraphNodeEdgeCount {
    public static int countNodes( List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges( List<List<Integer>> adjList){
        int edges = 0;
        for (List<Integer> neighbours : adjList){
            edges += neighbours.size();
        }
        // Since it is an undirected graph, each edge is counted twice
        return edges / 2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // Manually adding the adjacency list representation
        adjList.add(Arrays.asList(1, 2)); // Node 0
        adjList.add(Arrays.asList(0, 2, 3)); // Node 1
        adjList.add(Arrays.asList(0, 1, 4)); // Node 2
        adjList.add(Arrays.asList(1, 4)); // Node 3
        adjList.add(Arrays.asList(2, 3)); // Node 4

        int nodes = countNodes(adjList);
        int edges = countEdges(adjList);
        System.out.println("Number of nodes: " + nodes);
        System.out.println("Number of edges: " + edges);
    }
}
