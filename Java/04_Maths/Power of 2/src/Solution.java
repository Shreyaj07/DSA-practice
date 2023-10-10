//https://leetcode.com/problems/power-of-two/submissions/
class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.isPowerOfTwo(16));
        System.out.println(Solution.isPowerOfTwo(19));
        System.out.println(Solution.isPowerOfTwo(6));
        System.out.println(Solution.isPowerOfTwo(1));
    }
    public static boolean isPowerOfTwo(int n) {
         double x = Math.log(n) / Math.log(2);
        return Math.abs(x - Math.round(x)) < 1e-10;
    }
}