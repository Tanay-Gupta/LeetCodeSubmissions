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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
         ArrayList<List<Integer>> ar=new ArrayList<>(); 
        Queue<TreeNode> q=new ArrayDeque<>();
         
        if(root==null)
            return(ar );
        q.add(root);
       int t=1;
        while(!q.isEmpty())
        {
           
            ArrayList<Integer> list =new ArrayList<Integer>();
            int count =q.size();
            for(int i=0;i<count;i++)
            {
                TreeNode curr=q.poll();
                list.add(curr.val);
                
                if(curr.left!=null)
                {
                    q.add(curr.left);
                   
                }
                    
                if(curr.right!=null)
                {
                    q.add(curr.right);
                  
                }
                    
                 
            }
            if(t==-1)
                Collections.reverse(list);
          ar.add(list);
             t=t*-1;
           
        }
        return(ar);
        
    }
}