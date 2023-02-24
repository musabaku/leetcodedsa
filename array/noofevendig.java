class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            int an = nums[i];
            if(an >= 10 && an < 100){
                ans +=1;
            }
            else if(an >= 1000 && an<10000){
                ans +=1;
            }
             else if(an >= 100000 && an<1000000){
                ans +=1;
            }
           
        }
        return ans;
    }
}