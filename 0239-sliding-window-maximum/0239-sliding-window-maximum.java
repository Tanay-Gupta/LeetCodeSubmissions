class Solution {
    
    int seg[];
    void build(int s,int e,int i, int a[])
    {
        if(s>e)
            return;
        
        if(s==e)
        {
            seg[i]=a[s];
            return;
        }
        int mid=(s+e)/2;
        build(s,mid,2*i,a);
        build(mid+1,e,2*i+1,a);
        
        seg[i]=Math.max(seg[2*i],seg[2*i+1]);
        
            
        
    }
    int query(int s,int e,int l,int r,int idx)
    {
        //non overlapping
        if(e<l || r<s)
            return Integer.MIN_VALUE;
        //koi bhi waste nahi hai
        if(l<=s && e<=r)
            return seg[idx];
        //kuch waste hai
        
        int mid=(s+e)/2;
        int lt=query(s,mid,l,r,2*idx);
        int rt=query(mid+1,e,l,r,2*idx+1);
        return Math.max(lt,rt);
        
    }
    
    
    
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n=nums.length;
        seg=new int[4*n];
        Arrays.fill(seg, Integer.MIN_VALUE);
        build(0,n-1,1,nums);
        int ans[]=new int[n-k+1];
        
        for(int i=0;i<n-k+1;i++)
            ans[i]=query(0,n-1,i,i+k-1,1);
        return ans;
        
        
    
        
        
        
        
        
        
        
    }
}