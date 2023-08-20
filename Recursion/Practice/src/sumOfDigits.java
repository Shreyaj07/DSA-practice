public class sumOfDigits {
    //    1234 => 1 + sumOfDigits(234) => 1 + 2 + sumofDigits(34) => 1 + 2 + 3 + sumOfdigits(4) => 1 + 2 + 3 + 4
    public static void main(String[] args) {
        System.out.println(sumOfDig(1234));
        System.out.println(sumOfDig(123456));
        System.out.println(sumOfDig(356));
        System.out.println(sumOfDig(12));
        System.out.println(sumOfDig(10));
        System.out.println(sum(1234));
        System.out.println(product(123));
        System.out.println(10000);
        fun(5);
    }
    //sum of digits
    public static int sumOfDig(int n){
        if(n/10==0){
            return n;
        }
        return n%10 + sumOfDig((n - n%10)/10);
    }
    public static int sum(int n){
       if(n==0){
           return 0;
       }
       return n%10 + sum(n/10);
    }
    public static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(--n);
//        fun(n--);
    }

}
