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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
       List<Integer> left = inorderTraversal(root.left);
       list.addAll(left);
        list.add(root.val);
       List<Integer> right = inorderTraversal(root.right);
       list.addAll(right);

return list;
    }
}
// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1213179777/