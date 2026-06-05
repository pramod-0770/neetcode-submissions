class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
           int left = i + 1;
           int right = nums.length-1;

           while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                if(!result.contains(triplet)){
                    result.add(triplet);
                }
                left++;
                right--;



            }
            if(sum < 0){
                left++;
            }
            if(sum > 0){
                 right--;
            }

            
            
           

            
                     
        }
        }
        return result;
    }
}
