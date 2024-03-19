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
    int c=0;
    public void walk(TreeNode root,int max){
        if(root==null) return ;

         max=Math.max(root.val, max);

         if(root.val>=max)
         c++;
         walk(root.left, max);
         walk(root.right,max);
    }
    public int goodNodes(TreeNode root) {

        walk(root,Integer.MIN_VALUE);
        return c;
        
    }
}