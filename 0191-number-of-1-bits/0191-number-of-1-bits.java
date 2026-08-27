class Solution {
    public int hammingWeight(int n) {
        /**int count = 0;
        String bin1 = Integer.toBinaryString(n);

        for(int i = 0; i < bin1.length(); i++)
        {
            if(bin1.charAt(i) == '1')
            {
                count++;
            }
        }
        return count; */

        int count = 0;
        while(n > 0)
        {
            count += (n&1);
            n=n>>1;
        }
        return count;
    }
}