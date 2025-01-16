class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1; 
        int max = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            if(nums[i+1]==nums[i]+1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count=1;
            }
        }
        return max;
    }
    
}
