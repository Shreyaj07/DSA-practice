//https://www.codingninjas.com/studio/problems/house-robber_839733
public class Solution {
	public static long houseRobber(int[] money) {
		int houses = money.length;
		if(houses==1){
			return money[0];
		}
		long prev2 = 0;
		long prev1 = money[0];
		long case1; 
		long case2;
        for(int i=1; i<houses-1; i++){
            long incl = prev2 + money[i];
            long excl = prev1;
            long tot = Math.max(incl, excl);
            prev2 = prev1;
            prev1 = tot;
        }
        case1 = prev1;
        //reinitialize
        prev1 = money[1];
        prev2 = 0;
        for(int i=2; i<houses; i++){
            long incl = prev2 + money[i];
            long excl = prev1;
            long tot = Math.max(incl,excl);
            prev2 = prev1;
            prev1 = tot;
        }
        case2 = prev1;
        return Math.max(case1, case2);
	}	
}