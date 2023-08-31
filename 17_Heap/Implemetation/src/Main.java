import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    //max heap implementation using arrays
    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();
        System.out.println("Deleting");
        h.delete();
        h.print();
        System.out.println("Inserting 51");
        h.insert(51);
        h.print();
        System.out.println("Deleting...");
        h.delete();
        h.print();
        System.out.println("Heapify on new heap");
        int[] nums = {-1,54,53,55,52,50};
        System.out.println(Arrays.toString(nums));
        //heap creation
        int n = nums.length;
        for(int i=n/2; i>0; i--){
            h.heapify(nums,n,i);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Heap sort");
        int[] nums2 = {-1,7,6,5,4,3,0,9};
        h.heapSort(nums2,nums2.length-1);
        System.out.println(Arrays.toString(nums2));
        System.out.println("Using priority queue");
        //Implementing min and maxheap using priority queue
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(2);
        pq.offer(5);
        pq.offer(3);
        pq.offer(1);
        pq.offer(7);
        pq.offer(8);
        System.out.println("Element at top: "+pq.peek());
        while (!pq.isEmpty()){
            System.out.println(pq);
            pq.remove();
        }

        //max heap
        System.out.println("Max heap using priority queue");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.offer(3);
        pq2.offer(4);
        pq2.offer(2);
        pq2.offer(8);
        System.out.println(pq2);
        while(!pq2.isEmpty()){
            System.out.println(pq2);
            pq2.remove();
        }
    }
}
