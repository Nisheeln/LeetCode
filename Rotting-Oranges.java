class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length; 
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshMango =0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    q.add(new int[] {i,j});
                }
                else if(grid[i][j] == 1){
                    freshMango++;
                }
            }
        }
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int minutes = 0;

        while(!q.isEmpty() && freshMango>0){
            int size = q.size();
            minutes++;

            for(int i = 0; i < size; i++){
                int rotten[] = q.poll();
                int r = rotten[0];
                int c = rotten[1];

                for(int[] dir : directions){
                    int newR = r + dir[0];
                    int newC = c + dir[1];

                    if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && grid[newR][newC] == 1) {
                        grid[newR][newC] = 2;
                        freshMango--;
                        q.add(new int[] {newR, newC});
                    }
                }
            }
        }
        if(freshMango == 0){
            return minutes;
        }else{
            return -1;
        }
    }
}