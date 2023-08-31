class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxOnes=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==0){
                count=0;
            }else if(nums[i]==1){
                count++;
                maxOnes = Math.max(maxOnes,count);
            }
        }
        return maxOnes;
    }
}