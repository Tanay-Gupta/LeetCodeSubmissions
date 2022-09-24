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
    public int pairSum(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        //finding the mid of linked list
        while(fast.next.next!=null&&slow!=null)
        {
            fast=fast.next.next;
            slow=slow.next;     
        }
        
        ListNode prev=null;
        ListNode temp=slow.next;
        slow.next=null;
        while(temp!=null)
        {
            ListNode ahead=temp.next;
            temp.next=prev;
            prev=temp;
            temp=ahead;
            
        }
        int max=Integer.MIN_VALUE;
        while(prev!=null)
        {
            max=Math.max(max,prev.val+head.val);
            prev=prev.next;
            head=head.next;
        }
            return(max);
       
            
            
        
    }
}