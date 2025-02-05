class Solution {
    public int longestValidParentheses(String s) {
        int left = 0; 
        int right = 0;
        int maxLength = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                left++;
            }
            else{
                right++;
            }
            if(left == right){
                maxLength = Math.max(maxLength, 2*left);
            }
            else if(right > left){
                right = left = 0;
            }
        }
        right = left = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '('){
                left++;
            }
            else{
                right++;
            }
            if(left == right){
                maxLength = Math.max(maxLength, 2*right);
            }
            else if(left > right){
                right = left = 0;
            }
        }
        return maxLength;
    }
}