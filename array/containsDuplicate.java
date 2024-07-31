class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        Set<Integer> res = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            if(!res.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}


// https://leetcode.com/problems/contains-duplicate/