import java.util.Arrays;

public class Heap {
    int[] arr;
    int size = 0;
    Heap(){
        arr = new int[100];
    }
    void insert(int val){
        size++;
        int index = size;
        arr[index] = val;

        while(index > 1){
            int parent = index/2;
            if(arr[parent] < arr[index]){
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
        //step1: put last element into first index
        arr[1] = arr[size];
        //step2: decrement the size of heap (remove node)
        size--;
        //step3: move root node to its correct position
        int i=1;
        while(i<size){
            int leftIndex = 2*i;
            int rightIndex = leftIndex+1;
            if(leftIndex<size && arr[i]<arr[leftIndex]){
                swap(arr,leftIndex,i);
                i = leftIndex;
            }else if(rightIndex<size && arr[i] < arr[rightIndex]){
                swap(arr,rightIndex,i);
                i = rightIndex;
            }else{
                return;
            }
        }
    }
    void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = left+1;
        if(left<=n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right<=n &&  arr[largest] < arr[right]){
            largest = right;
        }
        if(largest!=i){
            swap(arr,largest,i);
            heapify(arr,n,largest);
        }
    }
    void heapSort(int[] arr, int n){
        int t= n;
        while(t>1){
            //step1 : swap
            swap(arr,t,1);
            t--;
            //step2:
            heapify(arr,t,1);
        }
    }
    void print(){
        for(int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    private void swap(int[] arr, int parent, int index) {
        int temp = arr[parent];
        arr[parent] = arr[index];
        arr[index] = temp;
    }
}
