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
        
        if(head.next==null||left==right)
            return(head);
        
            ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        ListNode temp,temp1;
       temp=temp1=null;
        
        int start=0;
        for(int i=1;i<=right;i++)
        {
            if(i<left)
            {
                start=1;
                temp=curr;
                curr=curr.next;
            }
            else
            {
                if(i==left)
                    temp1=curr;
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        }
        if(start==1)
        temp.next=prev;
        else
            head=prev;
        
        temp1.next=curr;
        return(head);
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return(null);
       
        
        int l=0;
        ListNode temp=head;
        while(temp!=null)
        {
            l++;
            temp=temp.next;
        }
    
        k=k%l;
      if(k<=0)
            return(head);
        head= reverseBetween(head,1,l-k);
         head= reverseBetween(head,l-k+1,l);
         head= reverseBetween(head,1,l);
      
      return(head);
        
        
    }
}