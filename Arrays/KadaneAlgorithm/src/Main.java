public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {5,4,-1,7,8};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = solution.maxSubArray(nums);
        System.out.println("Sum of max. subarray: "+sum);
    }
}