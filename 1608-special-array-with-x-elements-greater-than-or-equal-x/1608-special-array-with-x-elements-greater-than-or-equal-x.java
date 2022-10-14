class Solution {
    public int specialArray(int[] a) {
        
      Arrays.sort(a);
        int i;
        int count=-1;
        for(i=0;i<a.length;)
        {
            if(a[i]>=count)
            {
                if(count==a.length-i)
                   return(count);
                else
                    count++;
            }
            else
                i++;
        }
        return(-1);
    }
}