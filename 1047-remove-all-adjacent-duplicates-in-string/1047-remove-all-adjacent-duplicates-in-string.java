class Solution {
    public String removeDuplicates(String s) {
        
        
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!stack.isEmpty()&&stack.peek()==ch)
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuffer br=new StringBuffer();
        
        while(!stack.isEmpty())
        {
            br.insert(0,stack.pop());
        }
        return(br.toString());
    }
}