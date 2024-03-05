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
// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/1194324658/
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
        List<Integer> level = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                level.add(currentNode.val);
                if(currentNode.left !=null){
                queue.add(currentNode.left);
                }
                if(currentNode.right !=null){
                queue.add(currentNode.right);
                }
            }
        result.add(0,level);
        }
        return result;
    
    }
}