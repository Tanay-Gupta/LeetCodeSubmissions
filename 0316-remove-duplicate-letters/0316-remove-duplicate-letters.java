class Solution {
    public String removeDuplicateLetters(String s) {
        
        
        
        Stack<Integer> stack=new Stack<>();
        int last[]=new int [26];
        int seen[]=new int[26];
        
        for(int i=0;i<s.length();i++)
            last[s.charAt(i)-'a']=i;//storing last index of each element
    
        
//         for(int i=0;i<s.length();i++)
//             System.out.print(last[s.charAt(i)-'a']+" ");
        
//         System.out.println();
        
        
        
        for(int i=0;i<s.length();i++)
        {
            
           
            int c=s.charAt(i)-'a';
            
            // System.out.println("Character :"+s.charAt(i)+" uski value :"+c+" Seen: "+seen[c]);
                 
            if(seen[c]++>0) continue;
             //  System.out.println(" Seen Updated: "+seen[c]);
          
            
            while(!stack.isEmpty()  &&  stack.peek()>c &&  i<last[stack.peek()])
            {
                seen[stack.pop()]=0;
            }
            stack.push(c);
        }
        
        StringBuffer br=new StringBuffer();
        for(int i:stack) br.append((char)('a'+i));
        
        return(br.toString());
        
        
        
        
        
        
        
        
        
        
        
    }
}











