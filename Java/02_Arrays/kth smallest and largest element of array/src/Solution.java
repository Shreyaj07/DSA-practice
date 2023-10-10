import java.util.ArrayList;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(9);
		al.add(5);
		System.out.println(kthSmallLarge(al,al.size(),2));
	}
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
		Integer max = arr.get(k-1);
		Integer min = arr.get(n-k);
		ArrayList<Integer> al = new ArrayList<>(List.of(max,min));
		return al;
	}
}
