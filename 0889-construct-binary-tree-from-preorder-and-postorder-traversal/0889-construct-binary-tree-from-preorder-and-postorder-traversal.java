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
    int preIndex=0,posIndex=0;
    public TreeNode constructFromPrePost(int[] pre, int[] pos) {
        
        
       TreeNode root=new TreeNode(pre[preIndex++]);
        if(root.val!=pos[posIndex])
            root.left=constructFromPrePost(pre,pos);
        
        if(root.val!=pos[posIndex])
            root.right=constructFromPrePost(pre,pos);
        posIndex++;
        return root;
        
        
    }
}