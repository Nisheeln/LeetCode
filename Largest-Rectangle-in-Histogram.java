class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] nsr = new int[heights.length];
        int[] nsl = new int[heights.length];

        //next Smaller Right

        Stack<Integer> st = new Stack<>();
        for(int i = heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                int top = st.peek();
                nsr[i] = top;
            }
            st.push(i);
        }

        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                int top = s.peek();
                nsl[i] = top;
            }
            s.push(i);
        }

        for(int i = 0; i < n; i++){
            int area = heights[i] * (nsr[i]-nsl[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}