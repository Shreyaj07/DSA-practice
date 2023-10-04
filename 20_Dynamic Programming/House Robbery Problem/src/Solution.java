//https://www.codingninjas.com/studio/problems/house-robber_839733

public class Solution {
	public static long houseRobber(int[] valueInHouse) {
		// Write your code here.	
		int n = valueInHouse.length;
		if(n==0){
			return 0;
		}
		if(n==1){
			return valueInHouse[0];
		}
		int[] dp = new int[n];
		dp[0]= 0;
		dp[1] = Math.max(valueInHouse[0],valueInHouse[1]);
		for(int i=2; i<n; i++){
			int incl = dp[i-2] + valueInHouse[i];
			int excl = dp[i-1];
			dp[i] = Math.max(incl, excl);
		}
		return dp[n-1];
	}	
}