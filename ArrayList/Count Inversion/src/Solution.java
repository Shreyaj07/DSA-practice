import java.util.* ;
import java.io.*;
public class Solution {
    public static long getInversions(long arr[], int n) {
        int inversion = 0;
        for(int i =0; i<n; i++){
            for(int j=0;j<n; j++){
                if(i<j&&arr[i]>arr[j]){
                    inversion++;
                }
            }
        }
        return inversion;
    }
}