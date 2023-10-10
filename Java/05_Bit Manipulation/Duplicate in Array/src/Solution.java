import java.util.ArrayList;

public class Solution {

    public static int findDuplicate(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i =0; i<arr.size(); i++){
            sum ^= arr.get(i);
        }
        for(int i =1; i<arr.size(); i++){
            sum^=i;
        }
        return sum;
    }
}
