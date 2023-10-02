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
        //tabulation -> bottom up method
        //step1: creation of dp array
        int[] dp = new int[n];
        //step2: base case analysis
        dp[0] = cost[0];
        dp[1] = cost[1];
        //step3: loop
        for(int i=2; i<n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
