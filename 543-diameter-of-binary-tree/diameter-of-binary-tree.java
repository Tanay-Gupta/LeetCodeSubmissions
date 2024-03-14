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
    int result=-1;

    public int walk(TreeNode root)
    {
        if(root==null) return -1;

        int left=1+walk(root.left);
        int right= 1+walk(root.right);
        result= Math.max(left+right,result);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
   walk(root);
   return result;
    }
}