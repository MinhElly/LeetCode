class Solution {
    public int longestPalindrome(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] word = s.split("");
        int totalLength = 0;
        boolean hasOdd = false;
        for(String words : word){
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