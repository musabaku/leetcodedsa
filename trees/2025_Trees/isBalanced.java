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
     int height = 0;
    public int helper(TreeNode root){
         if(root==null){
        return 0;
     }
     int leftHeight = helper(root.left);
      int rightHeight = helper(root.right);
      int ans = Math.abs(leftHeight-rightHeight);
      height = Math.max(height,ans);
      return 1+ Math.max(leftHeight,rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
     if(root==null){
        return true;
     }
     
     helper(root);
      if(height<=1){
        return true;
      }
      return false;
    }
}
