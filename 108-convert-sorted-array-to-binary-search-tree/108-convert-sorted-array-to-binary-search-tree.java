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
    
    public TreeNode bst(int a[],int s,int e)
    {
        if(s>e)
        {
            return(null);
        }
            int mid=s+(e-s)/2;
            TreeNode newNode=new TreeNode(a[mid]);
            newNode.left=bst(a,s,mid-1);
            newNode.right=bst(a,mid+1,e);
            
        
        return(newNode);
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return(bst(nums,0,nums.length-1));
        
    }
}