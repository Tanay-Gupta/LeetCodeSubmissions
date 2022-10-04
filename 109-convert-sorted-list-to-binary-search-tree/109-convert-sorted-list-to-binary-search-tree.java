/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
      public TreeNode bst(ArrayList<Integer> a,int s,int e)
    {
        if(s>e)
        {
            return(null);
        }
            int mid=s+(e-s)/2;
            TreeNode newNode=new TreeNode(a.get(mid));
            newNode.left=bst(a,s,mid-1);
            newNode.right=bst(a,mid+1,e);
            
        
        return(newNode);
    }
    public TreeNode sortedListToBST(ListNode head) {
        
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        
        return(bst(list,0,list.size()-1));
        
    }
}