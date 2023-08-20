public class ReverseOfaNumber {
    public static void main(String[] args) {
        System.out.println(reverse(234));
        System.out.println(reverse(23));
        System.out.println(reverse(3));
        System.out.println(reverse(1234));
    }
    static int reverse(int n){
        if(n<10){
            return n;
        }
        int length = (int) Math.log10(n);
        int div = (int) Math.pow(10,length);
        return reverse(n%div)*10+(n/div);
    }
}
