class Solution {
    ArrayList<List<Integer>> list = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(arr,nums,0);
        return list;
    }
    public void helper(List<Integer> arr,int[] nums,int i){
        if(i==nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        helper(arr,nums,i+1);
        arr.remove(arr.size()-1);
        helper(arr,nums,i+1);

    }
}
