// https://leetcode.com/problems/unique-paths/
class Solution {
    public int helper(int m,int n, int x , int y,int[][] dp){
       
          if(x>=m||y>=n){
        return 0;
    }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
    if(x==m-1&&y==n-1){
        return dp[x][y] =1;
    }
  
   int down = helper(m,n,x+1,y,dp);
   int right = helper(m,n,x,y+1,dp);
return dp[x][y] =down+right;
    }
    public int uniquePaths(int m, int n) {
         int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
      return  helper(m,n,0,0,dp);
    }
}
