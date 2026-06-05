class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int current : set){
            int count = 1;
            
           
            if(!set.contains(current - 1)){
                 current = current + 1;
                 while(set.contains(current)){
                    count = count + 1;
                    current = current + 1;
                 }
                longest = Math.max(count,longest);

             
        }
        }
        return longest;
        
    }
}
