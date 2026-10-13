class Solution {
    public int mySqrt(int x) {
        int res = 0;
        for(long i  = 1 ; i <= x; i ++){
            if(i*i > x){
                res = (int) i- 1;
                break; 
            }
            if (i*i == x){
                res = (int) i;
                break;
            }
        }
        return res;
    }
    
}