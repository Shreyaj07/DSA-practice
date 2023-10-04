import java.util.Arrays;
//https://www.codingninjas.com/studio/problems/cut-into-segments_1214651?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar&count=25&page=4&search=&sort_entity=order&sort_order=ASC
public class Solution {
    public static void main(String[] args) {
        System.out.println(cutSegments(7,5,2,2));
        System.out.println(cutSegments(8,3,3,3));
        System.out.println(memoization(7,5,2,2));
        System.out.println(memoization(8,3,3,3));
        System.out.println(tabulation(7,5,2,2));
        System.out.println(tabulation(8,3,3,3));
    }
    public static int cutSegments(int n, int x, int y, int z) {
        int ans = solve(n, x,y,z);
        return Math.max(ans, 0);
    }
    public static int memoization(int n, int x, int y, int z){
       int[] dp = new int[n+1];
       for(int i=1; i<=n; i++){
           int a = (i>=x) ? dp[i-x] + 1: Integer.MIN_VALUE;
           int b = (i>=y) ? dp[i-y] + 1: Integer.MIN_VALUE;
           int c = (i>=z) ? dp[i-z] + 1: Integer.MIN_VALUE;
           dp[i] = Math.max(Math.max(a,b),c);
       }
       return Math.max(dp[n], 0);
    }
    private static int solve(int n, int x, int y, int z) {
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }
        int a = solve(n-x,x,y,z)+1;
        int b = solve(n-y, x,y,z)+1;
        int c = solve(n-z,x,y,z)+1;
        return Math.max(Math.max(a,b),c);
    }
    public static int tabulation(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i - x >= 0 && dp[i-x] != -1) {
                dp[i] = Math.max(dp[i], dp[i - x] + 1);
            }
            if (i - y >= 0 && dp[i-y] != -1) {
                dp[i] = Math.max(dp[i], dp[i - y] + 1);
            }
            if (i - z >= 0 && dp[i-z] != -1) {
                dp[i] = Math.max(dp[i], dp[i - z] + 1);
            }
        }
        return Math.max(dp[n], 0);
    }
}