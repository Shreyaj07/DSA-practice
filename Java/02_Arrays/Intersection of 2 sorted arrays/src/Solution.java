//https://www.codingninjas.com/studio/problems/intersection-of-2-arrays_1082149?leftPanelTab=0

import java.util.* ;
import java.io.*; 

public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++){
			hm.put(arr1.get(i),hm.getOrDefault(arr1.get(i),0)+1);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < m; i++) {
            if (hm.containsKey(arr2.get(i)) && hm.get(arr2.get(i)) > 0) {
                ans.add(arr2.get(i));
                hm.put(arr2.get(i), hm.get(arr2.get(i)) - 1);
            }
        }
		return ans;
	}
}
