import java.util.Arrays;

/*https://leetcode.com/problems/first-missing-positive/description/*/
class Solution {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,3,6,8,9};
        int[] arr1 = {7,8,9,11,12};
        System.out.println(Solution.firstMissingPositive(arr1));
        System.out.println(Solution.firstMissingPositive(arr));
        int [] arr2 = {1,2,0};
        System.out.println(Solution.firstMissingPositive(arr2));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
//                nums[i]!=nums[correct] => checks duplicates
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(i=0; i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}