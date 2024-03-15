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
// https://leetcode.com/problems/diameter-of-binary-tree/
class Solution {
    int result=0;

    public int diameterOfBinaryTree(TreeNode root) {
     dfs(root);
    return result;
 }
    public int dfs(TreeNode node){
  if(node==null){
            return -1;
        }
      
      int  left = dfs(node.left);
       int right = dfs(node.right);
        result = Math.max(result,left+right+2);

        return 1+ Math.max(left,right);
    }
  
    
}