class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int ze = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            prod *= nums[i];
            if(nums[i] == 0){
                count ++;
                continue;
                
            }
            ze *= nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(count >= 2){
                nums[i] = prod;
                continue;
            }
            if(nums[i] != 0){
                nums[i] = prod/nums[i];
            }
            else{
                nums[i] = ze;
            }
        }
        return nums;
    }
}  
