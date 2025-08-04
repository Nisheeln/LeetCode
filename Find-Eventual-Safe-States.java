class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();
        for(int i = 0 ; i < graph.length; i++){
            adjRev.add(new ArrayList<>());
        }
        int[] indegree = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            for(int j : graph[i]){
                adjRev.get(j).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < graph.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            li.add(curr);
            for(int i : adjRev.get(curr)){
                indegree[i]--;
                if(indegree[i] == 0){
                    q.add(i);
                }
            }
        }
        Collections.sort(li);
        return li;

    }
}