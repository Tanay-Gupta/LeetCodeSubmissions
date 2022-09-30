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
    List<List<Integer>> finalList=new ArrayList<>();
    
    public void dfs(TreeNode root,ArrayList<Integer> path, int target)
    {
        if(root==null)
            return;
        target-=root.val;
        path.add(root.val);
        if(target==0&&root.left==null&&root.right==null)
        {
            
            finalList.add(new ArrayList<>(path));
        }
        dfs(root.left,path,target);
         dfs(root.right,path,target);
        path.remove(path.size()-1);
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root==null)
            return(finalList);
        dfs(root,new ArrayList<Integer>(),targetSum);
        return(finalList);
        
        
        
    }
}