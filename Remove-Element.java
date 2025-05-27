class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                a.add(nums[i]);
            }
        }
        int n =0;
        for(int i : a){
            nums[n++] = i;
        }
        return n;
    }
}