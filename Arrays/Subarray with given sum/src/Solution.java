import java.util.ArrayList;

class Solution
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Solution.subarraySum(arr,arr.length,0));
        int[] arr2 = {1,2,3,4};
        System.out.println(Solution.subarraySum(arr2,arr2.length,5));
    }
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int start=0,end=0,sum=0;
        while (end < n) {
            sum += arr[end];

            while (sum > s) {
                sum -= arr[start];
                start++;
            }

            if (sum == s && start<=end) {
                al.add(start + 1);
                al.add(end + 1);
                return al;
            }
            end++;
        }

        // for(int i =0; i<n; i++){
        //     int sum = arr[i];
        //     if(sum==s){
        //         al.add(i+1);
        //         al.add(i+1);
        //         return al;
        //     }
        //     for(int j=i+1; j<n;j++){
        //         sum+=arr[j];
        //         if(sum==s){
        //             al.add(i+1);
        //             al.add(j+1);
        //             return al;
        //         }
        //     }
        // }
        al.add(-1);
        return al;
    }
}