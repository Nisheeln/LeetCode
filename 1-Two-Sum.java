class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int [] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = target-nums[i];
            if(list.contains(complement) && list.indexOf(complement)!=i){
                output[0]=i;
                output[1]=list.indexOf(complement);
            }
        }
        return output;
    }
}
