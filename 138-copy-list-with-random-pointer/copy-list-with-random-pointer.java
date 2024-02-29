/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
     // 1>>1i>>2>>2i>>3>>3i
        Node temp=head;
        while(temp!=null){

            Node next=temp.next;
            temp.next=new Node(temp.val,next,null);
            temp=next;
        }

        //now cloning the random


        temp=head;

        while(temp!=null){
            if(temp.random!=null)
            temp.next.random=temp.random.next;
            temp=temp.next.next;
        }

        //now fixing

        
        Node dummy=head.next;
        temp=head;

        while(temp!=null){
           
           Node next=temp.next.next;
           Node copy=temp.next;

           temp.next=next;
           if(next!=null)
           copy.next=next.next;
           temp=next;

        }
        return dummy;




    }
}