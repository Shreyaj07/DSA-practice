package com.vaishnavi;

import java.util.Arrays;

public class xorFrom0Toa {
    public static void main(String[] args) {
        int a = 45;
        int[] arr = new int[a+1];
        for(int i =1; i<=a; i++){
            int result = i%4;
            switch (result) {
                case 0 -> arr[i] = i;
                case 1 -> arr[i] = 1;
                case 2 -> arr[i] = i + 1;
                case 3 -> arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
