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
    public ListNode swapNodes(ListNode head, int k) {
        
        List<Integer> ar=new ArrayList<>();
        
        while(head!=null)
        {
            ar.add(head.val);
            head=head.next;
        }
        
        int t=ar.get(k-1);
        ar.set(k-1,ar.get(ar.size()-k));
        ar.set(ar.size()-k,t);
        
        head=new ListNode(ar.get(0));
        head.next=null;
        ListNode temp=head;
        int i=1;
        while(i<ar.size())
        {
            temp.next=new  ListNode(ar.get(i++));
            temp=temp.next;
            
        }
        return head;
        
        
        
    }
}