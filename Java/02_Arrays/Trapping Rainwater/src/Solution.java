class Solution {
    public int trap(int[] height) {
        int water =0;
        int intial = height[0];
        int ht = height.length;
        int[] maxAtLeft = new int[ht];
        int[] maxAtRight = new int[ht];
        int leftMax=height[0];
        int rightMax = height[ht-1];
        for(int i =1; i<ht; i++){
            if(height[i] > leftMax){
                leftMax = height[i];
            }
            maxAtLeft[i] = leftMax;
        }
        for(int i =ht-1; i>=0; i--){
            if(height[i] > rightMax){
                rightMax = height[i];
            }
            maxAtRight[i] = rightMax;
        }
        int[] area = new int[ht];
        int totArea = 0;
        int temp = 0;
        for(int i =0; i<ht; i++){
            temp = Math.min(maxAtLeft[i], maxAtRight[i]) - height[i];
            if(temp > 0){
                totArea += temp;
            }
        }
        return totArea;
    }
}