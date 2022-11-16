class Solution {
    public String minRemoveToMakeValid(String s) {
        
        
        
        Stack<Integer> stack=new Stack<>();
        StringBuffer br=new StringBuffer();
        
        
        
        int l=s.length();
        
        
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stack.push(i);
            }
            else if(ch==')')
            {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                    stack.pop();
                else stack.push(i);
                    
            }
        }
       // System.out.println(ar+" "+stack.size());
        
        HashSet<Integer> ar=new HashSet<>(stack);
      
       // System.out.println(ar);
        for(int i=0;i<l;i++)
        {
           if(ar.contains(i)==false)
               br.append(s.charAt(i));
               
        }
            
        
        
        return(br.toString());
            
    
        
        
    }
}