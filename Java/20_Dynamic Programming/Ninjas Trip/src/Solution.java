
public class Solution {
	public static int minimumCoins(int n, int[] days, int[] cost) {
		return solve(n, days, cost, 0);
	}

	private static int solve(int n, int[] days, int[] cost, int index) {
		//base case
		if(index>=n){
			return 0;
		}
		//1 day pass
		int option1 = cost[0] + solve(n,days,cost,index+1);
		//7 day pass
		int i;
		for(i=index; i<n && days[i] <days[index] + 7; i++){

		}
		int option2 = cost[1] + solve(n, days, cost, i);
		//30 days pass
		for(i=index; i<n && days[i] <days[index] + 30; i++){

		}
		int option3 = cost[2] + solve(n, days, cost, i);
		return Math.min(Math.min(option1, option2), option3);
	}
	private static int solveMemo(int n, int[] days, int[] cost, int index, int[] memo) {
		// Base case
		if (index >= n) {
			return 0;
		}

		if (memo[index] != -1) {
			return memo[index];
		}

		// 1 day pass
		int option1 = cost[0] + solveMemo(n, days, cost, index + 1, memo);

		// 7 day pass
		int i = index;
		while (i < n && days[i] < days[index] + 7) {
			i++;
		}
		int option2 = cost[1] + solveMemo(n, days, cost, i, memo);

		// 30 day pass
		while (i < n && days[i] < days[index] + 30) {
			i++;
		}
		int option3 = cost[2] + solveMemo(n, days, cost, i, memo);

		memo[index] = Math.min(option1, Math.min(option2, option3));
		return memo[index];
	}

}
