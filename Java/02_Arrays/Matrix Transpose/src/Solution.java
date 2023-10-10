import java.util.Arrays;

class Solution {
    public void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    public void display(int[][] arr){
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}