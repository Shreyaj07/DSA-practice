public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 1},
                {2, 2, 2}
        };
        Solution solution = new Solution();
        int[][] result = solution.zeroMatrix(matrix, matrix.length, matrix[0].length);
        solution.display(result);
    }
}