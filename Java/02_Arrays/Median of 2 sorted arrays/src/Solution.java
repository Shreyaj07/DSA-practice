class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int ptr1=0;
        int ptr2=0;
        int ptr3=0;
        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<nums2[ptr2]){
                nums[ptr3] = nums1[ptr1];
                ptr1++;
            }else{
                nums[ptr3] = nums2[ptr2];
                ptr2++;
            }
            ptr3++;
        }
        while(ptr1<m){
            nums[ptr3] = nums1[ptr1];
            ptr1++;
            ptr3++;
        }
        while(ptr2<n){
            nums[ptr3] = nums2[ptr2];
            ptr2++;
            ptr3++;
        }
        double median=0;
        if((m+n)%2==0){
            median = (nums[(m+n)/2-1] + nums[(m+n)/2])/2.0;
        }else{
            median = nums[(m+n-1)/2];
        }
        return median;
    }
}