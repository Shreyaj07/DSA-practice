package com.vaishnavi;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(45));
        System.out.println(isPrime(7));
        for(int i=2; i<=45; i++){
            System.out.println(i + " :"+isPrime(i));
        }
    }
    //    n * sqrt(n) => complexity
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
