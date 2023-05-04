class Solution {
    public String predictPartyVictory(String s) {
        
        int n=s.length();
        Queue<Integer> a=new LinkedList<>();
        Queue<Integer> b=new LinkedList<>();
        
        
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='R')
                a.add(i);
            else
                b.add(i);
        }
        
        
        while(!a.isEmpty()&&!b.isEmpty())
        {
            int aa=a.poll();
            int bb=b.poll();
            if(aa<bb)
                a.add(n++);
            else
                b.add(n++);
            
            
        }
        return a.size()==0?"Dire":"Radiant";
        
    }
}