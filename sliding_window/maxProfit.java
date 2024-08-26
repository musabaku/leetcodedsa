class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int res=0;
        arr[n-1] = 0;
        for(int i = n-2;i>=0;i-- ){
            arr[i] = Math.max(arr[i+1],prices[i+1]);
        }
        for(int i = 0;i<n;i++){
            arr1[i] = arr[i] - prices[i] ;
        }
         for(int i = 0;i<n;i++){
            if(arr1[i]>res){
                res = arr1[i];
            }
        }
        return res;
    }
}
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/