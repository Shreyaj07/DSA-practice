//https://www.codingninjas.com/studio/problems/ninja-and-the-fence_3210208

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int n = 3, k=2;
		System.out.println(numberOfWays(n,k));
		System.out.println(numberOfWays(2,4));
		System.out.println(numberOfWays(4,2));
		System.out.println(solveMemo(n,k));
		System.out.println(solveTabulation(n,k));
		System.out.println(spaceOptimization(n,k));
	}
	//recursion
	public static int numberOfWays(int n, int k) {
		return solve(n,k);
	}
	static int solve(int n, int k){
		//base case
		if(n==1){
			return k;
		}
		if(n==2){
			return add(k, multiply(k,k-1));
		}
		return add(multiply(solve(n-2,k), k-1), multiply(solve(n-1,k), k-1));
	}
	static int add(int a, int b ){
		int mod = (int) Math.pow(10,9) + 7;
		return (a%mod + b%mod) % mod;
	}
	static int multiply(int a, int b){
		int mod = (int) Math.pow(10,9) + 7;
		return(int) ((long) (a % mod) * (b % mod) % mod);
	}
	//memoization
	public static int solveMemo(int n, int k){
		int[] dp = new int[n+1];
		Arrays.fill(dp,-1);
		return solveMemo(n,k,dp);
	}
	private static int solveMemo(int n, int k, int[] dp) {
		if(n==1){
			return k;
		}
		if(n==2){
			return add(k, multiply(k,k-1));
		}
		if(dp[n] != -1){
			return dp[n];
		}
		dp[n] = add(multiply(solveMemo(n-2,k,dp), k-1), multiply(solveMemo(n-1,k,dp),k-1));
		return dp[n];
	}
	//tabulation
	static int solveTabulation(int n, int k){
		if(n==1){
			return k;
		}
		int[] dp = new int[n+1];
		dp[1] = k;
		dp[2] = add(k, multiply(k,k-1));
		for(int i=3; i<=n; i++){
			dp[i] = add(multiply(dp[i-2], k-1), multiply(dp[i-1], k-1));
		}
		return dp[n];
	}
	//optimization
	static int spaceOptimization(int n, int k){
		if(n==1){
			return k;
		}
		int[] dp = new int[n+1];
		int ptr2 = k;
		int ptr1 = add(k, multiply(k,k-1));
		for(int i=3; i<=n; i++){
			int ans = add(multiply(ptr2, k-1), multiply(ptr1, k-1));
			ptr2 = ptr1;
			ptr1 = ans;
		}
		return ptr1;
	}
}

