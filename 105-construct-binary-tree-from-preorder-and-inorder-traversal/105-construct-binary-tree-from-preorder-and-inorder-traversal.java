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
    int preindex=0;
    public TreeNode generate(int in[],int pre[],int s, int e)
    {
        if(s>e)
            return(null);
        TreeNode root=new TreeNode(pre[preindex++]);
        int inIndex=0;
        for(int i=s;i<=e;i++)
        {
            if(in[i]==root.val)
            {
               inIndex=i;
                break;
            }
        }
        root.left=generate(in,pre,s,inIndex-1);
        root.right=generate(in,pre,inIndex+1,e);
        return(root);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return(generate(inorder,preorder,0,inorder.length-1));
            
}
        
    
}