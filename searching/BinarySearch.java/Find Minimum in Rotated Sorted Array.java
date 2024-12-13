class Solution {
    public int findMin(int[] nums) {
     int l = 0;
     int r = nums.length-1;
     int min = Integer.MAX_VALUE;
     while(l<=r){
        int mid = l + (r-l)/2;
        if(l==0&&r==nums.length-1){
        min = nums[mid];
        }
        if(min>nums[mid]){
            min = nums[mid];
        }
        if(nums[mid]<nums[r]){
            r = mid -1;
        }
        else{
            l = mid+1;
        }
        
     }
     return min;
    }
}
