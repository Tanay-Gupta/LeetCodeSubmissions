class Solution {
    public int largestRectangleArea(int[] heights) {
        
        /* Naive Solution 
        
        int i;
        int max=heights[0];
        for(i=0;i<heights.length;i++)
        {
            int sum=heights[i];
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[j]>=heights[i])
                    sum+=heights[i];
                else
                    break;
            }
             for(int j=i-1;j>=0;j--)
            {
                if(heights[j]>=heights[i])
                    sum+=heights[i];
                 else
                     break;
            }
            
            max=Math.max(max,sum);
        }
        return(max);
        
        */
        
        int i,n=heights.length;
        int res=0;
        int tb,cur;
        Stack<Integer> s=new Stack<>();
        
        for(i=0;i<heights.length;i++)
        {
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i])
            {
                tb=s.pop();
                cur=heights[tb]*(s.isEmpty()?i:i-s.peek()-1);
                res=Math.max(res,cur);
            }
            s.push(i);
        }
        
        while(!s.isEmpty())
        {
            tb=s.pop();
                cur=heights[tb]*(s.isEmpty()?n:n-s.peek()-1);
                res=Math.max(res,cur);
        }
        return(res);
        
        
        
        
    }
}