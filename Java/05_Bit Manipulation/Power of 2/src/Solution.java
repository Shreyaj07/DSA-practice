//https://www.codingninjas.com/studio/problems/power-of-two_893061?leftPanelTab=0&count=25&page=1&search=&sort_entity=order&sort_order=ASC
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(10));
    }

    public static boolean isPowerOfTwo(int n) {
        // Write your code here.
        String s = Integer.toBinaryString(n);
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;

    }
}

