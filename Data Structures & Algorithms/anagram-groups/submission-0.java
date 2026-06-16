class Solution {
    public boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        else{
            char arr1[] = a.toCharArray();
            char arr2[] = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String res1 = new String(arr1);
            String res2 = new String(arr2);
            if(res1.equals(res2)){
                return true;
            }
            return false;
            
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
         
         List<List<String>> result = new ArrayList<>();
         boolean visited [] = new boolean[strs.length];
         
         for(int i = 0; i < strs.length; i++){
            if (visited[i] == true){
                continue;
            }
            
              List<String> anagram = new ArrayList<>();
              anagram.add(strs[i]);
              visited[i] = true;
            


            for(int j = i + 1; j < strs.length; j++){
               

               if(!visited[j] && isAnagram(strs[i],strs[j])){
                 
                 anagram.add(strs[j]);
                 visited[j] = true;


                 
               }
               

                
            }
            result.add(anagram);
         }
         return result;

    }
}
