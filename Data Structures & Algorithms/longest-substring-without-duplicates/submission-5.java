class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        
        for(int right = 0; right < s.length(); right++){
          char ch = s.charAt(right);
          if(map.containsKey(ch) ){
            if(left > map.get(ch)){
              map.put(ch,right);
            }
            else{
            left = map.get(ch) + 1;
            map.put(ch, right);
            }
          }
          map.put(ch,right);

          maxLen = Math.max(right - left + 1, maxLen);
        }
        return maxLen;
        
      
    }
}
