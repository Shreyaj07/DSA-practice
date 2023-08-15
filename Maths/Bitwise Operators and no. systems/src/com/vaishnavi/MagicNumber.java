package com.vaishnavi;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 1; //magic no. I have to find
        int ans = 0;
        int base = 2;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans+=last*base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
