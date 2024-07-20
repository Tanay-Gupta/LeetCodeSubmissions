class Solution {

    public boolean binary(int a[],int s, int e, int t){
        if(s>e) return false;
        int mid=s+(e-s)/2;
        if(a[mid]==t)return true;
        if(a[mid]<t) return binary(a,mid+1,e,t);
        else
        return  binary(a,s,mid-1,t);
    }
    public boolean searchMatrix(int[][] a, int target) {

        for(int i=0;i<a.length;i++){

            if(binary(a[i],0,a[i].length-1,target))
            return true;
        }
        return false;
        
    }
}