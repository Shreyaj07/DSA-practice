import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {

	}
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<n; i++){
			hs.add(arr1.get(i));
		}
		int intersection =0;
		for(int i=0; i<m; i++){
			if(hs.contains(arr2.get(i))){
				intersection++;
			}
		}
		for(int i=0; i<m; i++){
			hs.add(arr2.get(i));
		}
		int union = hs.size();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(intersection);
		al.add(union);
		return al;
	}
}