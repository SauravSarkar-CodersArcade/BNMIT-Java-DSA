package com.bnmit.dsa.adv.algos.greedyAlgos;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int currentTank = 0, totalTank = 0, startIndex = 0;
        
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalTank += diff;
            currentTank += diff;
            
            if (currentTank < 0) {
                startIndex = i + 1;
                currentTank = 0;
            }
        }
        
        return totalTank >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
