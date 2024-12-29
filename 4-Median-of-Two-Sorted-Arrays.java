class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int[nums1.length + nums2.length];
        double med;
        for(int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            nums3[nums1.length + i] = nums2[i];
        }
        Arrays.sort(nums3);
        if(nums3.length%2==0){
            int mid = nums3.length/2;
            double n1 = nums3[mid];
            double n2 = nums3[mid-1];
            med = (n1+n2)/2.0;
        }
        else{
            med = nums3[nums3.length/2];
        }
        return med;
    }
}