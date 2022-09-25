class Solution {
    
    private int normalMaxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }
    public int maxSubarraySumCircular(int[] arr) {
        
        int n=arr.length;
        	int max_normal = normalMaxSum(arr, n);

    	if(max_normal < 0)
    		return max_normal;

    	int arr_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		arr_sum += arr[i];

    		arr[i] = -arr[i];
    	}

    	int max_circular = arr_sum + normalMaxSum(arr, n);

    	return Math.max(max_circular, max_normal);
        
    }
}