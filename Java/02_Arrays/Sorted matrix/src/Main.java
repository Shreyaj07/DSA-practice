public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {
                {1,5,3},
                {2,8,7},
                {4,6,9}
        };
        System.out.println("Original Matrix");
        solution.display(arr);
        solution.sortedMatrix(arr.length,arr);
        System.out.println("After sorting matrix: ");
        solution.display(arr);

    }
}