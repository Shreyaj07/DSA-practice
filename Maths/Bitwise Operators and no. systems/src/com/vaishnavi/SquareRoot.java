package com.vaishnavi;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(perfectSqrt(n));
        System.out.println(sqrt(40,3));
    }
    //binary search sqrt
    static double sqrt(int n, int precision){
        int start =0;
        int end = n;
        double root = 0.0;
        while(start<=end){
            int m = start+(end-start)/2;
            if(m*m==n){
               return m;
            }
            if(m*m > n){
                end = m-1;
            }else{
                start = m+1;
            }
        }
        root = end;
        double incr = 0.1;
        for(int i =0; i<precision; i++){
            if(root*root <=n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
    static int perfectSqrt(int n){
        for(int i =0; i<=n/2; i++){
            if(i*i==n){
                return i;
            }
        }
        return 0;
    }
}
