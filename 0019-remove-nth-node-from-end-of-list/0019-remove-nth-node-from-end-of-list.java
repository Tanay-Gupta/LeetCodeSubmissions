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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||(head.next==null)&&n==1)
            return(null);
        
     ListNode temp=head;
        ListNode t=head;
        for(int i=1;i<=n;i++)
            temp=temp.next;
        if(temp==null)
            return(head.next);
        while(temp.next!=null)
        {
            t=t.next;
            temp=temp.next;
            
        }
        t.next=t.next.next;
        return(head);
        
    }
}
