import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 31 - Leetcode

class Solution {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});
    }
    public static void nextPermutation(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int n: nums){
            sb.append(n);
        }
        int original = Integer.parseInt(sb.toString());
        System.out.println(original);
        ArrayList<Integer> al = perm("",sb.toString());
        Collections.sort(al);
        System.out.println(al);
        int nextPerm = -1;
        int currIndex = -1;
        for(int i =0; i<al.size(); i++){
            if(al.get(i)==original){
                currIndex = i;
            }
        }
        nextPerm = al.get((currIndex+1)%al.size());
        for(int i = nums.length-1; i>=0; i--){
            nums[i] = nextPerm%10;
            nextPerm/=10;
        }
        System.out.println(Arrays.toString(nums));

    }
    public static ArrayList<Integer> perm(String p, String up){
        ArrayList<Integer> al = new ArrayList<>();
        if(up.isEmpty()){
            al.add(Integer.valueOf(p));
            return al;
        }
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            al.addAll(perm(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
        }
        return al;
    }
}