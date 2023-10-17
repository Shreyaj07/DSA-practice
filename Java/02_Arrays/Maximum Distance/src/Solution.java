import java.util.* ;
import java.io.*; 
public class Solution {
    public static int maximumDistance(int[] arr) {
        // Write your code here.
        int distance = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    distance = Math.max(distance, j-i);
                }
            }
        }
        return distance;
    }
}
