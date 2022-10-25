class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder s1=new StringBuilder();
          StringBuilder s2=new StringBuilder();
        int l1=word1.length;
        int l2=word2.length;
        for(int i=0;i<l1;i++)
            s1.append(word1[i]);
        for(int i=0;i<l2;i++)
            s2.append(word2[i]);
      //  System.out.print(s1.toString()+" "+s2.toString());
        
        if(s1.toString().compareTo(s2.toString())!=0)
            return(false);
        else
            return(true);
        
    }
}