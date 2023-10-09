import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        System.out.println(powerOfPower(2,3,4,2));
    }
    public static int powerOfPower(int A, int B, int C, int M) {
        int modC = modExp(B, C, M - 1);
        int result = modExp(A, modC, M);
        return result;
    }
     private static int modExp(int base, int exp, int mod) {
        if (mod == 1) return 0; // If mod is 1, the result is always 0
        
        long result = 1L; // Use long to avoid overflow
        long baseLong = base % mod;
        
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * baseLong) % mod;
            }
            baseLong = (baseLong * baseLong) % mod;
            exp /= 2;
        }
        
        return (int) result;
    }
}