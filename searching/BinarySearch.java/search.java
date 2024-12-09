class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans =-1;
        while(r>=l){
            int mid = (r+l)/2;
            if(nums[mid] < target){
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid -1;
            }
           else if(nums[mid]==target){
            ans = mid;
            break;
            }
        }
        return ans;
    }
}
