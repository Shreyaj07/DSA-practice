import java.util.* ;
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        int sum = 0;
        for(int i=0; i<n; i++){
            if(hs.contains(arr.get(i))){
                ans[1] = arr.get(i);
            }else {
                hs.add(arr.get(i));
                sum+=arr.get(i);
            }
        }
        ans[0] = (n*(n+1)/2)-sum;
        return ans;
    }
}