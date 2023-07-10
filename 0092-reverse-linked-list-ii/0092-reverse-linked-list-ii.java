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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        
        if(left==right)
            return head;
         ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        
        int i=0;
        for(;i<left-1;i++)
            node=node.next;
        
        
       
        
        ListNode curr=node.next,prev=null,next=null;
        for(;i<right;i++)
        {
            
             next= curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }
        // System.out.println(node.val);
        // System.out.println(prev.val);
        // System.out.println(curr.val);
        node.next.next=curr;
        node.next=prev;
        
        return dummy.next;
        
    }
}