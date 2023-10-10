import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static int subArrayCount(ArrayList < Integer > arr, int k) {
        int count = 0;
        int length = arr.size();
        int tempSum = 0;
        int[] sum = new int[length];
        for(int i =0; i<length;i++){
            tempSum+=arr.get(i);
            if(tempSum%k==0){
                count++;
            }
            sum[i]=tempSum;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<arr.size(); i++){
            int target = (sum[i] % k + k) % k;
            count+=hm.getOrDefault(target, 0);
            hm.put(target,hm.getOrDefault(target,0)+1);
        }
        return count;
    }

}