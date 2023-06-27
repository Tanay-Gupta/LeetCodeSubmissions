class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int n=candies.size();
        vector<bool> res;
        int maxi=INT_MIN;
        for(auto it:candies)
            maxi=max(it,maxi);
        for(auto it:candies){
            if(it+extraCandies>=maxi)
                res.push_back(true);
            else
                res.push_back(false);
        }
        return res;
    }
};