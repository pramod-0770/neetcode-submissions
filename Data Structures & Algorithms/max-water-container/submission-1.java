class Solution {
    public int maxArea(int[] heights) {
       int left = 0;
       int right = heights.length - 1;
       int maxArea = 0;
       while(left < right){
        if(heights[left] < heights[right]){
            int area = heights[left] * (right - left);
            maxArea = Math.max(area, maxArea);
            left++;
        }
        else{
            int area = heights[right] * (right - left);
            maxArea = Math.max(area, maxArea);
            right--;
        }
       
       }
       return maxArea;

      

        
    }
    
}
