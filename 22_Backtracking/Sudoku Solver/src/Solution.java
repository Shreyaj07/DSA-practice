import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[][] sudoku = {
				{3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0},
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0}
		};
		solveSudoku(sudoku);
		printSudoku(sudoku);
	}

	public static void solveSudoku(int[][] sudoku) {
		solve(0, 0, sudoku);
	}

	private static boolean solve(int row, int col, int[][] sudoku) {
		if (row == 9) {
			return true; // Successfully solved the entire puzzle
		}

		if (col == 9) {
			return solve(row + 1, 0, sudoku); // Move to the next row
		}

		if (sudoku[row][col] != 0) {
			return solve(row, col + 1, sudoku); // Skip cells with fixed numbers
		}

		for (int number = 1; number <= 9; number++) {
			if (isSafe(row, col, number, sudoku)) {
				sudoku[row][col] = number;
				if (solve(row, col + 1, sudoku)) {
					return true;
				}
				sudoku[row][col] = 0; // Backtrack
			}
		}

		return false; // No valid number found
	}

	private static boolean isSafe(int row, int col, int number, int[][] sudoku) {
		// Check row and column
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == number || sudoku[i][col] == number) {
				return false;
			}
		}

		// Check 3x3 grid
		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (sudoku[i][j] == number) {
					return false;
				}
			}
		}

		return true;
	}

	private static void printSudoku(int[][] sudoku) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
}
