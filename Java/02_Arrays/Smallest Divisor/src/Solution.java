public class Solution {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,3,4,5},8));
    }
    public static int smallestDivisor(int arr[], int limit) {
        // Write your coder here
        int n = arr.length;
        for(int i=1; i<Integer.MAX_VALUE-1; i++){
            int sum =0;
            for (int k : arr) {
                int temp = k / i;
                sum += temp;
            }
            if(sum <= limit){
                return i;
            }
        }

        return 0;
    }
}