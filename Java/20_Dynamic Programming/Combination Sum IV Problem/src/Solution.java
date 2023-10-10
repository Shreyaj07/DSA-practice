// https://www.codingninjas.com/studio/problems/number-of-ways_3755252
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        System.out.println(findWays(new int[]{1,2,3,4},3));
        System.out.println(solveTabulation(new int[]{1,2,3,4},3));
    }

    static int solve(int num[], int tar){
        if(tar<0){
            return 0;
        }
        if(tar==0){
            return 1;
        }
        int ans =0;
        for(int i=0; i<num.length; i++){
            ans+=solve(num,tar-num[i]);
        }
        return ans;
    }
    public static int findWays(int num[], int tar) {
//        return solve(num,tar);
        int[] dp = new int[tar+1];
        Arrays.fill(dp,-1);
        return solveMemo(num, tar, dp);
    }

    private static int solveMemo(int[] num, int tar, int[] dp) {
        if(tar<0){
            return 0;
        }
        if(tar==0){
            return 1;
        }
        if(dp[tar]!=-1){
            return dp[tar];
        }
        int ans =0;
        for (int j : num) {
            ans += solveMemo(num, tar - j, dp);
        }
        dp[tar] = ans;
        return dp[tar];
    }

    private static int solveTabulation(int[] num, int tar) {
        int[] dp = new int[tar+1];
        dp[0] = 1;
        //traversing from target 1 to tar
        for(int i=0; i<=tar; i++){
            //transversing of num vector
            for (int k : num) {
                if (i - k >= 0) {
                    dp[i] += dp[i - k];
                }
            }
        }
        return dp[tar];
    }
}

