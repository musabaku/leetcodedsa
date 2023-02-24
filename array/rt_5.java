class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList al = new ArrayList();
        int[] arr =   new int[nums.length];
        for(int i =0;i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        for(int i =0;i<al.size();i++){
            arr[i] = (int)al.get(i);
        }
        return arr;
    }
}