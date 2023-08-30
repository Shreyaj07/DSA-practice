import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(345969);
        BigInteger C = new BigInteger("2324354332435");
        System.out.println(C);
        int e = B.intValue(); //convert big integer to int
        System.out.println("e: "+e);
        //constants
        BigInteger D = BigInteger.ONE;
        System.out.println(D);
        //addition
        BigInteger s = A.add(B);
        System.out.println(s);
        BigInteger m = C.multiply(s);
        System.out.println("m: "+m);
        //compare
        BigInteger num1 = BigInteger.valueOf(1);
        BigInteger num2 = BigInteger.valueOf(2);
        System.out.println(num1.compareTo(num2));
        System.out.println(num1.compareTo(num1));
        System.out.println(num2.compareTo(num1));
    }
}