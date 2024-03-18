/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        TreeNode currentNode = root;
        if(currentNode ==p||currentNode ==q){
            return currentNode;
        }
       TreeNode left = lowestCommonAncestor(currentNode.left,p,q);
       TreeNode right = lowestCommonAncestor(currentNode.right,p,q);

        if( right==null){
            return left;
        }
        else if( left==null){
            return right;
        }
        else if(left!=null && right!=null){
        return currentNode;

        }
        return currentNode;


    }
}

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/