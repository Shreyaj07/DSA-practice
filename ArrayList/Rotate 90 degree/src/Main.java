import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1,2,3)));
        al.add(new ArrayList<>(Arrays.asList(4,5,6)));
        al.add(new ArrayList<>(Arrays.asList(7,8,9)));
        Solution solution = new Solution();
        solution.rotateMatrix(al,al.size(),al.get(0).size());
    }
}