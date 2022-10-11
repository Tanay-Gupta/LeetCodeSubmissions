class Solution {
    public int numRescueBoats(int[] a, int limit) {
        
        Arrays.sort(a);
        int s=0,e=a.length-1,c=0;
       while(s<=e)
       {
           if(a[s]==limit)
              {
               c++;
               s++;
           }
           if(a[e]==limit)
           {
               c++;
               e--;
           }
           if(a[s]+a[e]<=limit)
           {
               c++;
               s++;
               e--;
           }
           else
           {
               c++;
               e--;
           }
           
       }
        return(c);
        
    }
}