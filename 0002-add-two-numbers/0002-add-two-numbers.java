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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        
        if(l1==null&&l2==null)return null;
        
        
        
        ListNode dummy=new ListNode(0);
        ListNode newNode=dummy;
        int val=0;
        while(l1!=null&&l2!=null)
        {
            
            
            val=l1.val+l2.val+val;
            if(val>9)
            {
                newNode.next=new ListNode(val%10);
                val=1;
            }
            else 
            {
                 newNode.next=new ListNode(val);
                val=0;
            }
            newNode=newNode.next;
            l1=l1.next;
            l2=l2.next;
                
        }
        while(l1!=null)
        {
            
            
            val=l1.val+val;
            if(val>9)
            {
                newNode.next=new ListNode(val%10);
                val=1;
            }
            else 
            {
                 newNode.next=new ListNode(val);
                val=0;
            }
            newNode=newNode.next;
            l1=l1.next;
                
        }
        while(l2!=null)
        {
            
            
            val=l2.val+val;
            if(val>9)
            {
                newNode.next=new ListNode(val%10);
                val=1;
            }
            else 
            {
                 newNode.next=new ListNode(val);
                val=0;
            }
            newNode=newNode.next;
            l2=l2.next;
                
        }
        if(val==1)  newNode.next=new ListNode(val);
            
        
        return dummy.next;
        
    }
}