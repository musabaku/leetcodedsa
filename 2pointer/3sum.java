// https://leetcode.com/problems/3sum/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
        int[] nums1 = Arrays.copyOf(nums,nums.length);
        List<List<Integer>> res = new ArrayList<>();

       for(int i =0;i<nums1.length;i++){
        if(i>0 && nums1[i]==nums1[i-1]){
            continue;
        }
         int target = -nums1[i];
        int count = i+1;
        int j = nums1.length-1;
        while(count<j){
           int sum = nums1[count]+nums1[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                count++;
            }
            if(sum==target){
        ArrayList<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums1[count]);
                list.add(nums1[j]);
                res.add(list);
                count++;
                j--;
                while(count<j && nums1[count]==nums[count-1]){
                count++;
                }
                while(count<j && nums1[j]==nums[j+1]){
                j--;
                }
            }
        }
       }
       return res;
    }
}