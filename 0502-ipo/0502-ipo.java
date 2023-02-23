
class Pair implements Comparable<Pair> 
{
    int capital;
    int profit;
    Pair(int first,int second)
    {
        this.capital=first;
        this.profit=second;
    }
    
    
     @Override
    public int compareTo(Pair o) {
        return capital - o.capital;
    }
}


class Solution {
    
    
    
    
    
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       int n = profits.length;
        Pair [] projects = new Pair[n];
        for(int i = 0;i<n;i++){
            projects[i] = new Pair(capital[i],profits[i]);
        }
        
        Arrays.sort(projects);
      
      
       PriorityQueue<Integer> priority = new PriorityQueue<Integer>( Collections.reverseOrder());
        int sum=w;
        
        int j=0;
        while(k-->0)
        {
        while(j<n && projects[j].capital<=sum){
                priority.add(projects[j++].profit);
            }
            if(priority.isEmpty()){
                break;
            }
            
            sum+=priority.poll();
        
        }
            
        return sum;
        
        
        
        
    }
}