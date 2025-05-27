class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int[] nums2 = new int[set.size()];
        int p =0;
        for(int item:set){
            nums2[p++] = item;
        }
        int dp[][] = new int[nums.length+1][nums2.length+1];
        for(int i = 1; i < dp.length; i++){
            for(int j =1; j < dp[0].length; j++){
                if(nums[i-1] == nums2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[nums.length][nums2.length];
    }
    
}