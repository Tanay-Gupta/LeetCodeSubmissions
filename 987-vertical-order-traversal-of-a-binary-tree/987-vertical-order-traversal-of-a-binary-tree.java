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
    
    TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
    public void traversal(TreeNode root, int mVal,int height)
    {
        if(root==null)
            return;
        
        if(map.containsKey(mVal)==false)
        {
            TreeMap<Integer,PriorityQueue<Integer>> ar=new TreeMap<>();
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            queue.add(root.val);//adding to queue
            ar.put(height,queue);//adding to internal tree
            map.put(mVal,ar);//adding to final tree
        }
        else
        {
            TreeMap<Integer,PriorityQueue<Integer>> ar=new TreeMap<>();
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            ar=map.get(mVal);
            
            if(ar.containsKey(height)==false)
            {
                queue.add(root.val);
                ar.put(height,queue);
            }
            else
            {
                queue=ar.get(height);
                queue.add(root.val);
                ar.put(height,queue);
            }

            map.put(mVal,ar);   
        }
        traversal(root.left,mVal-1,height+1);
        traversal(root.right,mVal+1,height+1);
  
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traversal(root,0,0);
        List<List<Integer>> pr=new ArrayList<>();
        for(Map.Entry<Integer,TreeMap<Integer,PriorityQueue<Integer>>>entry:map.entrySet())
        {
            TreeMap<Integer,PriorityQueue<Integer>> xx=entry.getValue();
            List<Integer> list=new ArrayList<>();
              for(Map.Entry<Integer,PriorityQueue<Integer>>entryInternal:xx.entrySet())
            {
                  PriorityQueue<Integer> q=entryInternal.getValue();
                  while(!q.isEmpty())
                  {
                      int x=q.poll();
                        list.add(x);
                  }
                
            }
            pr.add(list);
            //Collections.sort(entry.getValue());
           // ar.add(entry.getValue());
        }
        return(pr);
    }
}