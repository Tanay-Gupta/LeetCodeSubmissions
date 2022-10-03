class Solution {
    public int minCost(String s, int[] neededTime) {
        
        
        
        int i;
        int sum=neededTime[0];
        int finalsum=0;
        int max=sum;
        int k=0;
        for(i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)!=s.charAt(i))
            {
               if(k==1)
               {
                     finalsum=finalsum+(sum-max);
                      k=0;
               }
                sum=0;
                max=neededTime[i];
            }
            else
            {
                k=1;
                max=Math.max(max,neededTime[i]);
            }
            sum=sum+neededTime[i];
            
        }
        if(k==1)
          finalsum=finalsum+(sum-max);
        return(finalsum);
        
    }
}