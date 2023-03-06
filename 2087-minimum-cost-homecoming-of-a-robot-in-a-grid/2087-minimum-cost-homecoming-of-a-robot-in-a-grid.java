class Solution {
    
    
    
    
   int func(int start, int home, int[] arr){
    if(home<start) return func(home-1, start-1, arr);
    int ans = 0;
    while(start!=home) ans+=arr[++start];
    return ans;
}
public int minCost(int[] start, int[] home, int[] row, int[] col) {
    return func(start[0], home[0], row) + func(start[1], home[1], col);
}

}