class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
        for (int i =0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){

               if(nums1[i]==nums2[j]){
                  stack.push(greaterFunc(j,nums2));
               }
           }
        }
    
   
int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;

    }
     public int greaterFunc(int k,int[] nums2){
            for(int i=k;i<nums2.length-1;i++){
                if(nums2[i+1]>nums2[k]){
                    return nums2[i+1];
                }
            }
            return -1;
}
}

// https://leetcode.com/problems/next-greater-element-i/submissions/