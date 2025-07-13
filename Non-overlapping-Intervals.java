class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int remove = 0;
        int initial = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(initial <= intervals[i][0]){
                initial = intervals[i][1];
            }
            else{
               remove++; 
            }
        }
        return remove;
    }
}