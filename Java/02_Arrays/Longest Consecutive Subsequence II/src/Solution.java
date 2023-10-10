import java.util.Arrays;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int longest=1;
        int current=1;
        Arrays.sort(arr);
        for(int i =1; i<N; i++){
            if(arr[i]==arr[i-1]+1){
                current++;
                longest=Math.max(current, longest);
            }else if(arr[i]!=arr[i-1]){
                current = 1;
            }
        }
        return longest;
    }
}