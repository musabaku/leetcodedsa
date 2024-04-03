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
// https://leetcode.com/problems/same-tree/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList pQueue = queueFunc(p);
        ArrayList qQueue = queueFunc(q);
return pQueue.equals(qQueue);
    }
    public ArrayList<Integer> queueFunc(TreeNode root){
        ArrayList<Integer> list = new ArrayList();
        if(root!=null){
        list.add(root.val);
        list.addAll(queueFunc(root.left));
        list.addAll(queueFunc(root.right));
        }
        if(root==null){
            list.add(null);
            return list;
        }
        return list;
    }
}