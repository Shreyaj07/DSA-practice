class DP {
    public static void main(String[] args) {
        System.out.println(minScoreTriangulation(new int[]{1, 2, 3}));
    }

    public static int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        return solve(values, 0, n - 1, dp);
    }

    static int solve(int[] v, int i, int j, int[][] dp) {
        // Base case
        if (i + 1 == j) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            ans = Math.min(ans, v[i] * v[j] * v[k] + solve(v, i, k, dp) + solve(v, k, j, dp));
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
}
