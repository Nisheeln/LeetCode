class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int freq[] = new int[(grid.length * grid[0].length)+1];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ;  j < grid[0].length; j++){
                freq[grid[i][j]--]++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1; i < freq.length; i++){
            if(freq[i]==2){
                arr.add(i);
            }
        }
        for(int i =1; i < freq.length; i++){
            if(freq[i]==0){
                arr.add(i);
            }
        }
        int out[] = new int[arr.size()];
        int i =0;
        for(int obj :arr){
            out[i] = obj;
            i++;
        }
        return out;
    }
}