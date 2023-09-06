import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=1; j<=n-1; j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println("Pass "+(i+1)+": "+ Arrays.toString(arr));
        }
        return arr;
    }

     private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
     }
 }