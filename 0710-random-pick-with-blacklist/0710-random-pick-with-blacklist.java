// import java.util.*;
// class Solution {

    
//     ArrayList<Integer> ar=new ArrayList<>();
//     HashSet<Integer> h=new HashSet<>();
//     int limit;
//     public Solution(int n, int[] blacklist) {
//         for(int i:blacklist)
//             h.add(i);
       
//         limit=n;
        
//     }
    
//     public int pick() {
        
//         Random random = new Random();
// int rand=0;
// while (true){
//     rand = random.nextInt(limit);
    
//     if(!h.contains(rand)) break;
// }
//        return rand;
            
//     }
// }
class Solution {
    
    // N: [0, N)
    // B: blacklist
    // B1: < N
    // B2: >= N
    // M: N - B1
    int M;
    Random r;
    Map<Integer, Integer> map;

    public Solution(int N, int[] blacklist) {
        map = new HashMap();
        for (int b : blacklist) // O(B)
            map.put(b, -1);
        M = N - map.size();
        
        for (int b : blacklist) { // O(B)
            if (b < M) { // re-mapping
                while (map.containsKey(N - 1))
                    N--;
                map.put(b, N - 1);
                N--;
            }
        }
        
        r = new Random();
    }
    
    public int pick() {
        int p = r.nextInt(M);
        if (map.containsKey(p))
            return map.get(p);
        return p;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */