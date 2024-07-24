class Solution {
    public int[] sortJumbled(int[] m, int[] a) {


        int f[][]=new int[a.length][2];

        for(int i=0;i<a.length;i++){

            f[i][0]=a[i];
            String s=a[i]+"";
            String ns="";
            for(int j=0;j<s.length();j++){
               ns=ns+m[s.charAt(j)-'0'];
            }
            f[i][1]=Integer.valueOf(ns);

        }
        Arrays.sort(f, (x,y)->Integer.compare(x[1],y[1]));

        int ls[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        ls[i]=f[i][0];
        return ls;


        
    }
}