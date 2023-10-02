//https://leetcode.com/problems/min-cost-climbing-stairs/
public class DP {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
        int[] cost2 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost2));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
