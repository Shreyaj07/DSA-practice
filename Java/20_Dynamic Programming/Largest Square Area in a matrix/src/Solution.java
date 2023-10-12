class Solution {
    public static void main(String[] args) {
        int[][] mat = {{1, 1}, {1, 1}};
        System.out.println(maxSquare(2, 2, mat));
    }

    static int maxSquare(int n, int m, int mat[][]) {
        int maxi = 0;
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = mat[i][j];
                } else if (mat[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                }
                maxi = Math.max(maxi, dp[i][j]);
            }
        }
        return maxi;
    }
}
