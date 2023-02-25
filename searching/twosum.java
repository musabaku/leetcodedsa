class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int s = 0;
        int e = numbers.length-1;
        while(numbers[s]+numbers[e] != target){
            if(numbers[s]+numbers[e] > target){
               e--;

            }
            else{
                s++;
                }
        }
        return new int[] {s+1,e+1};
    }
}