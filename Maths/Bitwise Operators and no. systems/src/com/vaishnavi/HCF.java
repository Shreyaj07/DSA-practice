package com.vaishnavi;

public class HCF {
    public static void main(String[] args) {
        System.out.println(gcd(3,6));
        System.out.println(gcd(1,7));
        System.out.println(gcd(6,6));
        System.out.println(gcd(7,1));
        System.out.println(lcm(7,1));
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}