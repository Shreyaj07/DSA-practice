public class Fibonnaci {
    public static void main(String[] args) {
        for(int i =1; i<=7; i++){
            System.out.print(fibo(i) + " ");
        }
        System.out.println(fibo(50));
    }

    static int fibo(int n){
        //base condition
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}