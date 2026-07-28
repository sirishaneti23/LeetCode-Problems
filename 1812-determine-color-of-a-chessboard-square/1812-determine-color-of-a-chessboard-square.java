class Solution {
    public boolean squareIsWhite(String c) {
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