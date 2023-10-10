public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,3,4};
        int[] arr1 = {7,8,9,10,11};
        System.out.println(FirstMissingPositive.smallestPositiveNo(arr));
        System.out.println(FirstMissingPositive.smallestPositiveNo(arr1));
    }
    public static int smallestPositiveNo(int[] arr){
        //start checking from 1
        //ignore all -ve and no. >n
        int i=0;
        int n = arr.length;
        while(i<n){
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        for(i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
