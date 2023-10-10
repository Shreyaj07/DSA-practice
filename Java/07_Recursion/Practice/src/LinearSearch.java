import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr  = {1,3,5,6,1,3,2,4,1,1,1};
        System.out.println(linearSearch(arr,8,0));
        System.out.println(linearSearch(arr,6,0));
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(findAllIndexes(arr,1,arr.length-1, al));
    }

    static int linearSearch(int[] arr, int target, int index){
        if(target==arr[index]){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return linearSearch(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> al){
        if(index==-1){
            return al;
        }
        if(arr[index]==target){
            al.add(index);
        }
        return findAllIndexes(arr,target,index-1, al);
    }
}
