https://leetcode.com/problems/median-of-two-sorted-arrays/description/
class Solution {
    public static double calculateMedian(int[] array) {
        // Arrays.sort(array);

        int n = array.length;
        if (n % 2 == 1) {
            return array[n / 2];
        } else {
            // 
            return (array[(n - 1) / 2] + array[n / 2]) / 2.0;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int a = nums1.length;
         int b = nums2.length;
        int p = 0;
        int q = 0;
        int[] arr = new int[a+b];

        for(int i =0;i<a+b;i++){
            if(q==b || p<a && q<b && nums1[p]<nums2[q] ){
                arr[i]= nums1[p];
                   p++;
            }
            else{
                if(q<b){
                  arr[i]= nums2[q];
                   q++;
                }
            }
            }
        double median = calculateMedian(arr);
        return median;
    }
}
