class Solution {
    public static void main(String[] args) {
        System.out.println(minScoreTriangulation(new int[]{1,2,3}));
    }
    public static int minScoreTriangulation(int[] values) {
        int n = values.length;
        return solve(values,0,n-1);
    }
    static int solve(int[] v, int i, int j){
        //base case
        if(i+1==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i+1; k<j; k++){
            ans = Math.min(ans, v[i]*v[j]*v[k]+solve(v,i,k)+solve(v,k,j));
        }
        return ans;
    }

}
