class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = -1;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]>=target){
                ans = mid;
                r = mid -1;
            }
            else{
                l = mid+1;
            }

        }
        if(ans == -1){
            ans = n;
        }
        return ans;
    }
}
