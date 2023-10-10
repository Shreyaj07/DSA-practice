import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid = s +(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);
        mergeInPlace(arr, s, mid,e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int ptr1 = s,ptr2 = m, ptr3 = 0;
        while(ptr1 < m && ptr2 < e){
            if(arr[ptr1]>arr[ptr2]){
                mix[ptr3] = arr[ptr2];
                ptr2++;
            }else{
                mix[ptr3] = arr[ptr1];
                ptr1++;
            }
            ptr3++;
        }
        while(ptr1<m){
            mix[ptr3] = arr[ptr1];
            ptr1++;
            ptr3++;
        }
        while(ptr2<e){
            mix[ptr3] = arr[ptr2];
            ptr2++;
            ptr3++;
        }
        for(int l=0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
