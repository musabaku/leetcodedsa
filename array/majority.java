class Solution {
    public int majorityElement(int[] nums) {
        int a;
        int c=0;
        int b = nums.length/2;
        for (int i =0;i<nums.length;i++){
             a = nums[i];
              c =0;
           for(int j=0;j<nums.length;j++){
               if(nums[j]==a){
                   c++;
               }
           }
            if (c>b){
            return a;
        }
        }
    return -1;
    }
}