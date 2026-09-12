class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
        
        if(digits.length() == 0)
        {
            return res;
        }
        
        res.add("");
        
        for(char n : digits.toCharArray())
        {
            String letters = map[n - '0'];
            if(letters == "")
            {
                continue;
            }
            ArrayList<String> next = new ArrayList<>();
            for(String s: res)
            {
                for(char c: letters.toCharArray())
                {
                    next.add(s+c);
                }
            }
            res = next;
        }
        return res;
    }
}