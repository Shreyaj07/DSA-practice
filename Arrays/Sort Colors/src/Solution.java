class Solution {
    public void sortColors(int[] nums) {
        int num0=0,num1=0,num2=nums.length-1;
        while(num1<=num2){
            if(nums[num1]==0){
                swap(nums,num1,num0);
                num1++;
                num0++;
            }else if(nums[num1]==1){
                num1++;
            }else if(nums[num1]==2){
                swap(nums,num2,num1);
                num2--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}