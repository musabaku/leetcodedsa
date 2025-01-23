class Solution {
        ArrayList<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> list1 = new ArrayList<>();

        helper(candidates,target,0,list1);
        return list;
    }
        public void helper(int[]candidates, int target,int index,ArrayList<Integer> list1)  {
            if(target==0){
                list.add(new ArrayList<>(list1));
                return;
            }
       for(int i = index;i<candidates.length;i++){
        if(candidates[i]<=target){
            list1.add(candidates[i]);
            helper(candidates,target-candidates[i],i,list1);
            list1.remove(list1.size()-1);
        }
       }
    return;
        }
    
}
