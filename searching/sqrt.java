class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0){
            return x;
        }
            int s = 1;
            int e = x;
            int ans =0;
        while(e>=s){
        
            int m = s + (e-s)/2 ;
            if(x/m == m){
                return m;
            }
            else if(x/m>m){
                s=m+1;
                ans = m;

            }
            else if(x/m<m){
                e=m-1;

            }
        }

        return ans;

    }
}