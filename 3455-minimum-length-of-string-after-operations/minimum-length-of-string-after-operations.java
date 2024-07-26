class Solution {
    public int minimumLength(String s) {
        int a[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }

       int  sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0)
            sum += (a[i] % 2==1)?1:2;

        }    
        return sum;
    }  
}
