import java.util.* ;
import java.io.*;
public class Solution {

    public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {
        for(int i =0; i<k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n;j++){
                if(arr.get(j)>max){
                    max = arr.get(j);
                }
            }
            for(int l=0;l<n; l++){
                arr.set(l,Math.abs(arr.get(l) - max));
            }
            System.out.println(arr);
        }
        return arr;
    }
}