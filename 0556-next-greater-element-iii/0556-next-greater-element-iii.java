class Solution {
    public int nextGreaterElement(int n) {
        
        String s=n+"";
        
        char ch[]=s.toCharArray();
        
       int mx=ch.length-1;
        int i;
        for(i=ch.length-2;i>=0;i--)
        {
            if(ch[i]<ch[mx])
                break;
            else
                mx=i;
        }
        if(i==-1)
            return(-1);
        mx=mx-1;
        // found first swap element
        
        //now searching for second swap element
        i=ch.length-1;
        while(i>mx)
        {
            if(ch[i]>ch[mx])
                break;
            i--;
        }
        //now swaping 
        char temp=ch[mx];
        ch[mx]=ch[i];
        ch[i]=temp;
     // //   System.out.println(mx);
     //    2147483647
     //    2147483476    

  Arrays.sort(ch,mx+1,ch.length);
        long t=Long.valueOf(String.valueOf(ch));
        if(t>Integer.MAX_VALUE)
            return(-1);
        
        return((int)t);
        
    }
}