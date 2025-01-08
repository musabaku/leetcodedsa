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
int diameter = 0;

    public int helper(TreeNode root){
    if(root == null){
            return 0;
        }
     int leftHeight = helper(root.left);
       int rightHeight = helper(root.right);
       int height = Math.max(leftHeight,rightHeight);

         diameter = Math.max(diameter,leftHeight+rightHeight);
        return 1+height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
helper(root);
         return diameter ;
    }
}


// 2nd approach

class Solution {
int diameter = 0;

    public int helper(TreeNode root){
    if(root == null){
            return -1;
        }
     int leftHeight = helper(root.left);
       int rightHeight = helper(root.right);
       int height = Math.max(leftHeight,rightHeight);

         diameter = Math.max(diameter,leftHeight+rightHeight+2);
        return 1+height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
helper(root);
         return diameter ;
    }
}
