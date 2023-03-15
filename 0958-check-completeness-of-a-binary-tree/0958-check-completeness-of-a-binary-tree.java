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
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public boolean isCompleteTree(TreeNode root) {
        
       int height=height(root)-1;
        
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int currHeight=1;
        while(!q.isEmpty())
        {
        
            int size=q.size();
            if(currHeight==height&&size!=(int)Math.pow(2,currHeight-1))
            return false;
               
                int k=0;
            for(int i=0;i<size;i++)
            {
                
                TreeNode curr=q.poll();
                
                if(currHeight!=height&&curr.left==null&&curr.right!=null)
                  return false;
                    
                if(curr.left!=null)
                {
                    if(k==1)
                        return false;
                    q.add(curr.left);
                }
                else
                    k=1;
                if(curr.right!=null)
                {
                    if(k==1)
                        return false;
                    q.add(curr.right);
                }
                else
                     k=1;
                
               
            }
            currHeight++;
            
            
            
            
        }        
        return true;
        
        
        
        
    }
}