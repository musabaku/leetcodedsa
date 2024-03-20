// https://leetcode.com/problems/path-sum/
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
    boolean res = false;

public boolean hasPathSum(TreeNode root, int targetSum) {
    if(root==null){
       return false;
    }
    int ts = targetSum - root.val;
    if(root.left==null && root.right==null){
        return  ts == 0;
    }
    
  boolean ansLeft =  hasPathSum(root.left,ts);
    boolean ansRight = hasPathSum(root.right,ts);
   
return ansLeft || ansRight;
}
}