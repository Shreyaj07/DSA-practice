import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();
        h.delete();
        System.out.println();
        h.print();
        //heap creation
        int[] arr = {-1,54,53,55,52,50};
        for(int i=(arr.length/2)-1; i>0; i--){
            h.heapify(arr,arr.length-1,i);
        }
        System.out.println();
        //heapsort
        h.heapSort(arr,arr.length-1);
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //using priority queue
        System.out.println("\nUsing priority queue - Min heap");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(2);
        pq.offer(5);
        pq.offer(3);
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        System.out.println("\nPriority Queue - Max Heap");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(3);
        maxHeap.offer(5);
        maxHeap.offer(2);
        maxHeap.offer(1);
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll() + " ");
        }
    }
}