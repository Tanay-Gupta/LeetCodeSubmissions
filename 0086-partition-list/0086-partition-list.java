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
    public ListNode partition(ListNode head, int x) {
        
        
        
        ListNode a=new ListNode(-101);
        ListNode b=new ListNode(-101);
        
        ListNode pointera=a;
        ListNode pointerb=b;
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            if(temp.val<x)
            {
                a.next=temp;
                a=a.next;
            }
            else
            {
                b.next=temp;
                b=b.next;
            }
            temp=temp.next;
        }
        b.next=null;
        a.next=pointerb.next;
        return pointera.next;
        
        
        
    }
}