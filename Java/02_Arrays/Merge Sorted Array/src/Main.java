import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};
       Solution solution = new Solution();
       System.out.println("Merging "+ Arrays.toString(nums1) + " and "+Arrays.toString(nums2) + " gives: ");
       solution.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}