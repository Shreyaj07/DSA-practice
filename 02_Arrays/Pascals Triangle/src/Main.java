import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> ans;
        Solution solution = new Solution();
        ans = solution.generate(10);
        for(List<Integer> row: ans){
            System.out.println(row);
        }
    }
}