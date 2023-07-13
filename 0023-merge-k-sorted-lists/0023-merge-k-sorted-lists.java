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
    public ListNode mergeKLists(ListNode[] list) {
        
        
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<list.length;i++)
        {
            while(list[i]!=null)
            {
                q.add(list[i].val);
                list[i]=list[i].next;
            }
        }
        
        
        
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        
        while(!q.isEmpty())
        {
            temp.next=new ListNode(q.poll());
            temp=temp.next;
        }
        return dummy.next;
        
    }
}