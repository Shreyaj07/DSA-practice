//Day 2: Leetcode Question no.: 4
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        Solution solution = new Solution();
        int ans = solution.findDuplicate(nums);
        System.out.println("Duplicate in the array "+ Arrays.toString(nums)+" is: "+ans);
    }
}