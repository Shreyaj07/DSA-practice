import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 1},
        };
        System.out.println(findSum(arr, arr.length));
    }

    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList<String> al = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        maze(arr, 0, 0, n, al, "", visited);
        return al;
    }

    public static void maze(int[][] arr, int row, int col, int n, ArrayList<String> al, String path, boolean[][] visited) {
        //out of array
        if (row < 0 || row >= n || col < 0 || col >= n || visited[row][col] || arr[row][col] == 0) {
            return;
        }
        //at the destination
        if (row == n - 1 && col == n - 1) {
            al.add(path);
            return;
        }
        //mark the row as visited
        visited[row][col] = true;
        //move down
        maze(arr, row + 1, col, n, al, path + "D", visited);
        //move left
        maze(arr, row, col - 1, n, al, path + "L", visited);
        //move right
        maze(arr, row, col + 1, n, al, path + "R", visited);
        //move up
        maze(arr, row - 1, col, n, al, path + "U", visited);
        //mark the row as unvisited
        visited[row][col] = false;
        return;
    }
}