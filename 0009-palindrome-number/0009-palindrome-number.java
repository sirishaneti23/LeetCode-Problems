class Solution {
    public boolean isPalindrome(int x) {
        int rev_num = 0;

        int temp = x;

        while(temp > 0)
        {
            int d = temp % 10;
            rev_num = rev_num * 10 + d;
            temp /= 10;
        }

        if(rev_num == x)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}