class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
               count = count + 1;
               if(count > 1){
                return true;
               }
            }
            else{
                map.put(nums[i],1);
            }

        
      }
      return false;
}
}