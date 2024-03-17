// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
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
    Queue<TreeNode> queue = new LinkedList();
  
      public void flatten(TreeNode root) {
          if(root==null){
              return ;
          }
          inorder(root);
          while(!queue.isEmpty()){
              TreeNode node = queue.poll();
              node.right = queue.peek();
              node.left = null;
          }
      }
      public void inorder(TreeNode root){
          if(root==null){
              return;
          }
          queue.offer(root);
          inorder(root.left);
          inorder(root.right);
      }
  }