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

    int index=0;
    int i=0;
   public TreeNode build(int pre[],int in[],int stop){

      if(index>=pre.length) return null;

      if(in[i]==stop) {
        i++;
        return null;
      }

      TreeNode node=new TreeNode(pre[index++]);
      node.left=build(pre,in,node.val);
      node.right=build(pre,in,stop);
      return node;

   }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return(build(preorder, inorder, Integer.MIN_VALUE));

    }
}