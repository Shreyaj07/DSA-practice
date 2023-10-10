import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 0, 6));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        int n = matrix.size(); // Number of rows
        int m = matrix.get(0).size(); // Number of columns
        ArrayList<ArrayList<Integer>> result = solution.zeroMatrix(matrix,n,m);

        // Print the resulting matrix
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}