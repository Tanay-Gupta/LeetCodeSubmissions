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
    int i=0;
    public TreeNode bst(int a[],int max )
    {
        if(i==a.length||a[i]>max)
            return null;
        
        TreeNode root=new TreeNode(a[i++]);
        root.left=bst(a,root.val);
        root.right=bst(a,max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] pre) {
    
        return (bst(pre,Integer.MAX_VALUE));
        
    }
}