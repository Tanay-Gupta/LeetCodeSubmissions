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

    
    ArrayList<Integer> ar;
    public Solution(ListNode head) {
        ar=new ArrayList<>();
        
        ListNode temp=head;
        while(temp!=null)
        {
            ar.add(temp.val);
            temp=temp.next;
        }
        
    }
    
    public int getRandom() {
        
       int index = (int)(Math.random() * ar.size());
  
           return ar.get(index);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */