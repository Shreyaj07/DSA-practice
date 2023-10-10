public class Solution {
    public static int frogJump(int n, int heights[]) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return heights[0];
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);  // Corrected calculation for the second step

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(heights[i] - heights[i - 1]), 
                             dp[i - 2] + Math.abs(heights[i] - heights[i - 2]));
        }

        return dp[n - 1];
    }
}
