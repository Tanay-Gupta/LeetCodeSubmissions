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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        
        
        
        if(a==null&&b==null) return null;
        
        if(a==null) return b;
        
        if(b==null ) return a;
        
        
        ListNode dummy=new ListNode(0);
        ListNode pointer=dummy;
        
        while(a!=null&&b!=null)
        {
            if(a.val<b.val)
            {
                dummy.next=a;
                a=a.next;
            }
            else
                 {
                dummy.next=b;
                 b=b.next;
                }
           
            dummy=dummy.next;
        }
        
        
        while(a!=null)
        {
            dummy.next=a;
            dummy=dummy.next;
            a=a.next;
        }
         while(b!=null)
        {
            dummy.next=b;
            dummy=dummy.next;
            b=b.next;
        }
        dummy.next=null;
        
        return pointer.next;
        
        
        
        
    }
}