public class Solution {
    public static void main(String[] args) {
        System.out.println(sumOfMaxMin(new int[]{0,4,6,2,-5,3}, 6));
    }
  public static int sumOfMaxMin(int[] arr, int n) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for(int i=0; i<n; i++){
        if(arr[i] > max){
          max = arr[i];
        }
        if(arr[i] < min){
          min = arr[i];
        }
      }
      return max+min;
  }
}