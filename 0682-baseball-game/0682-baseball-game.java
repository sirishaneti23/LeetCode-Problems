class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        int sum = 0;
        for(String op: operations)
        {
            switch(op)
            {
                case "+":
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b);
                    st.push(a);
                    st.push(a+b);
                    break;
                case "D":
                    st.push(st.peek()*2);
                    break;
                case "C":
                    st.pop();
                    break;
                default:
                    st.push(Integer.parseInt(op));
            }
        }

        for(int num: st)
        {
            sum += num;
        }
        return sum;
    }
}