class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        int[] path = new int[numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];

            adj.get(u).add(v);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (dfs(adj, i, visited, path)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int start, int[] visited, int[] path) {
        visited[start] = 1;
        path[start] = 1;

        for (int i : adj.get(start)) {
            if (visited[i] == 0) {
                if (dfs(adj, i, visited, path))
                    return true;
            } else {
                if (path[i] == 1) {
                    return true;
                }
            }
        }
        path[start] = 0;
        return false;
        
    }
}