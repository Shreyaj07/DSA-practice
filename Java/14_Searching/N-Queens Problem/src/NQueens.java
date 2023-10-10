import java.util.ArrayList;
import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nQueens(n);
    }
    public static void nQueens(int n){
        int[][] board = new int[n][n];
        if(placedQueens(board,0,n)){
            printBoard(board);
        }else{
            System.out.println("No solution exists.");
        }
    }

    private static void printBoard(int[][] board) {
        int n = board.length;
        for (int[] ints : board) {
            for (int j = 0; j < n; j++) {
                if (ints[j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    private static boolean placedQueens(int[][] board, int col, int n) {
        if(col>=n){
            return true; //all queens successfully placed
        }
        for(int row=0; row<n; row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 1; //place a queen
                //recursively try placing queens in next cols
                if(placedQueens(board,col+1,n)){
                    return true;
                }
                board[row][col] = 0; //backtrack if no soln found
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        //check left side of current row
        for(int i=0; i<col; i++){
            if(board[row][i] == 1){
                return false;
            }
        }
        //check upper diagonal on the left side
        for(int i=row, j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //check lower diagonal on the left side
        for(int i=row,j=col; i<n && j>=0; i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
        //if no  conflicts found
    }
}
