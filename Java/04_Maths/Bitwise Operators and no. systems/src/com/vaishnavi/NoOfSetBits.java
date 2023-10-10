package com.vaishnavi;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n=15;
        int noOfSetBits = 0;
        while(n>0){
            if((n&1)==1){
                noOfSetBits += 1;
            }
            n = n>>1;
        }
        System.out.println(noOfSetBits);

//        another method
        n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    private static int setBits(int n){
        int count = 0;
//        while(n>0){
//            count++;
//            n -= (n&-n);
//        }
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
