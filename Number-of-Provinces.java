class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0; 
        boolean visit[] = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(!visit[i]){
                count++;
                dfsUtil(isConnected, i, visit);
            }
        }
        return count;
    }
    public static void dfsUtil(int[][] graph, int curr, boolean[] visit){
        visit[curr]=true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[curr][j] == 1 && curr != j) {
                if(!visit[j]){
                    dfsUtil(graph, j, visit);
                }
            }
        }

    }
}