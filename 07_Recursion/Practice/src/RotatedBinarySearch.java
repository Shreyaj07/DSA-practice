public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBinarySearch(arr,0,arr.length-1,2));
    }
    public static int rotatedBinarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid; // Element found
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, start, mid - 1, target);
            }
            return rotatedBinarySearch(arr, mid + 1, end, target);
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return rotatedBinarySearch(arr, mid + 1, end, target);
        }
        return rotatedBinarySearch(arr, start, mid - 1, target);
    }
}
