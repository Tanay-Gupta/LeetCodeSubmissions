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
    
    public int minSwaps(ArrayList<Integer> nums)
    {
        // Code here
        int n=nums.size();
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
               a.add(nums.get(i));
               h.put(nums.get(i),i);
        }
        
        // System.out.println("Original list: "+nums);
        Collections.sort(a);
        // System.out.println("Sorted List: "+a);
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a.get(i)!=nums.get(i))
            {
                int temp=nums.get(i);
                Collections.swap(nums,i,h.get(a.get(i)));
                h.put(temp,h.get(a.get(i)));
                c++;
            }
        }
        // System.out.println("c: "+c);
        return(c);
   
    }
  
 
    public int minimumOperations(TreeNode root) {
        
        
        
        Queue<TreeNode> q=new  ArrayDeque<>(); 
        ArrayList<Integer> l;
         int c=0;
        if(root==null)
            return(0);
        q.add(root);
       
        while(q.size()!=0)
        {
           
            l=new ArrayList<>();
            int count =q.size();
            for(int i=0;i<count;i++)
            {
                TreeNode curr=q.poll();
                
                
                 if(curr.left!=null)
                     {
                        q.add(curr.left);
                        l.add(curr.left.val);
                     
                     }
                 if(curr.right!=null)
                    {
                         q.add(curr.right);
                     l.add(curr.right.val);
                    }
            }
            
        
            c+=minSwaps(l);
        }
        return(c);
        
        
        
    }
}