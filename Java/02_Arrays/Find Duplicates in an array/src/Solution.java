import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,5,6,2,1,5,6};
        System.out.println(Solution.duplicates(arr,arr.length));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        hm.forEach((key,value) -> {
            if(value>1){
                al.add(key);
            }
        });
        Collections.sort(al);
        if(al.isEmpty()){
            al.add(-1);
        }
        return al;
    }
}
