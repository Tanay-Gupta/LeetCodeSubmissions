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
    public void reorderList(ListNode head) {
        
        if(head==null||head.next==null)
            return ;
        
        

        
        //finding the middle
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //revsering the second half
        
        
        ListNode curr=slow.next,next=null,prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow.next=null;
        
        // now operting on both the halfs
        
        ListNode head1=head,head2=prev;
        
        while(head1!=null&&head2!=null)
        {
            next=head1.next;
            ListNode next2=head2.next;
            head2.next=head1.next;
            head1.next=head2;
            
            
            head1=next;
            head2=next2;
            
            
        }
            
        
    }
}