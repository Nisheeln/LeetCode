class Trio{
    int i;
    int j;
    int abs;

    public Trio(int i, int j, int abs){
        this.i = i;
        this.j = j;
        this.abs = abs;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int dist[][] = new int[heights.length][heights[0].length];
        int direction[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int d[] : dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        PriorityQueue<Trio> q = new PriorityQueue<>((x,y)-> x.abs - y.abs);

        q.add(new Trio(0,0,0));

        while(!q.isEmpty()){
            Trio t = q.poll();
            int i = t.i;
            int j = t.j;
            int abs = t.abs;
            if(i == heights.length-1 && j == heights[0].length-1){
                return abs;
            }
            for(int dir[] : direction){
                int newi = i + dir[0];
                int newj = j + dir[1];
                if(newi>=0 && newj>=0 && newi<heights.length && newj<heights[0].length){
                    int newabs = Math.abs(heights[newi][newj]-heights[i][j]);
                    newabs = Math.max(newabs,abs);
                    if(newabs < dist[newi][newj]){
                        dist[newi][newj] = newabs;
                        q.add(new Trio(newi,newj,newabs));
                    }
                }
            }
        }
        return 0;
    }
}