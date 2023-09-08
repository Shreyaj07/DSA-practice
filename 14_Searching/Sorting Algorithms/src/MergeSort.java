import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
       int[] arr2 = {5,4,3,2,1};
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int ptr1 = 0,ptr2 = 0, ptr3 = 0;
        while(ptr1 < first.length && ptr2 < second.length){
            if(first[ptr1]>second[ptr2]){
                mix[ptr3] = second[ptr2];
                ptr2++;
            }else{
                mix[ptr3] = first[ptr1];
                ptr1++;
            }
            ptr3++;
        }
        while(ptr1<first.length){
            mix[ptr3] = first[ptr1];
            ptr1++;
            ptr3++;
        }
        while(ptr2<second.length){
            mix[ptr3] = second[ptr2];
            ptr2++;
            ptr3++;
        }
        return mix;
    }

}
