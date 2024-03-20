// https://leetcode.com/problems/sum-root-to-leaf-numbers/

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
    int result;
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        sum = sum*10 +root.val;

        if(root.left==null&&root.right==null){
            result = result +sum;
            sum = (sum - root.val)/10;
            return result;
        }
        int leftSum = sumNumbers(root.left);
        int rightSum = sumNumbers(root.right);
        sum = (sum - root.val)/10;
    
    return result;
    }

}