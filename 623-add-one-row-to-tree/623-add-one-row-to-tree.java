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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        
        int i;
        int count=0;
        TreeNode temp1=null;
        TreeNode temp2=null;
        
        if(depth==1)
        {
                    temp1=new TreeNode(val);
                   
                    temp1.left=null;
                    temp1.left=root;
                 
            return(temp1);
        }
        while(!queue.isEmpty())
        {
             count++;
            System.out.println(count);
            int size=queue.size();
            if(count==depth-1)
            {
                for(i=0;i<size;i++)
                {
                    
                    TreeNode curr=queue.poll();
                    temp1=new TreeNode(val);
                    temp2=new TreeNode(val);
                    temp1.left=temp1.right=temp2.left=temp2.right=null;
                    temp1.left=curr.left;
                    temp2.right=curr.right;
                   // if(curr.left!=null)
                        curr.left=temp1;
                   // if(curr.right!=null)
                        curr.right=temp2;
   
                }
                break;
            }
            for(i=0;i<size;i++)
            {
                 TreeNode curr=queue.poll();
                  if(curr.left!=null)
                      queue.add(curr.left);
                  if(curr.right!=null)
                      queue.add(curr.right);
            }
            
                
             
        }
         
        return(root);
        
    }
}