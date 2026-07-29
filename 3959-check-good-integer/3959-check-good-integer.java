class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = 0;
        int ssum = 0;

        while(n > 0)
        {
            int dig = n%10;
            dsum += dig;
            ssum += dig*dig;
            n = n/10;
        }

        return ssum - dsum >= 50;
    }
}