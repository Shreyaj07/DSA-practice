import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Merge2BinaryMaxHeaps {
    public static void main(String[] args) {
        int[] a = {10,5,6,2};
        int[] b = {12, 7, 9};
        System.out.println(Arrays.toString(Merge2BinaryMaxHeaps.mergeHeaps(a, b, a.length, b.length)));
    }
    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: a){
            pq.add(i);
        }
        for(int i: b){
            pq.add(i);
        }
        int[] arr = new int[m+n];
        for(int i=0; i<m+n; i++){
            arr[i] = pq.remove();
        }
        return arr;
    }
}
