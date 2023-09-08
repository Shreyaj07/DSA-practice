import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = {3,-23,-3,0,3};
        System.out.println(Arrays.toString(SelectionSort.selection(arr3)));
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] selection(int[] arr){
        for(int i=0; i<arr.length; i++) {
            //find the max item in the rem array and swap w/ correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
            System.out.println("Pass "+(i+1)+": "+Arrays.toString(arr));
        }
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = arr[start];
        int maxIndex = start;
        for(int i=start; i<=last; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
