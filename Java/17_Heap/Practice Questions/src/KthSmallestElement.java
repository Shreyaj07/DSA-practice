import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    /*
    kth smallest element
    arr = {7,10,4,3,20,13}
    k = 3 => 7
    * */
    public static void main(String[] args) {
        int[] nums = {7,10,4,20,15};
        System.out.println(kthSmallest(nums,0,nums.length-1,3));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        int index = k;
        while(index<=r){
            if(arr[index]<pq.peek()){
                pq.remove();
                pq.add(arr[index]);
            }
            index++;
        }
        System.out.println(pq);
        return pq.peek();
    }
}
