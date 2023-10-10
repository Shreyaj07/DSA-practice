public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,5};
        int n = Solution.removeDuplicates(arr);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}