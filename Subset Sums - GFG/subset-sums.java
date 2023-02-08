//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    
    
    void walk(ArrayList<Integer> a,int i,int sum,ArrayList<Integer> list)
    {
        
        if(i==a.size())
        {
            list.add(sum);
            return;
        }
        
        walk(a,i+1,sum+a.get(i),list);
        walk(a,i+1,sum,list);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
       // Collections.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        
        walk(arr,0,0,list);
        return list;
        // code here
    }
}