public class Heap {
    int[] arr;
    int size;
    Heap(){
        arr = new int[100];
        size=0;
        arr[0] = -1;
    }
    void insert(int val){
        size+=1;
        int index = size;
        arr[index] = val;

        while(index>1){
            int parent = index/2;
            if(arr[parent]<arr[index]){
                swap(arr,parent,index);
                index = parent;
            }else{
                return;
            }
        }
    }
    void print(){
        for(int i =0; i<=size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static void swap(int[] arr, int parent, int child) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }
}
