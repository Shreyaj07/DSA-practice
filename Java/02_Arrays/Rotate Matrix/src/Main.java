import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Solution solution = new Solution();
        solution.rotate(arr);
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}