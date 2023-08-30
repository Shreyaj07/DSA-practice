import java.util.Arrays;

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
        int n = nums.length;
        for(int i=n/2; i>0; i--){
            h.heapify(nums,n,i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
