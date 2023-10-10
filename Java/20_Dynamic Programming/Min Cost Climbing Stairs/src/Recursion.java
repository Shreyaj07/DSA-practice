public class Recursion {
    //using recursion
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
        int[] cost2 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost2));
    }
    public static int minCostClimbingStairs(int[] cost) {
           int n = cost.length;
        return Math.min(solve(cost,n-1),solve(cost,n-2));
    }

    private static int solve(int[] cost, int i) {
        if(i==0 || i==1){
            return cost[i];
        }
        return Math.min(solve(cost,i-1),solve(cost,i-2))+cost[i];
    }
}