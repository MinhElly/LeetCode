class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int left = 1;
        int right = x;
        int res = 0;
        while (left <= right){
            int mid = left + (right - left) /2;

            if(mid <= x / mid){
                left = mid + 1;
                res = mid;
            }else {
                right = mid - 1;
            }
        }
        return res;
    }
    
}