package backtracking;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allPaths("",board,0,0);
        allPathsPrint("",board,0,0,new int[3][3],1);
    }
    static void print(boolean[][] maze){
        for(boolean[] m: maze){
            System.out.println(Arrays.toString(m));
        }
    }
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
//            print(maze);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //this block is the path
        maze[r][c] = false;
        if(r<maze.length-1){
            allPaths(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPaths(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPaths(p+"L",maze,r,c-1);
        }

        //here fn gets over
        maze[r][c] = true;
    }
    static void allPathsPrint(String p, boolean[][] maze, int r, int c,int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            System.out.println(p);
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("=====================");
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //this block is the path
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1){
            allPathsPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathsPrint(p+"L",maze,r,c-1,path,step+1);
        }
        //here fn gets over
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
