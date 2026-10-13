class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";
        int left = 0;
        int right = clean.length() - 1;
        for( int i = clean.length() -1  ; i >=0 ; i--){
            if(clean.charAt(left) != clean.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}