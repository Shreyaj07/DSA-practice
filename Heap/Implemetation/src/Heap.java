public class Heap {
    int[] arr;
    int size;
    Heap(){
        arr = new int[100];
        size=0;
        arr[0] = -1;
    }
    void insert(int val){
        //time complexity - o(logn)
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
     void delete(){
        if(size==0){
            System.out.println("Nothing to delete");
            return;
        }
        arr[1] = arr[size];
        size--;
        int index = 1;
        while(index<size){
           if(arr[2*index] > arr[index] && 2*index<size){
               swap(arr,2*index,index);
               index = 2*index;
           }else if(arr[2*index+1] > arr[index] && 2*index+1<size){
               swap(arr,2*index+1,index);
               index = 2*index+1;
           }else{
               return;
           }
        }
    }
    void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = left+1;
        if(left < n&& arr[largest]<arr[left]){
            largest = left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest = right;
        }
        if(largest!=i){
            swap(arr,largest,i);
            heapify(arr,n,largest);
        }
    }
    void print(){
        for(int i =1; i<=size; i++){
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
