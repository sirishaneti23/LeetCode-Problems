class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> current = new ArrayList<>();
        backtrack(1, n, k, current);
        return result;
    }
    /*
    //backtrack
    public void backtrack(int start, int n, int k, List<Integer> current)
    {
        if(current.size() == k)
        {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = start; i <= n; i++)
        {
            current.add(i);
            backtrack(i+1, n, k, current);
            current.remove(current.size() - 1);
        }
    }
    */
    
    //backtrack and pruning
    public void backtrack(int start, int n, int k, List<Integer> current)
    {
        if(current.size() == k)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        int remaining = k - current.size();
        for(int i = start; i <= n - remaining + 1; i++)
        {
            current.add(i);
            backtrack(i+1, n, k, current);
            current.remove(current.size() - 1);
        }
    }
}