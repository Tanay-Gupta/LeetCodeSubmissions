class Solution {

     int func(int a[],int x)
    {
        int  time=0;
        for(int i:a){
            time+=Math.ceil(i/(x*1.0));
        }
        return time;
    }
    public int minEatingSpeed(int[] a, int h) {


        int sum=0;
        for(int i:a){
            sum=Math.max(sum,i);
        }


        int s=0,e=sum,ans=0;
        while(s<=e){

            int m=s+(e-s)/2;
            int time=func(a,m);
            if(time<=h)
            {
                ans=m;
                e=m-1;
            }
            else
            s=m+1;
            

        }
        return ans;
        
    }
}