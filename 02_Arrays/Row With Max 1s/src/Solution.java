class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxOnes = 0;
        int rowWithMaxOnes=0;
        for(int i =0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count > maxOnes){
                rowWithMaxOnes = i;
                maxOnes = count;
            }
        }
        if(maxOnes == 0){
            return -1;
        }
        return rowWithMaxOnes;
    }
}