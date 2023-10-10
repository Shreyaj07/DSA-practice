import java.util.* ;
import java.io.*; 

public class Solution{
    public static void main(String[] args) {
        int[] weight={1,2,4,5};
        int[] value = {5,4,6,8};
        int W = 5;
        int n = 4;
        System.out.println(knapsack(weight,value,n,W));
        System.out.println(solveMemo(weight,value,n,W));
    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        return solve(weight, value, n-1, maxWeight);
    }
     static int solve(int[] weight, int[] value, int index, int W){
        //base case
        //if only 1 item is present, just cmp it's wt. with the knapsack cpty
        if(index==0){
            if(weight[0] <=W){
                return value[0];
            }else{
                return 0;
            }
        }
        int include=0, exclude;
        if(weight[index]<=W){
            include = value[index] + solve(weight, value, index-1, W - weight[index]);
        }
        exclude = solve(weight, value, index-1, W);
        return Math.max(include, exclude);
    }
    public static int solveMemo(int[] weight, int[] value, int n, int maxWeight){
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solveMemoization(weight, value, n, maxWeight, dp);
    }

    private static int solveMemoization(int[] weight, int[] value, int index, int W, int[][] dp) {
        // Base case
        if (index == 0 || W == 0) {
            return 0;
        }

        // If the result is already computed, return it
        if (dp[index][W] != -1) {
            return dp[index][W];
        }

        int include = 0, exclude;

        if (weight[index - 1] <= W) {
            include = value[index - 1] + solveMemoization(weight, value, index - 1, W - weight[index - 1], dp);
        }

        exclude = solveMemoization(weight, value, index - 1, W, dp);

        // Store the result in the memoization table
        dp[index][W] = Math.max(include, exclude);

        return dp[index][W];
    }
}