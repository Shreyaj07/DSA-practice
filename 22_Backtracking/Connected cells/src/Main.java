/*
Find the length of the connected cells of 1s(region)
in a matrix of 0s and 1s
given a matrix, each of which may be 1 or 0. The
filled cells that are connected form a region. .2 cells
are said to be connected if they are adjacent to each other
horizontally, vertically or diagonally. 
There may be several regions in the matrix. Find the
largest region in the matrix.
* */

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0,0},
                {0,1,1,0,0},
                {0,0,1,0,1},
                {1,0,0,0,1},
                {0,1,0,1,1}
        };
        System.out.println(getMaxOnes(arr,arr.length, arr[0].length));
    }

    static int getVal(int[][] arr, int i, int j, int L, int H){
        if(i<0 || i >= L || j<0 || j>=H){
            return 0;
        }
        return arr[i][j];
    }

    static void findMaxBlock(int[][] arr, int r, int c, int L, int H, int size, boolean[][] cntarr, int[] maxSize){
        if(r<0 || r>=L || c<0 || c>=H){
            return;
        }
        cntarr[r][c] = true;
        size++;
        if(size > maxSize[0]){
            maxSize[0] = size;
        }
        //search in 8 directions
        int[][] direction = {{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};
        for(int i=0; i<8; i++){
            int newi = r + direction[i][0];
            int newj = c + direction[i][1];
            int val = getVal(arr, newi, newj, L, H);
            if(val > 0 && !cntarr[newi][newj]){
                findMaxBlock(arr, newi, newj, L, H, size, cntarr, maxSize);
            }
        }
        cntarr[r][c] = false;
    }

    static int getMaxOnes(int[][] arr, int rmax, int colmax){
        int[] maxSize = {0};
        int size = 0;
        boolean[][] cntArr = new boolean[rmax][colmax];
        for(int i=0; i<rmax; i++){
            for(int j=0; j<colmax; j++){
                if(arr[i][j] == 1){
                    findMaxBlock(arr, i, j, rmax, colmax, 0, cntArr, maxSize);
                }
            }
        }
        return maxSize[0];
    }
}
