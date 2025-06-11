package com.bnmit.dsa.adv.algos.greedyAlgos.fractionalKnapsack;
class Solution {
    static class Item {
        int value, weight;
        Item(int v, int w){
            value = v;
            weight = w;
        }
    }
    static class ItemComparator implements java.util.Comparator<Item>{
        public int compare(Item a, Item b){
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2,r1); // Sort in descending order.
        }
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];
        // Prepare the items
        for (int i=0; i<n; i++){
            items[i] = new Item(values[i], weights[i]);
        }
        // Sort the items value/weight ratio (per unit value)
        java.util.Arrays.sort(items, new ItemComparator());
        double totalValue = 0.0;
        for (int i=0; i<n; i++){
            if(items[i].weight <= W){
                // Take full item
                totalValue += items[i].value;
                W -= items[i].weight;
            }else {
                // Take fractional part
                totalValue += ((double) items[i].value / items[i].weight) * W;
                break; // The Knapsack is full
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {60,100,120};
        int[] weights = {10,20,30};
        int W = 50;
        double maxVal = solution.fractionalKnapsack(values,weights,W);
        System.out.println("Maximum value in Knapsack: " + maxVal);
    }
}