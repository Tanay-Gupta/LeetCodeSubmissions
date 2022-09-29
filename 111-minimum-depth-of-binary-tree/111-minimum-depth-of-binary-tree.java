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
    public int minDepth(TreeNode root) {
        
        if(root==null)
            return(0);
        int d1=minDepth(root.left);
        int d2=minDepth(root.right);
        if(root.left==null&&root.right==null)
            return(1);
        if(root.left==null)
            return(1+d2);
        if(root.right==null)
            return(1+d1);
        
        return(Math.min(d1,d2)+1);
    }
}