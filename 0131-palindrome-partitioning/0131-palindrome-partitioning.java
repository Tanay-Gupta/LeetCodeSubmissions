class Solution {
    
    
    public boolean isPali(String w,int s,int e)
    {
        
        
        while(s<=e)
        {
            
            if(w.charAt(s)!=w.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
    
    public void walk( List<List<String>> list,List<String> ar, String s,int index)
    {
        
        
        if(index==s.length())
        {
            list.add(new ArrayList<>(ar));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPali(s,index,i))
            {
            ar.add(s.substring(index,i+1));
            walk(list,ar,s,i+1);
            ar.remove(ar.size()-1);
            }
            
        }
    }
    public List<List<String>> partition(String s) {
    
        List<List<String>> list=new ArrayList<>();
        walk(list,new ArrayList<>(),s,0);
        return list;
          
    }
}