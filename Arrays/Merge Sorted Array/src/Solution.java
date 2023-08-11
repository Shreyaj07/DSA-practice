import java.util.Arrays;
// Day 2: leetcode
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        --------------------------------------
//        Shortcut lol
//        int j=0;
//        for(int i =m; i<m+n; i++){
//            nums1[i] = nums2[j];
//            j++;
//        }
//        Arrays.sort(nums1);
//        ----------------------------------------------------
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums1[j];
            k--;
            j--;
        }

    }
}