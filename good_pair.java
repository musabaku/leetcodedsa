class Solution {
    public int numIdenticalPairs(int[] nums) {
                    int count = 0; 

        for ( int i=0;i<nums.length;i++){

            for(int j = 0;j<nums.length;j++){
                if((nums[j] == nums[i]) && (j!=i)){
                    count += 1;
                }
                else{
                    count += 0;
                }
            }

        }
        return count/2;
    }
}