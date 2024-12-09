class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for(int i = 0;i<matrix.length; i++){
            int l =0;
            int r = matrix[i].length -1;
            while(r>=l){
            int mid = (r+l)/2;
            if(matrix[i][mid] < target){
                l = mid+1;
            }
            else if(matrix[i][mid] > target){
                r = mid -1;
            }
           else if(matrix[i][mid]==target){
            ans = true;
            break;
            }
        }
        }
        return ans;
    }
}
