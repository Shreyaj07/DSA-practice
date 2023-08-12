import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n: nums){
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }
        hm.forEach((key,value) -> {
            if(value>nums.length/3){
                list.add(key);
            }
        });
        return list;
    }
}