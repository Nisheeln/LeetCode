class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(!str.equals(\+\)  && !str.equals(\-\) && !str.equals(\*\) && !str.equals(\/\)){
                st.push(Integer.parseInt(str));
            }
            else{
                if (st.size() < 2) {
        throw new IllegalArgumentException(\Invalid RPN expression: Not enough operands\);
    }
                int b = st.pop();
                int a = st.pop();

                if(str.equals(\+\)){
                    
                    st.push(a+b);
                }
                else if(str.equals(\-\)){
                    st.push(a-b);
                }
                else if(str.equals(\*\)){
                    st.push(a*b);
                }
                else if(str.equals(\/\)){
                    st.push(a/b);
                }
            }
        }
        return st.pop();
    }
}