public class EditDistance {
//    min conversion required to make 2 strings equal
    public static void main(String[] args) {
        String str1 = "kitten";
        String str2 = "sitting";

        int distance = minDistance(str1, str2);

        System.out.println("Minimum Edit Distance: " + distance);
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store the edit distance values
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the first row and first column
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Calculate the edit distance using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
