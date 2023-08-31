package com.vaishnavi;

public class xorFromaTob {
    public static void main(String[] args) {
        //range xor from a,b  = xor(b) ^ xor(a-1)
        int a = 3;
        int b =9;
        int ans   = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }
    static int xor(int  a){
        int result = a % 4;
        switch (result){
            case 0 -> {
                return a;
            }
            case 1 ->{
                return 1;
            }
            case 2 -> {
                return a+1;
            }
        }
        return 0;
    }
}
