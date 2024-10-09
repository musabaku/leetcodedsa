class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,zero=0,maxLength=0;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            if(zero<=k){
                maxLength = Math.max(maxLength,r-l+1);
            }
            if(zero>k){
                   if(nums[l]==0){
                    zero--;
                }
                l++;
             
            }
            r++;
        }
        return maxLength;
    }
}
// https://leetcode.com/problems/max-consecutive-ones-iii/