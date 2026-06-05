class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
               count = count + 1;
               if(count > 0){
                return true;
               }
            }
            else{
                map.put(nums[i],count);
            }

        
      }
      return false;
}
}