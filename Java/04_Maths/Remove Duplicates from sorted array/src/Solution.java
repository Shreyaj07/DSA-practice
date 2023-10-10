import java.util.HashSet;

class Solution {
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int i =0;
        int k = 0;
        while(i<nums.length){
            if(hs.contains(nums[i])){
                i++;
            }else{
                hs.add(nums[i]);
                swap(nums,i,k);
                k++;
                i++;
            }
        }
        return hs.size();
    }
}