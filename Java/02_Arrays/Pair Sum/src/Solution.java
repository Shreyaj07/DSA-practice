//https://www.codingninjas.com/studio/problems/pair-sum_1171154?leftPanelTab=0&count=25&page=3&search=&sort_entity=order&sort_order=ASC

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int count =0;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count>0? count : -1;
    }
}