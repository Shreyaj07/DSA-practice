import java.util.*;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int num = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = hm.getOrDefault(arr.get(i), 0) + 1;
            hm.put(arr.get(i), count);
            if (count > arr.size() / 3) {
                num = arr.get(i);
                if (!hs.contains(num)) {
                    al.add(num);
                    hs.add(num);
                }
            }
        }

        return al;
    }
}