class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int total = 0;
        // int leftMax = 0;
        // int rightMax = 0;
        
        prefix[0] = heights[0];
        suffix[n-1] = heights[n-1];
        for(int i = 1; i < heights.length; i++){
            if(prefix[i - 1] > heights[i]){
                prefix[i] = prefix[i - 1];
            }
            else{
                prefix[i] = heights[i];
            }
        }
        for(int i = n-2; i >= 0; i--){
            if(suffix[i + 1] > heights[i]){
                suffix[i] = suffix[i + 1];
            }
            else{
                suffix[i] = heights[i];
            }
        }
        for(int i = 0; i < heights.length; i++){
            total += Math.min(prefix[i], suffix[i]) - heights[i]; 

          
        }
        return total;
       


    }
}
