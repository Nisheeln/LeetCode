class DisjointSet{
    int[] parent, rank;

    public DisjointSet(int n){
        parent = new int[n];
        rank = new int[n];

        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int node){
        if(node != parent[node]){
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    boolean union(int u, int v){
        int pu = find(u);
        int pv = find(v);

        if(pu == pv) return false;

        if(rank[pu] < rank[pv]){
            parent[pu] = pv;
        }
        else if(rank[pv] < rank[pu]){
            parent[pv] = pu;
        }
        else{
            parent[pv] = pu;
            rank[pu]++;
        }
        return true;
    }
}


class Solution {
    public int removeStones(int[][] stones) {
        int maxRow = 0;
        int maxCol = 0;
        for(int[] stone : stones){
            maxRow = Math.max(maxRow,stone[0]);
            maxCol = Math.max(maxCol,stone[1]);
        }
        DisjointSet ds = new DisjointSet(maxRow+maxCol+2);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] stone : stones){
            int row = stone[0];
            int col = stone[1]+maxRow+1;

            ds.union(row,col);

            map.put(row,1);
            map.put(col,1);

        }
        int count = 0;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(ds.find(it.getKey()) == it.getKey()){
                count++;
            }
        }
        return stones.length - count;
    }
}