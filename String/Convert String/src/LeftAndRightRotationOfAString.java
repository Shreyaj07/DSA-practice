public class LeftAndRightRotationOfAString {
    public static void main(String[] args) {
        System.out.println(Solution.rightRotate("abcd",4));
        System.out.println(Solution.leftRotate("abcd",2));
    }
    public class Solution {
        public static String leftRotate(String str, int d) {
            int n = str.length();
            d %= n;
            return str.substring(d)+str.substring(0,d);
        }

        public static String rightRotate(String str, int d) {
            int n = str.length();
            d %= n;
            return str.substring(n-d)+str.substring(0,n-d);
        }
    }
}
