class Solution {
    public int numberOfSubarrays(int[] a, int k) {
        
        
        int count=0;
        int prefix=0;
        int odd=0;
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]%2==1)
            {
                odd++;
                prefix=0;
            }
            
            while(odd==k)
            {
                if(a[j]%2==1) odd--;
                
                j++;
                prefix++;
            }
            count+=prefix;
        }
        return count;
        
        
    }
}