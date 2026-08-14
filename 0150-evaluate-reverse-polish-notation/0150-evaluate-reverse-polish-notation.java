class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++)
        {
            String op = tokens[i];
            switch(op)
            {
                case "+": 
                    st.push(st.pop()+st.pop());
                    break;
                case "-": 
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a-b);
                    break;
                case "*": 
                    st.push(st.pop() * st.pop());
                    break;
                case "/":
                    int d = st.pop();
                    int c = st.pop(); 
                    st.push(c/d);
                    break;
                default: st.push(Integer.parseInt(op));
            }
        }
        return st.peek();
    }
}