//https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(9,9,8,2));
        System.out.println(maximumNonAdjacentSum(nums));
        System.out.println(memoization(nums));
        System.out.println(tabulation(nums));
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        return solve(nums,n-1);
    }
    public static int memoization(ArrayList<Integer> nums){
       int n = nums.size();
       int[] dp = new int[n];
       Arrays.fill(dp,-1);
       return solveMem(nums,n-1,dp);
    }

    private static int solveMem(ArrayList<Integer> nums, int n, int[] dp) {
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int incl = solve(nums,n-2)+nums.get(n);
        int excl = solve(nums,n-1)+0;
        dp[n] = Math.max(incl,excl);
        return dp[n];
    }

    public static int solve(ArrayList<Integer> nums, int n){
        //base case
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums.get(0);
        }
        int incl = solve(nums,n-2)+nums.get(n);
        int excl = solve(nums,n-1)+0;
        return Math.max(incl, excl);
    }
    public static int tabulation(ArrayList<Integer> nums){
        int n = nums.size();
        int[] dp = new int[n];
        Arrays.fill(dp,0);
        dp[0] = nums.get(0);
        for(int i=2; i<n; i++){
            int incl = dp[i-2]+nums.get(i);
            int excl = dp[i-1] + 0;
            dp[i] = Math.max(incl, excl);
        }
        return dp[n-1];
    }
}