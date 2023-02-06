class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        
    int i,x=0,y=n;
        int a[]=new int[n*2];
        for(i=0;i<2*n;i++)
        {
            if(i%2==0)
            {
                a[i]=nums[x++];
            }
            else 
                a[i]=nums[y++];
        }
        return(a);
        
    }
}