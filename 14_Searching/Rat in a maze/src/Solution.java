/**
 *Rate in a maze problem
 https://www.codingninjas.com/studio/problems/rat-in-a-maze_1215030
 */


import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        System.out.println(Solution.findSum(arr,arr.length));
    }
    public static ArrayList < String > findSum(int[][] arr, int n) {
        ArrayList<String> al = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        maze(arr,0,0,al,visited,"");
        return al;
    }
    public static void maze(int[][] arr,int row, int col, ArrayList<String> al, boolean[][] visited, String path){
        if(row<0 || row >=arr.length || col <0 || col>=arr.length || visited[row][col] || arr[row][col]==0){
            return;
        }
        if(row==arr.length-1 && col==arr.length-1){
            al.add(path);
            return;
        }
        visited[row][col] = true;
            maze(arr,row+1,col,al,visited,path+"D");
            maze(arr,row,col-1,al,visited,path+"L");
            maze(arr,row,col+1,al,visited,path+"R");
            maze(arr,row-1,col,al,visited, path+"U");

        visited[row][col] = false;
        return;
    }

    private static boolean check(int row, int col, int[][] arr) {
        return (row>=0 && row<arr.length && col>=0 && col<arr.length);
    }
}