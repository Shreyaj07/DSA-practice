import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		for(int i=0; i<=n; i++){
			dp[i] = -1;
		}
		System.out.println(fib(n,dp));
		System.out.println(fibonnaci(n,dp));
		System.out.println(fibo(n));
	}
	//using top down approach
	private static int fib(int n, int[] dp) {
		if(n<=1){
			return n;
		}
		if(dp[n]!=-1){
			return dp[n];
		}
		dp[n] = fib(n-1,dp) + fib(n-2,dp);
		return dp[n];
	}
	//using bottom up -> tabulation
	private static int fibonnaci(int n, int[] dp){
		if(n<=1){
			dp[n] = n;
			return dp[n];
		}
		dp[n] = dp[n-1] + dp[n-2];
		return dp[n];
	}
	//using space optimization
	private static int fibo(int n){
		int prev1 = 1;
		int prev2 = 1;
		for(int i=2; i<n;i++){
			int curr = prev1 + prev2;
			prev1 = prev2;
			prev2 = curr;
		}
		return prev2;
	}
}
