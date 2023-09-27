import java.util.ArrayList;

public class Solution {
	ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		ArrayList<Pair<Integer,Integer>> ans = new ArrayList<Pair<Integer, Integer>>();
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr.get(i)+arr.get(j)==target){
					ans.add(new Pair<>(i,j));
				}
			}
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

