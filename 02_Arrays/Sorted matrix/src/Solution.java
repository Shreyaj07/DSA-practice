import java.util.Arrays;

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] arr  = new int[N*N];
        int k =0;
        for(int i =0; i<N; i++){
            for(int j=0; j<N;j++){
                arr[k++] = Mat[i][j];
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i =0; i<N; i++){
            for(int j=0; j<N; j++){
                Mat[i][j] = arr[k++];
            }
        }
        return Mat;
    }
    public void display(int[][] arr){
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}