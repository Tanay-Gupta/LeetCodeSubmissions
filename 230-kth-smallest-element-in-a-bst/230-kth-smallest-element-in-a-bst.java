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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null||k<=0)
            return(-1);
          int value=-1;
             value= kthSmallest(root.left,k);
            count++;
            if(k==count)
                return(root.val);
            if(value!=-1)
                return(value);
            else
            return(kthSmallest(root.right,k));
          
        
        
    }
}