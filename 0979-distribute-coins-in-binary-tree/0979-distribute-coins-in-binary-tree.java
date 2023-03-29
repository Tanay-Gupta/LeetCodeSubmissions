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
    int ans=0;
    public int walk(TreeNode root)
    {
        
        
        if(root==null)
            return 0;
        // anpe to bas count karna h kitna coin exchange hua total. neeche se upar
        int left=walk(root.left);
        int right=walk(root.right);
        ans+=Math.abs(left)+Math.abs(right);
        
        return root.val+left+right-1;// ek coin rakh liya baki coin daan me de diya
    }
    public int distributeCoins(TreeNode root) {
        
        walk(root);
        return ans;
        
    }
}