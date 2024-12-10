class Solution {
    public int lowerBound(int[] nums, int target){
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target) ans = mid;
                r = mid -1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
     public int upperBound(int[] nums, int target){
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]>target){
                r = mid -1;
            }
            else{
                if(nums[mid]==target) ans = mid;
                l = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        if(nums.length==0) return arr;
       int lb = lowerBound(nums,target);
        if(lb!=-1 && nums[lb]==target){
            arr[0] = lb;
        }
         int ub = upperBound(nums,target);
        if(ub!= -1 && nums[ub]==target){
            arr[1] = ub;
        }
        return arr;
    }
}
