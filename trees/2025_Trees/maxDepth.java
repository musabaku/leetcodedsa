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
    public int helper(TreeNode root, int max){
        if(root==null){
            return 0;
        }
       int leftHeight = helper(root.left,max);
      int rightHeight = helper(root.right,max);
       int height = Math.max(leftHeight,rightHeight);
        max = Math.max(max,height);

        return 1+height;

    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max = 0;
        // maxDepth(root.left)
        return helper(root,max);
    }
}
