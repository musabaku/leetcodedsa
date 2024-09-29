// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int Lsum = 0;
        int Rsum = 0;
        int r = cardPoints.length -1;
int maxSum = 0;

                int sum =0;
                for(int i = 0;i<k;i++){
                    Lsum+=cardPoints[i];
                }
                maxSum = Lsum;
                 for(int j = k-1;j>=0;j--){
                    Lsum -= cardPoints[j];
                    Rsum+=cardPoints[r];
                    r--;
            maxSum = Math.max(maxSum,Lsum+Rsum); 

                }
        return maxSum;
    }
}