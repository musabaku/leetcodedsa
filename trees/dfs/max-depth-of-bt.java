// https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/1205441169/
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
    // int result=0

    public int maxDepth(TreeNode root) {
      int result = dfs(root);
        return result+1;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return -1;
        }
            int left = dfs(root.left);
            int right = dfs(root.right);



        return 1+Math.max(left,right);
    }
}