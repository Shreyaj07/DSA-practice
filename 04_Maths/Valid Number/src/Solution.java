//https://leetcode.com/problems/valid-number/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        String s = "-123.456e789";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
        String regex = "^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}