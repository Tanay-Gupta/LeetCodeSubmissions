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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        
        List<List<Integer>> ar=new ArrayList<>();
        if(root==null)
            return(ar);
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1)
        {
            TreeNode curr=queue.poll();
            if(curr==null)
            {
                ar.add(0,list);
                list=new ArrayList<>();
                queue.add(null);
                continue;
                
            }
            list.add(curr.val);
            if(curr.left!=null)queue.add(curr.left);
              if(curr.right!=null)queue.add(curr.right);
            
            
        }
          ar.add(0,list);
        return(ar);
    }
}