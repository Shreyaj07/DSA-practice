package com.vaishnavi;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        for(int[] row: image){
            for(int i =0; i<(row.length+1)/2; i++){
                int temp = row[i]^1;
                row[i] = row[row.length-i-1]^1;
                row[row.length-i-1] = temp;
            }
        }
        for(int[] i: image){
            System.out.println(Arrays.toString(i));
        }
    }
}
