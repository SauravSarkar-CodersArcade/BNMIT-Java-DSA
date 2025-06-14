package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.graphs.dijkstras;
import java.util.*;
public class DijkstrasPQ {
    public static List<Integer> dijkstra(int V, List<List<Pair>> adj, int S){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        List<Integer> distTo = new ArrayList<>
                (Collections.nCopies(V, Integer.MAX_VALUE));
        // Distance to the source node is 0
        distTo.set(S,0);
        pq.offer(new Pair(S,0));
        // Relaxation
        while (!pq.isEmpty()){
            Pair current = pq.poll();
            int node = current.node;
            int dist = current.distance;
            for (Pair neighbour : adj.get(node)){
                int v = neighbour.node;
                int w = neighbour.distance;
                if(dist + w < distTo.get(v)){
                    distTo.set(v,dist+w); // relaxation
                    pq.offer(new Pair(v,dist+w));
                }
            }
        }
        return distTo;
    }
    static class Pair{
        int node, distance;
        Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 6, S = 0;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>()); // Creating empty lists for each node
        }
        // Undirected Weighted Graph
        adj.get(0).add(new Pair(1,4));
        adj.get(0).add(new Pair(2,4));
        adj.get(1).add(new Pair(0,4));
        adj.get(1).add(new Pair(2,2));
        adj.get(2).add(new Pair(0,4));
        adj.get(2).add(new Pair(1,2));
        adj.get(2).add(new Pair(3,3));
        adj.get(2).add(new Pair(4,1));
        adj.get(2).add(new Pair(5,6));
        adj.get(3).add(new Pair(2,3));
        adj.get(3).add(new Pair(5,2));
        adj.get(4).add(new Pair(2,1));
        adj.get(4).add(new Pair(5,3));
        adj.get(5).add(new Pair(2,6));
        adj.get(5).add(new Pair(3,2));
        adj.get(5).add(new Pair(4,3));

        List<Integer> shortestDistArray = dijkstra(V,adj,S);
        System.out.println("Shortest Distance from node " +
                S + " : ");
        for (int i=0; i<V; i++){
            System.out.print(shortestDistArray.get(i) + " ");
        }
        System.out.println();
    }
}
