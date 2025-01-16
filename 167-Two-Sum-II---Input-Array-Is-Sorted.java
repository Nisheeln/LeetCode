class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] out = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(true){
            if(numbers[i]+numbers[j] == target){
                out[0] = i+1;
                out[1] = j+1;
                break;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return out;
    }
}
