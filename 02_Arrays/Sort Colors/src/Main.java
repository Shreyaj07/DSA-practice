import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = {2,0,1};
        solution.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}