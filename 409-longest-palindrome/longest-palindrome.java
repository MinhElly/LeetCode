class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int totalLength = 0;
        boolean hasOdd = false;
        for(char words : s.toCharArray()){
            map.put(words, map.getOrDefault(words,0)+1);
        }
        
        for(int count : map.values()){
            if(count % 2 == 0){
              totalLength += count;
            }else{
                totalLength += count - 1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            totalLength++;
        }
       return totalLength;
   }
}