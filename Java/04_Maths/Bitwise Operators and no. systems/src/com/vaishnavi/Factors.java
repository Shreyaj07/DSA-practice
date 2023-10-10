package com.vaishnavi;

public class Factors {
    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factor2(30);
    }
    static void factors(int n){
        for(int i =1; i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void factor2(int n){
        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==n){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i+" "+(n/i) + " ");
                }
            }
        }
    }
}
