/**
 * Day 4
 Leetcode: 128. Longest Consecutive Sequence
 */

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int result=1;
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                count+=1;
                if(count>result){
                    result=count;
                }
            }else if(nums[i]==nums[i-1]){
                //do nothing
            }else{
                count=1;
            }
        }
        return result;
    }
}