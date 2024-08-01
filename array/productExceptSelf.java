// https://leetcode.com/problems/product-of-array-except-self/
// Method 1 o(n^2)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = nums.length;
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int[] res = new int[nums.length];
        left[0] = 1;
        right[x-1] = 1;

    for(int i =1;i<nums.length;i++){
        left[i]  =  left[i-1] * nums[i-1];
    }
    for(int i =x-2;i>=0;i--){
        right[i] =  right[i+1] *nums[i+1];
    }
    for(int i =0;i<nums.length;i++){
        res[i] = left[i] * right[i];
    }
    return res;
    }
}
    // int[] arr = new int[nums.length];
        // for(int i =0;i<nums.length;i++){
        //  int count = 1;
        //     for(int j =0;j<nums.length;j++){
        //      if(i==j){
        //         continue;
        //     }
        //     count  *= nums[j];
        //     }
        //     arr[i] = count;
        // }
        // return arr;