class Solution {
    public String removeKdigits(String num, int k) {
        
        
       
        
        
        
        
        if(num.length()==1&&k==1)
            return "0";
        
        
        Stack<Character> s=new Stack<>();
        
        String ns="";
        int i=0;
        while(i<num.length())
        {
            while(k>0&&!s.isEmpty()&&s.peek()>num.charAt(i))
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;
        }
        while(k>0&&!s.isEmpty())
        {
            s.pop();
            k--;
        }
        
       StringBuilder br=new StringBuilder();
        while(!s.isEmpty())
        {
            br.append(s.pop());
        }
        br.reverse();
        
          while (br.toString().startsWith("0")) {
            br.deleteCharAt(0);

        }
         return br.length()==0?"0":br.toString();

     
    }
}


