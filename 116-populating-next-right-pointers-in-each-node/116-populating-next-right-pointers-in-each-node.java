/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
            return(null);
        
        ArrayDeque<Node> ar=new ArrayDeque<>();
        ar.add(root);
       int i; 
        Node prev=null;
        while(!ar.isEmpty()){
            
            int count=ar.size();
            
             prev=null;
           
          
            for(i=0;i<count;i++)
            {
                Node curr=ar.poll();
                if(prev!=null)
                    prev.next=curr;
                prev=curr;
               // System.out.print(curr.val+" ");
              
                if(curr.left!=null)
                    ar.add(curr.left);
                if(curr.right!=null)
                    ar.add(curr.right);
                
                
                
            }
            prev.next=null;
            //System.out.println();
              
            
        }
       
        return(root);
        
    }
}