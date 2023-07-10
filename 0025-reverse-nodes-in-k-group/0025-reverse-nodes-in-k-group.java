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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        
        ListNode dummy=new ListNode(0);
        
        dummy.next=head;
       
        ListNode pointer=dummy;
        while(pointer!=null)
        {
            
            //checking if k pointers can be switched
            ListNode node=pointer;
            for(int i=1;i<=k&&node!=null;i++)
                node=node.next;
            
            if(node==null) break;
            
            
            //now we know we have k node to be reversed
            
            ListNode curr=pointer.next,prev=null,next=null;
            
            for(int i=0;i<k;i++)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            
            // now we have revered k nodes but curr and prev are not connected
            
            ListNode tail=pointer.next;
            tail.next=curr; // connected
            pointer.next=prev;
            pointer =tail; 
            
        }
        return dummy.next;

        }
}