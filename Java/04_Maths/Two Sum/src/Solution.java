import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(List.of(2,7,11,13));
		ArrayList<Pair<Integer, Integer>> ans  =twoSum(al,9,al.size());
		for (Pair<Integer, Integer> an : ans) {
			System.out.println(an.firstNumber + " " + an.secondNumber);
		}
	}
	static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();
		HashSet<Pair<Integer, Integer>> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr.get(i) + arr.get(j) == target) {
					Pair<Integer, Integer> p = new Pair<>(arr.get(i),arr.get(j));
					if(!hs.contains(p)){
						ans.add(p);
					}
					hs.add(p);
				}
			}
		}
		if(hs.size()==0){
			Pair<Integer, Integer> p = new Pair<>(-1,-1);
			ans.add(p);
		}
		return ans;
	}
}
class Pair<U,V>{
	U firstNumber;
	V secondNumber;
	Pair(U firstNumber, V secondNuber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNuber;
	}
}

