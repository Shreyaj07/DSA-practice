public class NoOfZeroes {
    public static void main(String[] args) {
        System.out.println(noOfZeroes(100320));
        System.out.println(zeroDigit(2009200420));
    }
    public static int noOfZeroes(int n){
        if(n<10){
            if(n==0){
                return 1;
            }
            return 0;
        }
        int iszero = (n%10==0)?1:0;
        return noOfZeroes(n/10)+(iszero);
    }
    public static int zeroDigit(int n){
        return zero(n,0);
    }
    public static int zero(int n, int count){
        if(n<10){
            if(n==0){
                count+=1;
            }
            return count;
        }
        boolean iszero = n%10==0;
        if(iszero){
            return zero(n/10, count+1);
        }
        return zero(n/10,count);
    }
}
