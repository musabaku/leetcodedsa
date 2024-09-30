// https://leetcode.com/problems/house-robber/
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            dp[i] = -1;
        }
       return helper(nums.length-1, nums,dp);
    }
    public int helper(int n,int[] nums,int[] dp){
        if(n==0){
            dp[0] = nums[n];
        }
          if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
      
        int take = nums[n]+helper(n-2,nums,dp);
        int notTake = 0+helper(n-1,nums,dp);
         dp[n] = Math.max(take,notTake);
         return dp[n];
    }
}
// Doesnt consider all cases 
// 3+ 100 = 103 2nd and last element

// eg - nums = [1,3,1,3,100]
//  int sum1=0;
//         int sum2=0;
//         int sum3 = 0;
//         if(nums.length>2){
//         sum3=nums[0]+nums[nums.length-1];

//         }

//         for(int i = 0;i<=nums.length;i+=2){
//             if(i<nums.length){
//            sum1 += nums[i];
//             }
//         }
//           for(int j = 1;j<=nums.length;j+=2){
//               if(j<nums.length){
//            sum2 += nums[j];

//             }
//         }
//         return Math.max(Math.max(sum1,sum2),sum3);