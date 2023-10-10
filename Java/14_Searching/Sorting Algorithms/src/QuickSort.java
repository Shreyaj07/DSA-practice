import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickSort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e= high;
        int mid = s+(e-s)/2;
        int pivot = nums[mid];
        while(s<=e){
            //also a reason why if it's already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(nums,s,e);
                s++;
                e--;
            }
        }
        //now my pivot is at correct index, pls sort 2 halves now
        quickSort(nums,low,e);
        quickSort(nums,s,high);
    }
}
