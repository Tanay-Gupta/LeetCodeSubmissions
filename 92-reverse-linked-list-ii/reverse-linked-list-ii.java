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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null||head.next==null) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        int i;
        for( i=1;i<l;i++){

            node=node.next;
        }
         ListNode prev=null,curr=node.next;
        while(curr!=null&&i<=r){

           ListNode next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
           i++;}

        System.out.println(prev.val);
                node.next.next=curr;
                node.next=prev;



        return dummy.next;
        

    }
}