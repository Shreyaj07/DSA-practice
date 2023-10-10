import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(Solution.multiplyStrings("34232324","100000"));
    }
       public class Solution {
        public static String multiplyStrings(String a, String b) {
            BigInteger b1 = new BigInteger(a);
            BigInteger b2 = new BigInteger(b);
            BigInteger c = b1.multiply(b2);
            return c.toString();
        }

    }
}
