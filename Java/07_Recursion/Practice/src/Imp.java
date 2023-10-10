import java.util.ArrayList;

public class Imp {
    public static void main(String[] args) {
        int[] arr  = {1,3,5,6,1,3,2,4,1,1,1};
        System.out.println(Imp.findAllIndex(arr,0,1));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target){
        ArrayList<Integer> al = new ArrayList<>();
        if(index==arr.length){
            return al;
        }
        if(arr[index]==target){
            al.add(index);
        }
        return findAllIndex(arr,index+1,target);
    }
}
