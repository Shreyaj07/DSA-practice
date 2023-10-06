import java.util.* ;
import java.io.*; 

public class Solution{
    public static void main(String[] args) {

    }
    //recursive
    static int solve(int[] weight, int[] value, int index, int W){
        //base case
        //if only 1 item is present, just cmp it's wt. with the knapsack cpty
        if(index==0){
            if(weight[0] <=W){
                return value[0];
            }else{
                return 0;
            }
        }
        int include=0, exclude;
        if(weight[index]<=W){
            include = value[index] + solve(weight, value, index-1, W - weight[index]);
        }
        exclude = solve(weight, value, index-1, W);
        return Math.max(include, exclude);

    }
    //memoization
    static int solveMemo(int[] weight, int[] value, int index, int W){
        int[] dp = new int[weight.length+1];

    }
    static int solveMemo(int[] weight, int[] value, int index, int W, int[] dp){
        //base case
        //if only 1 item is present, just cmp it's wt. with the knapsack cpty
        if(index==0){
            if(weight[0] <=W){
                return value[0];
            }else{
                return 0;
            }
        }
        int include=0, exclude;
        if(weight[index]<=W){
            include = value[index] + solve(weight, value, index-1, W - weight[index]);
        }
        exclude = solve(weight, value, index-1, W);
        return Math.max(include, exclude);

    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        
    }
}