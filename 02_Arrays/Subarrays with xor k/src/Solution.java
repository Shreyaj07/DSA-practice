//day 4: subarray with sum k'
//coding ninjas

import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        int[] prefixXor = new int[a.length];
        int xor = 0;
        int count=0;
        for(int i =0;i<a.length; i++){
            xor ^= a[i];
            prefixXor[i] = xor;
            if(xor==b){
                count++;
            }
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<a.length; i++){
            int target = prefixXor[i] ^ b;
            count += hm.getOrDefault(target, 0);
            hm.put(prefixXor[i], hm.getOrDefault(prefixXor[i], 0)+1);
        }
        return count;
    }
}