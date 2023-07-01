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
    boolean isTrue=false;
    public void dfs(TreeNode root, int k,HashSet<Integer> h)
    {
        
        
        if(root==null)
            return;
        if(h.contains(k-root.val)==true)
        {
           isTrue=true;
            return;
        } 
        h.add(root.val);
         
        dfs(root.left,k,h);
        dfs(root.right,k,h);
        

        }
    public boolean findTarget(TreeNode root, int k) {
        
        
     HashSet<Integer> h=new HashSet<>();
        dfs(root,k,h);
        return isTrue;
    }
}