// https://leetcode.com/problems/average-of-levels-in-binary-tree/
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
           if(root ==null){
        return result;
    }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
 
        while(!queue.isEmpty()){
            int LevelSize = queue.size();
            Double avg =0.0;
            for(int i = 0;i<LevelSize;i++){
            TreeNode currentNode = queue.poll();
            avg += currentNode.val;
            if(currentNode.left !=null){
                queue.offer(currentNode.left);
            }
             if(currentNode.right !=null){
                queue.offer(currentNode.right);
            }
            }
            avg = avg/LevelSize;
        result.add(avg);
        }

        return result;
    }
}