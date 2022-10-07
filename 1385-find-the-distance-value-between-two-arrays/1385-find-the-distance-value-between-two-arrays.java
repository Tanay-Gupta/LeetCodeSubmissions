// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
//         TreeSet<Integer> s=new TreeSet<>();
//         for(i=0;i<arr2.length;i++)
//             s.add(arr2[i]);
        
//         for(i=0;i<arr1.length;i++)
//         {
//             if(Math.abs(s.floor(arr1[i]-arr1[i]))<=d||Math.abs(s.ceil(arr1[i]-arr1[i]))<=d)
//         }
        
        
//     }
// }
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for(int p : arr1){
            int count = 0;
            for(int q : arr2){
                if(Math.abs(p - q) <= d){
                    break;
                }
                else{
                    count++;
                }
            }
            if(count == arr2.length){
                res++;
            }
        }
        return res;
    }
}