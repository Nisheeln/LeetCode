class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int lmax = height[0];
        for(int i = 0; i < height.length; i++){
            lmax = Math.max(lmax,height[i]);
            left[i] = lmax;
        }

        int rmax = height[height.length-1];
        for(int i = height.length-1; i >=0; i--){
            rmax = Math.max(rmax,height[i]);
            right[i] = rmax;
        }
        int min;
        int sum = 0;
        for(int i = 0; i < height.length; i++){
            min = Math.min(left[i],right[i]);
            sum += min-height[i];
        }
        return sum;
    }
}