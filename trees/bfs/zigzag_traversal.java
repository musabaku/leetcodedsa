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
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int count =0;
        // if count 0 add right node and viceversa
        if(root==null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
        int LevelSize = queue.size();
        List<Integer> LevelList = new ArrayList<>();
            for(int i =0;i<LevelSize;i++){
            if(count==0){
            TreeNode node = queue.pollFirst();
            LevelList.add(node.val);
              if(node.left!=null){
                queue.addLast(node.left);
                }
                if(node.right!=null){
                queue.addLast(node.right);
                }
              
            }
            if(count==1){
            TreeNode node = queue.pollLast();
            LevelList.add(node.val);
              if(node.right!=null){
                queue.addFirst(node.right);
                }
                if(node.left!=null){
                queue.addFirst(node.left);
                }
              
            }
            }
           count = 1 - count; 
            result.add(LevelList);
        }
return result;
    }
}