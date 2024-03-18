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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        int ansn;
        Queue<TreeNode> queue = new LinkedList<>();
                inorderTraversal(root, queue);

//    kthSmallest(root.left,k);
//     queue.offer(root);
//     kthSmallest(root.right,k);
      int size=  queue.size();

                for(int i =1; i<size;i++){
                if(i==k){
                 TreeNode ansr = queue.poll();
                return ansr.val;
                 }
                    queue.poll();

            } 
return k;
    //        for (int i = 0; i < k - 1; i++) {
    //     queue.poll();
    // }
    // TreeNode kthNode = queue.poll();
    // return kthNode.val;

    }
private void inorderTraversal(TreeNode node, Queue<TreeNode> queue) {
        if (node == null)
            return;
        inorderTraversal(node.left, queue);
        queue.offer(node);
        inorderTraversal(node.right, queue);
    }

    
}
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/1206921910/