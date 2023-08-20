class Solution
{
    static int maxLen(int arr[], int n)
    {
        int k =0;
        for(int i =0; i<arr.length; i++){
            int sum = arr[i];
            if(k==0 && sum==0){
                k=1;
            }
            for(int j=i+1; j<arr.length; j++){
                sum+=arr[j];
                if(sum==0 && (j-i+1)>k){
                    k = j-i+1;
                }
            }
        }
        return k;
    }
}