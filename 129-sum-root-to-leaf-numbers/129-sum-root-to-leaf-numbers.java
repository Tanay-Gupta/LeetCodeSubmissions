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
    int final_sum=0;
    public void sum(TreeNode root, ArrayList<Integer> ar)
    {
        if(root==null)
            return;
        if(ar.size()==0)
            ar.add(root.val);
        else
            ar.add(ar.get(ar.size()-1)*10+root.val);
        
        sum(root.left,ar);
        sum(root.right,ar);
        
        if(root.left==null&&root.right==null)
        {
          
             final_sum+=ar.get(ar.size()-1);
        }
       
        ar.remove(ar.size()-1);
    }
    public int sumNumbers(TreeNode root) {
        sum(root,new ArrayList<>());
        return(final_sum);
        
    }
}