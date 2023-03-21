class Solution {    
    
    public boolean isValid(int mid,int price[],int k)
    {
        
        int count=1;
        int i=1;
        int last=price[0];
        while(count<k&&i<price.length)
        {
            if(price[i]-last>=mid)
            {
                last=price[i];
                count++;
            }
            i++;
        }
        return count==k;
    }
    public int maximumTastiness(int[] price, int k) {
        
        
        Arrays.sort(price);
        
        
        int s=0;
        int e=(int)1e9;
        
        while(s<e)
        {
            
            int mid=s+(e-s)/2;
            if(isValid(mid,price,k))
                s=mid+1;
            else
                e=mid;
        }
        return s-1;
        
    
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}