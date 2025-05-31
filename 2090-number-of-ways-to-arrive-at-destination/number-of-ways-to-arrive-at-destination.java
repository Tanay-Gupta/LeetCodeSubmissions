class Pair {
    long dist;
    int node;

    Pair(long a, int b) {
        this.dist = a;
        this.node = b;
    }
}

class Solution {
    public int countPaths(int n, int[][] r) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] i : r) {
            adj.get(i[0]).add(new Pair(i[2], i[1])); // distance, node
            adj.get(i[1]).add(new Pair(i[2], i[0]));
        }

        long[] ways = new long[n];
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;
        ways[0] = 1;

        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
        q.add(new Pair(0, 0));

        int mod = (int) 1e9 + 7;

        while (!q.isEmpty()) {
            long dist = q.peek().dist;
            int node = q.peek().node;
            q.poll();

            // ✅ Important optimization to skip outdated distances
            if (dist > distance[node]) continue;

            for (Pair p : adj.get(node)) {
                int adjNode = p.node;
                long adjDist = p.dist;

                if (adjDist + dist < distance[adjNode]) {
                    distance[adjNode] = adjDist + dist;
                    q.add(new Pair(distance[adjNode], adjNode));
                    ways[adjNode] = ways[node];
                } else if (adjDist + dist == distance[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }

        return (int)(ways[n - 1] % mod);
    }
}
