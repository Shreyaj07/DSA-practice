//https://leetcode.com/problems/add-strings/description/
import java.lang.*;
import java.math.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(addStrings("4343","3434"));
        System.out.println(multiply("3","4"));
    }
    public static String addStrings(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        return String.valueOf(b1.add(b2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        return String.valueOf(b1.multiply(b2));
    }
}