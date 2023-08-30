import java.util.* ;
import java.io.*;
/*
Build Min heap
Task: convert the i/p array into a min-binary heap
0 - based indexing
* */
public class Solution
{
    public static int[] buildMinHeap(int[] arr)
    {
        int n = arr.length;
        for(int i=n; i>=0; i--){
            heapify(arr, n, i);
        }
        return arr;
    }
    public static void heapify(int[] arr, int n, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left]<arr[smallest]){
            smallest = left;
        }
        if(right < n && arr[right]<arr[smallest]){
            smallest = right;
        }
        if(smallest!=i){
            swap(arr,smallest,i);
            heapify(arr, n, smallest);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

