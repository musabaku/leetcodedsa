/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   int ans = Integer.MIN_VALUE;
   public int maxPathSum(TreeNode root){
            if(root==null){
            return 0;
        }
        helper(root);
        return ans;
   }
    public int helper(TreeNode root) {
       
        if(root==null){
            return 0;
        }
     
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        int withRoot = root.val + Math.max(left, right);
        // int res = Math.max(withRoot, Math.max(left, right));
        // int noProp = root.val + left + right;
        // return Math.max(root.val,res);
    ans = Math.max(ans,root.val+left+right);
        return withRoot;
    }
}
