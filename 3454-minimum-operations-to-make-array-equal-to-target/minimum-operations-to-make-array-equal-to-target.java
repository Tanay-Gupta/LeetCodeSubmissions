class Solution {
    public long minimumOperations(int[] n, int[] t) {
        

    long sum=0,prev=0;
    for(int i=0;i<n.length;i++){
    
    sum=sum+Math.max(t[i]-n[i]-prev,0);
    prev=t[i]-n[i];
    }
    return sum+Math.max(-prev,0);
    }
}