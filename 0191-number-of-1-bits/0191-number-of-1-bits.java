class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String bin1 = Integer.toBinaryString(n);

        for(int i = 0; i < bin1.length(); i++)
        {
            if(bin1.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}