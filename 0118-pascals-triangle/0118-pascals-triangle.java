class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> n1 = new ArrayList<>();
        n1.add(1);
        res.add(n1);
        if(numRows == 1)
        {
            return res;
        }

        for(int count = 1; count < numRows; count++)
        {
            List<Integer> current_row = new ArrayList<>();
            List<Integer> prev_row = res.get(count-1);
            current_row.add(1);
            for(int rc = 1; rc < count; rc++)
            {
                int sum = prev_row.get(rc) + prev_row.get(rc-1);
                current_row.add(sum);
            }
            current_row.add(1);
            res.add(current_row);
        }
        return res;
    }
}