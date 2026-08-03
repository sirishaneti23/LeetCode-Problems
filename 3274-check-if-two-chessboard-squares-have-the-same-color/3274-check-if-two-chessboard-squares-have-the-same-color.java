class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        if(colour(c1) == colour(c2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean colour(String c)
    {
        if(c.charAt(0) == 'a' || c.charAt(0) == 'c' || c.charAt(0) == 'e' || c.charAt(0) == 'g')
        {
            if((int)c.charAt(1)%2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if((int)c.charAt(1)%2 == 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
}