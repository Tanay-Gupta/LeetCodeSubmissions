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
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> queue=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return(list);
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int count=queue.size();
            
            for(int i=1;i<=count;i++)
            {
                TreeNode curr=queue.poll();
                
                if(i==count)
                    list.add(curr.val);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
                    
            }
        }
        return(list);
        
    }
}