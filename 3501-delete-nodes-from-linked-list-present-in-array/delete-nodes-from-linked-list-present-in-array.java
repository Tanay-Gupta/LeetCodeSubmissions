/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] a, ListNode head) {

        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

       ListNode dummy=new ListNode(0);

       dummy.next=head;
       ListNode temp=dummy;
       ListNode curr=dummy.next;
       while(curr!=null){

        if(list.contains(curr.val)){

            curr=curr.next;
        }
        else
        {
        temp.next=curr;
        curr=curr.next;
        temp=temp.next;
        }
       }
       temp.next=curr;
       return dummy.next;
       

    }
}