class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        boolean ans = false;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(nums[mid]==target) ans = true;
            if(nums[mid] == nums[l]&& nums[mid]==nums[r]){
                r--;
                l++;
                continue;
            }
            if(nums[mid] >= nums[l]){
                if(nums[l]<=target && nums[mid]>=target){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }

            }
            else{
                if(target>=nums[mid] && target<=nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
        }
        return ans;
    }
}
