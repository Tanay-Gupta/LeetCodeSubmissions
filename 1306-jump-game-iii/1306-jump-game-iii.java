class Solution {
    
    
    public boolean walk(int a[],int i)
    {
        if(i<0||i>=a.length||a[i]<0) return false;
        
        if(a[i]==0)return true;
        
        a[i]=-a[i];
        return(walk(a,i+a[i])||walk(a,i-a[i]));
        
        
    }
    public boolean canReach(int[] arr, int start) {
        
        
        
        
        if(arr[start]==0)
            return true;
        
        return walk(arr,start);
        
        
    }
}