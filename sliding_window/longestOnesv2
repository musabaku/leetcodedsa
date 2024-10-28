class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }
     int l = 0;
     int r = 0;   
    int max = 0;
    // ArrayList<Integer> list = new ArrayList<>();
while(r<nums.length){
    if(nums[r]==1){
        // list.add(1);
        max = Math.max(max,r-l+1);

        r++;
    }
    if(r<nums.length && nums[r]==0 && k > 0){
        // list.add(1);
        k--;
        max = Math.max(max,r-l+1);
        r++;

    }
    if(r<nums.length && l<nums.length && nums[r]==0 && k == 0){
        if(nums[l]==1){
            l++;
        //      if(!list.isEmpty()){
        // list.remove(0);
        //      }
        }
        if(nums[l]==0){
            l++;
        //     if(!list.isEmpty()){
        // list.remove(0);
        //     }
        k++;

        }
    }

}
    return max;

    }
}
