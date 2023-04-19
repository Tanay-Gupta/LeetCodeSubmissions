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
    
    int max=0;
    public void walk(TreeNode root,int steps,boolean isleft)
    {
        
        if(root==null)
            return;
        max=Math.max(max,steps);
        if(isleft==true)
        {
            walk(root.left,steps+1,false);
            walk(root.right,1,true);
        }
        else
        {
            walk(root.right,steps+1,true);
            walk(root.left,1,false);
        }
    }
    public int longestZigZag(TreeNode root) {
        
        walk(root,0,false);
        walk(root,0,true);
        return max;
    }
}