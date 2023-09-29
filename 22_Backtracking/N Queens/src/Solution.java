import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> nQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                board.get(i).add(0); // Initialize the board with 0
            }
        }
        solve(0, ans, board, n);
        return ans;
    }

    public static boolean isSafe(int row, int col, ArrayList<ArrayList<Integer>> board, int n) {
        int x = row;
        int y = col;
        // Check for the same row
        while (y >= 0) {
            if (board.get(x).get(y) == 1) {
                return false;
            }
            y--;
        }

        x = row;
        y = col;
        // Check for diagonals
        while (x >= 0 && y >= 0) {
            if (board.get(x).get(y) == 1) {
                return false;
            }
            x--;
            y--;
        }

        x = row;
        y = col;
        // Check for diagonals
        while (x < n && y >= 0) {
            if (board.get(x).get(y) == 1) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public static void solve(int col, ArrayList<ArrayList<Integer>> ans, ArrayList<ArrayList<Integer>> board, int n) {
        // Base case
        if (col == n) {
            addSolution(ans, board, n);
            return;
        }
        // Solve one case, and the recursion will take care of the rest
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board.get(row).set(col, 1); // Set the value to 1
                solve(col + 1, ans, board, n);
                // Backtrack
                board.get(row).set(col, 0); // Set the value back to 0
            }
        }
    }

    public static void addSolution(ArrayList<ArrayList<Integer>> answer, ArrayList<ArrayList<Integer>> board, int n) {
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                solution.add(board.get(i).get(j));
            }
        }
        answer.add(solution);
    }

    public static void main(String[] args) {
        int n = 4; // Change n to the desired board size
        ArrayList<ArrayList<Integer>> solutions = nQueens(n);
        for (ArrayList<Integer> solution : solutions) {
            for (int col : solution) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
