//704. binary search
// https://leetcode.com/problems/binary-search/description/

class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int index = Solution.search(nums,target);
        System.out.println(index);
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums,start,end,target);
    }
    public static int binarySearch(int[] nums, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return binarySearch(nums,mid+1,end,target);
        }else{
            return binarySearch(nums,start,mid-1,target);
        }
    }
}