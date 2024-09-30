// https://leetcode.com/problems/house-robber-ii/
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int[] dp1 = new int[nums.length];

        for(int i = 0;i<dp.length;i++){
            dp[i]=-1;
            dp1[i]=-1;

        }
        if(nums.length ==1 ){
            return nums[0];
        }
        int case1 = helper(nums,0,nums.length-2,dp);
        int case2 = helper(nums,1,nums.length-1,dp1);

        return Math.max(case1,case2);
    }
    
    public int helper(int[] nums, int start , int end,int[] dp){
        int take = 0;
        int Ntake = 0;
       
        if(start>end){
            return 0;
            
        }
         if(dp[start]!=-1){
            return dp[start];
        }
        if(start==end){
            return dp[start] = nums[start];
        }
       
        take = nums[start] + helper(nums,start+2,end,dp);
        Ntake = 0 + helper(nums,start+1,end,dp);
      return  dp[start] = Math.max(take,Ntake);

    }
}