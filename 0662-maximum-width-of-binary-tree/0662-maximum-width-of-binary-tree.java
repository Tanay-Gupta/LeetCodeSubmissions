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


class Pair
{
    TreeNode node;
    int index;
    Pair(TreeNode n,int index)
    {
        this.node=n;
        this.index=index;
    }
}
class Solution {
    
    
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        
        int max=Integer.MIN_VALUE;
        
        
        while(!q.isEmpty())
        {
            
            
            int size=q.size();
            int start=0;
            int end=0;
            for(int i=0;i<size;i++)
            {
              Pair node=q.poll();
                
                
                if(i==0)
                    start=node.index;
                if(i==size-1)
                    end=node.index;
                
                if(node.node.left!=null)
                    q.add(new Pair(node.node.left,2*node.index));
                
                if(node.node.right!=null)
                    q.add(new Pair(node.node.right,2*node.index+1));
                
               
                    
            }
             max=Math.max(end-start+1,max);
        }
            return max;
        
        
    }
}