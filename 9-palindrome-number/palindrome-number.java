class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int origin = x;
        int reversed = 0;
        while (x > 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x /10;
        }
        if(origin == reversed){
            return true;
        }else {
            return false;
        }
    }
}