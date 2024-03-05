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
// https://leetcode.com/problems/binary-tree-right-side-view/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        // List<Integer> result = new ArrayList<>();
        // if(root==null){
        //     return result;
        // }
        // result.add(root.val);
        // TreeNode current = root;
        // while(current.right!=null ){
        //     result.add(current.right.val);
        //     current = current.right;
        // }
        // // if(current.right==null&&current.left!=null){
        // //     result.add(current.left.val);
        // // }
        // return result;
          List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
        // List<Integer> level = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                // level.add(currentNode.val);
                if(currentNode.left !=null){
                queue.add(currentNode.left);
                }
                if(currentNode.right !=null){
                queue.add(currentNode.right);
                }
                if(i==levelSize-1){
             result.add(currentNode.val);
                }
            }
        }
        return result;
    }
}