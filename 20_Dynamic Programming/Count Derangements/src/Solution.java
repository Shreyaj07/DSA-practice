import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		System.out.println(countDerangements(5));
		System.out.println(tabulation(5));
		System.out.println(dp(5));
	}

	//tabulation
	public static long tabulation(int n){
		long[] dp = new long[n+1];
		dp[1] = 0;
		dp[2] = 1;
		for(int i=3; i<=n; i++){
			dp[i] = (i-1) * (dp[i-2] + dp[i-1]);
		}
		return dp[n];
	}
	//recursive solution
	public static long dp(int n){
		long ptr1 = 0;
		long ptr2 = 1;
		for(int i=3; i<=n; i++){
			long tot = (i-1)*(ptr1 + ptr2)% (long)(Math.pow(10,9)+7);
			ptr1 = ptr2;
			ptr2 = tot;
		}
		return ptr2%(long)(Math.pow(10,9)+7);
	}
	public static long countDerangements(int n) {
		// Write your code here.
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		return (n-1)*(countDerangements(n-2) + countDerangements(n-1));
	}
}