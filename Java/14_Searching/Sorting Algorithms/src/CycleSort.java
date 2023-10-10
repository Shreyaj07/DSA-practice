import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 2, 1, 4,0};
//        CycleSort.cycle(arr);
        System.out.println(CycleSort.missingNo(arr));
        int[] arr2= {1,2,3,4,3,2,7,8};
        System.out.println(CycleSort.findDisappearedNo(arr2));
        int[] arr3 = {1,2,2,4,6,5};
        System.out.println(Arrays.toString(CycleSort.setMismatch(arr3)));
    }
   // /find missing no. => nos. from 0 to n
    static int missingNo(int[] arr){
       int i=0;
       while(i<arr.length){
           int correct = arr[i];
           if(arr[i] < arr.length && arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }
       }
       //search for first missing no.
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void cycle(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static List<Integer> findDisappearedNo(int[] arr){
        int i = 0;
        int n = arr.length;

        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //just find missing nos.
        List<Integer> list = new ArrayList<>();
        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    public static int[] setMismatch(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] < arr.length &&  arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            //search for 1st missing no.
            for(int index=0; index<arr.length; index++){
                if(arr[index] != index+1){
                    return new int[]{arr[index],index+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
