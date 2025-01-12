
class Solution {
    int ans = 1;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }

      int   max = root.val;
     goodNodes(root.left,max);
     goodNodes(root.right,max);

    return ans;
    }
    public void goodNodes(TreeNode root,int max) {
        if(root==null){
            return;
        }
     if(root.val>=max){
        ans++;
     }
     max = Math.max(max,root.val);
     goodNodes(root.left,max);
     goodNodes(root.right,max);
        }

   
}
