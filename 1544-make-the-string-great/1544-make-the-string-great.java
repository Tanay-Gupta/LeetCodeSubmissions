class Solution {
    public String makeGood(String s) {
        
        
        Stack<Character> st=new Stack<Character>();
        String neww="";
        for(int i=0;i<s.length();i++)
        {
            if((!st.empty())&&(Math.abs(st.peek()-s.charAt(i))==32))
               {
                   st.pop();
               }
             else
               {
                   st.push(s.charAt(i));
               }
        }
               while(st.empty()==false)
               {
                 neww=st.pop()+neww;  
               }return(neww);
        
    }
}