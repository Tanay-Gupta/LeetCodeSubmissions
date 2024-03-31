class Solution {
    public int countSubstrings(String s) {



        int count=0;

        for(int i=0;i<s.length();i++){

            int evencheck=countPali(s, i,i+1);
            int oddcheck=countPali(s, i-1, i+1);
            count+=evencheck+oddcheck+1;
        }
        return count;
    }
    int countPali(String s, int left, int right){
        int c=0;
        while(left>=0&&right<s.length()&&s.charAt(left--)==s.charAt(right++)){
            c++;
        }
        return c;
    }
}