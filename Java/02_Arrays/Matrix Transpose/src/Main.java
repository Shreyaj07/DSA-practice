public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        System.out.println("Original Matrix: ");
        solution.display(arr);
        solution.transpose(arr.length, arr);
        System.out.println("Transpose: ");
        solution.display(arr);
    }
}