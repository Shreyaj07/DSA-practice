package com.vaishnavi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is Even: 89 - "+ isOdd(89));
        System.out.println("Is Even: 88 - "+ isOdd(88));
        int[] arr = {1,2,1,2,7,4,2,2,4};
        System.out.println(appearOnce(arr));
        System.out.println("3rd bit of 7: "+ithBitOfANumber(7,3));
        System.out.println("2nd bit of 7: "+ithBitOfANumber(7,2));
        System.out.println("1st bit of 7: "+ithBitOfANumber(7,1));
        System.out.println("Set 2nd bit of 5: "+setithBit(5,2));
        System.out.println("Set 3rd bit of 17: "+setithBit(17,3));
        System.out.println("Set 3rd bit of 17: "+setithBit(7,3));
        System.out.println("No. of digits in 1234: "+noOfDigits(1234));
        System.out.println("No. of digits in 1234: "+noOfDigits(1234567890));
    }
    public static boolean isOdd(int no){
        return (no&1)==1;
    }
    public static int appearOnce(int[] arr){
        int n = arr[0];
        for(int i =1; i<arr.length; i++){
//            n = ~(arr[i] & ~n | ~(arr[i]) & n);
            n = n^arr[i];
        }
        return n;
    }
    public static int ithBitOfANumber(int n, int i){
        return n & (1<<i-1);
    }
    public static int setithBit(int n, int i){
      return n | (1<<i-1) ;
    }
//    find the position of rightmost set bit
    public static int rightMostSetBit(int n){
        return 0;
    }
    public static int noOfDigits(int n){
        return (int)Math.log10(n)+1;
    }
}