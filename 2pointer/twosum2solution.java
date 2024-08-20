class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int count = numbers.length-1;
        int i = 0;
        int j =0;
        while(i<count){
        if((numbers[i] + numbers [count])>target){
            count --;
        }
        else if((numbers[i] + numbers [count])<target){
            i++;
        }
        if(numbers[i] + numbers [count]==target){
            return new int[] {i+1,count+1};
        }
        j++;
        }
        return arr;
    }
}
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//    int[] arr = new int[2];
//         for(int i =0;i<numbers.length;i++){
//             for(int j =i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     return new int[] {i+1,j+1};
//                 }

//             }
//         }
//         return arr;