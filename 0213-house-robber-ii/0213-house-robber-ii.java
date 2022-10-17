class Solution {
    
    int dp[];
    public int h1(int a[],int s,int l)
    {
          //int l=a.length;
        int prev=a[s];//pahla store kiya
        int prev2=0;//aur uske pahle wala 0
        
        for(int i=s+1;i<l;i++)
        {
            int take=a[i];//ek uthya
            if(i>s+1)
                take=prev2+take;//uske pahle ka pahla liya
            
            int notake=0+prev;
            int curr=Math.max(take,notake);//uske phla liya
            prev2=prev;
            prev=curr;

        }
        return(prev);
        
    }
    public int rob(int[] a) {
        
        if(a.length==1)
            return(a[0]);
        return(Math.max(h1(a,0,a.length-1),h1(a,1,a.length)));
        
        
    }
}