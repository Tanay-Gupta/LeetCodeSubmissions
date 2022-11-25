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
    
     int maxLength;
    public  int walk(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int leftsideValue=walk(root.left);
        int rightsideValue=walk(root.right);// ye previous values hain. jo pahle bani thi highest same length
        
        int justLeft=0;
        int justRight=0;
        
        if(root.left!=null&&root.left.val==root.val)//agar just left same na hua to baki add karne ka koi matlb hi ni h
             justLeft+=leftsideValue+1;
        
        if(root.right!=null&&root.right.val==root.val)
            justRight+=rightsideValue+1;
        
        maxLength=Math.max(maxLength,justLeft+justRight);
        return (Math.max(justLeft,justRight));//sum ni return karni ni to wo dono common values return karegi
    }
    public int longestUnivaluePath(TreeNode root) {
        
        maxLength=0;
        walk(root);
        return(maxLength);
        
    }
}


