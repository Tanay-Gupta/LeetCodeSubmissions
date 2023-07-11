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
    public ListNode deleteDuplicates(ListNode head) {
        
        
          if(head==null||head.next==null)
            return head;
        
         ListNode dummy=new ListNode(-300);
        dummy.next=head;
        
        ListNode curr=dummy.next;
        ListNode prev=dummy;
        
        while(curr!=null)
        {
            int k=0;
            while(curr.next!=null&&curr.val==curr.next.val)
            {
                curr=curr.next;
                k=1;
            }
            if(k==0)
            {
                prev.next=curr;
                prev=prev.next;
            }
            else
            {
                prev.next=curr.next;
            }
                
            curr=curr.next;
        
           
        }
        
        return dummy.next;
        
    }
}