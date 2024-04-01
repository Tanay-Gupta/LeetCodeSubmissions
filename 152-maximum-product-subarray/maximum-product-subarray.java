class Solution {

    public int maxProduct(int[] a) {


        int l=a.length;
        int start=1, end=1;

        int max=-(int )1e9;
        for(int i=0;i<l;i++){

            start*=a[i];
            end*=a[l-i-1];
            max=Math.max(max, Math.max(start, end));

            if(start==0) start =1;
            if(end==0) end=1;

        }
        return max;

    }
}