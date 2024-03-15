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
    public boolean isSubtree(TreeNode root, TreeNode t) {
        
      if(root==null||t==null) return false;
        
        if(isSame(root,t )) return true;
        
        
        return (isSubtree(root.left,t)||isSubtree(root.right,t));
        
    }
    public boolean isSame(TreeNode a, TreeNode b )
    {
        
        if(a==null&&b!=null || a!=null&&b==null)return false;
        if(a==null&&b==null )return true;
        if(a.val!=b.val)return false;
        
        return (isSame(a.left,b.left)&&isSame(a.right,b.right));
    }
}