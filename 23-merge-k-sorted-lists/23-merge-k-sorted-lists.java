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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0)
            return(null);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        int i;
        
        for(i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
                pq.add(lists[i].val);
                // System.out.print(lists[i].val+" ");
                lists[i]=lists[i].next;
            }
                
        }
        if(pq.size()==0)
            return(null);
        ListNode head=new ListNode(pq.poll());
        ListNode temp=head;
        int size=pq.size();
        for(i=0;i<size;i++)
        {
            temp.next=new ListNode(pq.poll());
            temp=temp.next;
        }
        return(head);
    }
}