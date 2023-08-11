import java.util.*;
// Problem 56: Merge Intervals
//Day 2: Leetcode
class Leetcode {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,Comparator.comparingInt(a -> a[0]));
        int l=arr[0][0];
        int r=arr[0][1];
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i =1; i<arr.length; i++){
            int left = arr[i][0];
            int right = arr[i][1];
            if(left>=l && left <=r){
                r = Math.max(r,right);
            }else{
                al.add(new ArrayList<>(Arrays.asList(l,r)));
                l = left;
                r = right;
            }
        }
        al.add(new ArrayList<>(Arrays.asList(l,r)));
        int[][] ans = new int[al.size()][2];
        for(int i =0; i<al.size(); i++){
            ans[i][0] = al.get(i).get(0);
            ans[i][1] = al.get(i).get(1);
        }
        return ans;
    }
}