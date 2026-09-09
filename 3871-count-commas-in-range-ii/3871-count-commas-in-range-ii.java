class Solution {
    public long countCommas(long n) {
        long res = 0;
        if(n < 0)
        {
            return res;
        }
        for(long i = 1000; i <= n; i*= 1000)
        {
            res += n - i + 1;
        }
        return res;
    }
}