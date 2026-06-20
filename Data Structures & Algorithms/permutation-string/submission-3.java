class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s1.length() > s2.length()){
          return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
               map.put(s1.charAt(i),map.get(s1.charAt(i)) + 1);
            }
            else{
            map.put(s1.charAt(i),1);
            }

        }
        int windowLen = s1.length();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < windowLen; i++){
             if(map2.containsKey(s2.charAt(i))){
               map2.put(s2.charAt(i),map2.get(s2.charAt(i)) + 1);
            }
            else{
            map2.put(s2.charAt(i),1);
            }
       }
       if(map.equals(map2)){
        return true;
       }
       for(int i = windowLen; i < s2.length(); i++){
           if(map2.containsKey(s2.charAt(i))){
               map2.put(s2.charAt(i),map2.get(s2.charAt(i)) + 1);
            }
            else{
            map2.put(s2.charAt(i),1);
            }
          map2.put(s2.charAt(i - windowLen),map2.get(s2.charAt(i - windowLen)) - 1);
          if(map2.get(s2.charAt(i - windowLen)) == 0){
            map2.remove(s2.charAt(i - windowLen));
          }
          if(map.equals(map2)){
            return true;
          }
       }
       return false;



}
}
