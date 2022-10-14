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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null||head.next==null)
            return(null);
       
        ListNode slow=head;
        ListNode superslow=head;
        ListNode fast=head;
        
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            superslow=slow;
            slow=slow.next;  
        }
        if(fast.next==null)
           superslow.next=superslow.next.next;
        else
            slow.next=slow.next.next;
        // System.out.println(superslow.val);
        // System.out.println(slow.val);
        
        return(head);
    }
}