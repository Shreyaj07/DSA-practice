import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int row = solution.rowWithMax1s(arr,arr.length, arr[0].length);
        System.out.println("For matrix: ");
        for(int[] r: arr){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("The row with max. no. of 1s: "+row);
    }
}