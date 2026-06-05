class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> s1 = new HashSet();
            String sb = "";
            for(int j = i; j < s.length(); j++){
              if(!s1.contains(s.charAt(j))){ 
                s1.add(s.charAt(j)); 
              sb = sb + s.charAt(j);
              }
              else{
                break;
              }
              
              maxLen = Math.max(j-i+1, maxLen);
             

            }

        }
        return maxLen;
    }
}
