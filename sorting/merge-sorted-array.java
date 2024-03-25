class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
         nums1 = sortArray(nums1,m+n);

    }
     public int[] sortArray(int[] nums1,int size){
        for(int j=0;j<size-1;j++){
        for(int i =0;i<size-1-j;i++){
            if(i==size){
                break;
            }
            if(nums1[i]>nums1[i+1]){
                int temp = nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;
            }
        }
        }
        return nums1;
        }
}