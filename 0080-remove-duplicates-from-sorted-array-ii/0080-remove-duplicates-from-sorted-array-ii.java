class Solution {
    public int removeDuplicates(int[] a) {
        
        
        int l=a.length;
        
        int p1,p2;
        p1=0;
        p2=1;
        int k=0;
        while(p2<l)
        {
            
            if(a[p2]==a[p1])
            {
                if(k==1)
                {
                    p2++;
                    
                }
                else
                {
                    
                   
                       k=1;
                    p1++;
                    a[p1]=a[p2];
                    p2++;  
                    
                   
                }
                
            }
            
            
            else
            {
                k=0;
                p1++;
                a[p1]=a[p2];
                p2++;
            }
        }
        
        return (p1+1);
        
        
        
        
        
        
        
    }
}