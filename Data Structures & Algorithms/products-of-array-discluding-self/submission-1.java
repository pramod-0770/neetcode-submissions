class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];
        int prodleft = 1;
        left[0] = 1;
        for(int i = 1; i < n; i++){
            prodleft = prodleft * nums[i - 1];
            left[i] = prodleft;
        }
        right[n-1] = 1;
        int prodright = 1;
        for(int i = n-2; i>= 0; i--){
            prodright = prodright * nums[i + 1];
            right[i] = prodright;
        }
        for(int i = 0; i < n; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}  
