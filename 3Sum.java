class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        int target;
        Arrays.sort(nums);
        int i =0 ;
        while(i<nums.length-2){
            if (i > 0 && nums[i] == nums[i - 1]){
                i++;
                continue;
            } 

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[j]+nums[k] + nums[i];
                if(sum==0){
                    List<Integer> el = new ArrayList<>();
                    el.add(nums[j]);
                    el.add(nums[k]);
                    el.add(nums[i]);
                    out.add(el);
                    
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        return out;
    }
}