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
    // kth smallest hai bro.. kth from end ni. Easyhai

    int count=0;
    int value=0;
    public void walk(TreeNode root, int k)
    {
        if(root==null) return;
        walk(root.left,k);
count++;
        if(count==k)
        value=root.val;
        walk(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        walk(root,k);
        return value;

    
        
        
    }
}