class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        
        int i,s,e;
        Arrays.sort(a);
       List<List<Integer>> ls=new ArrayList<List<Integer>>();
        
        
        for(i=0;i<a.length-2;i++)
        {
            
            if(i==0||i>0&&a[i]!=a[i-1])
            {
                s=i+1;
                e=a.length-1;
                while(s<e)
                    {
                        if(a[s]+a[e]==-a[i])
                            {
                                ls.add(Arrays.asList(a[i],a[s],a[e]));
                            while(s<e&&a[s]==a[s+1])s++;
                             while(s<e&&a[e]==a[s-1])e--;
                            
                            
                s++;
                e--;
               
                
            }
               else if(a[s]+a[e]<0-a[i])
                   s++;
               else
                   e--;
                
            }
            
            
        
               
               
               
           }
            
            
        }
        return(ls);
   
        
        
        
        
        
    }
}