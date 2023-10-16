//https://www.codingninjas.com/studio/problems/sort-integers-by-factor-value_1281384?leftPanelTab=0&count=25&page=2&search=&sort_entity=order&sort_order=ASC

import java.util.* ;
import java.io.*;

/*
x -> even -> x/2
x -> odd ->3x + 1
* */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findKthElement(arr,4,4));
    }
    public static Integer findKthElement(int arr[], int n, int k) {
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }

        Arrays.sort(result, (a, b) -> {
            int factorValueA = calculateFactorValue(a);
            int factorValueB = calculateFactorValue(b);
            if (factorValueA != factorValueB) {
                return Integer.compare(factorValueA, factorValueB);
            } else {
                return Integer.compare(a, b);
            }
        });

        return result[k-1];
    }

    private static int calculateFactorValue(int i) {
        int factorValue = 0;
        if(i==1){
            return factorValue;
        }
        while(i!=1){
            if(i%2==0){
                i = i/2;
            }else{
                i = i * 3 + 1;
            }
            factorValue ++;
        }
        return factorValue;
    }
}