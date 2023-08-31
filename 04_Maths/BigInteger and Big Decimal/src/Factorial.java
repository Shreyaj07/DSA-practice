import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.fact(5000));
        BigDecimalFunc();
    }
    static void BigDecimalFunc(){
        double x = 4.2;
        double y = 3.52;
        double ans = y-x;
        System.out.println(ans);
        BigDecimal b1 = new BigDecimal("4.2");
        BigDecimal b2 = new BigDecimal("3.52");
        BigDecimal ans_new = b2.subtract(b1);
        System.out.println(ans_new);
    }
    static BigInteger fact(int num){
        if(num<1){
            return new BigInteger("1");
        }
        return fact(num-1).multiply(BigInteger.valueOf(num));
    }
}
