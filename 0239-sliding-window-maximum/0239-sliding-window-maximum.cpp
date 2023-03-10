class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {//using sliding window approach
        
        vector<int> ans;
        deque<int> dq;
        
        int i=0, j=0, n= nums.size();
        
        while(j<n){
            
            while(!dq.empty() and dq.back()<nums[j] )
                dq.pop_back();
            
            dq.push_back(nums[j]);
            
            if(j-i+1 < k)        //window size  not achieved
               j++;
            
            else{
                
                ans.push_back(dq.front());
                
                if(dq.front() == nums[i])
                    dq.pop_front();
                
                i++, j++;     //moving the window
            }
        }
        
        return ans;
    }
};
        