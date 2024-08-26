class Solution {
    public int trap(int[] height) {
        if(height.length==0||height==null) return 0;
        int n = height.length;
        int[] arrR = new int[height.length];
        int[] arrL = new int[height.length];
        int[] arr = new int[height.length];
        int res=0;
        arrL[0] = 0;
        for(int i =1;i<height.length;i++){
            arrL[i] = Math.max(arrL[i-1],height[i-1]);
        }
          arrR[n-1] = 0;
        for(int i =n-2;i>=0;i--){
            arrR[i] = Math.max(arrR[i+1],height[i+1]);
        }
        for(int i =0;i<height.length;i++){
           int ans  = Math.min(arrR[i],arrL[i]) - height[i];
           if(ans<0){
            ans = 0;
           }
           arr[i] = ans;
        }
        for(int i =0;i<arr.length;i++){
           res += arr[i];
        }
    return res;
}

}
// https://leetcode.com/problems/trapping-rain-water/