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
        if(root==null || p==root||q==root){
            return root;
        }
     TreeNode ansLeft =   lowestCommonAncestor(root.left,p,q);

    TreeNode ansRight =   lowestCommonAncestor(root.right,p,q);
    if(ansLeft!=null&&ansRight!=null){
        return root;
    }
     if(ansRight!=null){
        return ansRight;
    }
    if(ansLeft!=null){
        return ansLeft;
    }
        return null;
    }
//     public boolean helper(TreeNode root, TreeNode p){
//         if(root==null){
//             return false;
//         }
//         if(root==p){
//             return true;
//         }
//  boolean ansLeft =   helper(root.left,p);
//    boolean ansRight = helper(root.right,p);


//         return ansLeft || ansRight;
//     }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//     if(root==null){
//         return root;
//     }
//         boolean pInLeft = helper(root.left, p);
//         boolean qInRight = helper(root.right, q);

//         if (pInLeft && qInRight) {
//             return root; // Split point: root is the LCA
//         }

//         boolean qInLeft = helper(root.left, q);
//         boolean pInRight = helper(root.right, p);

//         if (qInLeft && pInRight) {
//             return root; // Split point: root is the LCA
//         }
//         if(p==root){
//             return root;
//         }
//         if(q==root){
//             return root;
//         }
        
//      TreeNode   ansLeft = lowestCommonAncestor(root.left,p,q);
//    TreeNode   ansRight =     lowestCommonAncestor(root.right,p,q);
                
//     if(ansLeft!=null){
//         return ansLeft;
//     }
//      if(ansRight!=null){
//         return ansRight;
//     }
//         return null;
//    }
}
