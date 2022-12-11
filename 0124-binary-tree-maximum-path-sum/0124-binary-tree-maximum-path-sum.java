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
    
    int res=Integer.MIN_VALUE;
    public int height(TreeNode root)
    {
        if(root==null)
            return(0);
        int lh=height(root.left);
        int rh=height(root.right);
        int either=Math.max(root.val,Math.max(lh,rh)+root.val);
        
        res=Math.max(res,Math.max(lh+rh+root.val,either));
        return(either);
    }
    public int maxPathSum(TreeNode root) {
        
        int x=height(root);
        return(res);
    }
}