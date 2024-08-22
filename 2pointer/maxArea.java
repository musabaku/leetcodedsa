class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max=0;
        int ans1 = 0;
       while(i<j){
            if(height[i] < height[j]){
            ans1 = (j-i) * height[i];
              if(ans1>max){
                max = ans1;
            }
            i++;
            }
            else {
            ans1 =  (j-i) * height[j];
              if(ans1>max){
                max = ans1;
            }
            j--;
            }
       }
        return max;
        
    }
}
// https://leetcode.com/problems/container-with-most-water/