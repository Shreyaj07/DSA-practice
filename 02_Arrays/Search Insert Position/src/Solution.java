public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{},10));
        System.out.println(searchInsert(new int[]{10},10));
        System.out.println(searchInsert(new int[]{2,4,5}, 2));
        System.out.println(searchInsert(new int[]{2,3,5},4));
        System.out.println(searchInsert(new int[]{3,4,5,6,6},7));
        System.out.println(binarySearchInsert(new int[]{3,4,5,6,6},7));
        System.out.println(searchInsert(new int[]{2,3,4,6},5));
        System.out.println(binarySearchInsert(new int[]{2,3,4,6},5));
    }
    public static int searchInsert(int [] arr, int m){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == m) {
                return mid; // Element found at index mid
            } else if (arr[mid] < m) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        // Element not found, return the index where it should be inserted
        return start;
    }
    public static int binarySearchInsert(int[] arr, int m) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == m) {
                return mid; // Element found at index mid
            } else if (arr[mid] < m) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        // Element not found, return the index where it should be inserted
        return start;
    }
}