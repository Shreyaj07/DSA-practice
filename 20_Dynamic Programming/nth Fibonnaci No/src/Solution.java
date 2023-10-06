//https://www.codingninjas.com/studio/problems/nth-fibonacci-number_1115780

import java.util.* ;
import java.io.*; 
public class Solution{
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(34));
    }
    public static int fibonacciNumber(int n){
        int mod = (int) Math.pow(10,9) + 7;
        long prev1 = 1;
        long prev2 = 1;
        for(int i=2; i<n; i++){
            long ans = ((prev1%mod) + (prev2%mod))%mod;
            prev2 = prev1;
            prev1 = ans;
        }
        return (int)prev1;
    }
}