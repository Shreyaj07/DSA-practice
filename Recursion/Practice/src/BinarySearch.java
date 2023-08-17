public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 8};
        System.out.println(binarySearch(arr, 7, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);
    }
}
