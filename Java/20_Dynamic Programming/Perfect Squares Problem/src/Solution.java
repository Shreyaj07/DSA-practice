import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(MinSquares(100));
        System.out.println(MinSquares(6));
        System.out.println(solveMemo(100));
    }

    public static int MinSquares(int n) {
        return solve(n);
    }

    // Recursive function to calculate the minimum number of squares
    private static int solve(int n) {
        // Base case: If n is already 0, no squares are needed.
        if (n == 0) {
            return 0;
        }

        // Initialize ans to n because n can be represented as n squares of 1x1.
        int ans = n;

        // Try all perfect squares less than or equal to n.
        for (int i = 1; i * i <= n; i++) {
            int temp = i * i;

            // Calculate the number of squares needed for n - temp and add 1 for the current square.
            ans = Math.min(ans, 1 + solve(n - temp));
        }

        return ans;
    }

    // Memoization version of the solve function
    static int solveMemo(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solveMemoization(n, dp);
    }

    // Memoization helper function
    private static int solveMemoization(int n, int[] dp) {
        // Base case: If n is already 0, no squares are needed.
        if (n == 0) {
            return 0;
        }

        // If the result is already computed, return it.
        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = n;

        // Try all perfect squares less than or equal to n.
        for (int i = 1; i * i <= n; i++) {
            int temp = i * i;

            // Calculate the number of squares needed for n - temp and add 1 for the current square.
            ans = Math.min(ans, 1 + solveMemoization(n - temp, dp));
        }

        // Store the result in the memoization table.
        dp[n] = ans;
        return dp[n];
    }
}
