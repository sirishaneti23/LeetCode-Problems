class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lc = false;
        boolean uc = false;
        boolean dig = false;
        boolean spec = false;
        String sp = "!@#$%^&*()-+";

        if(password.length() < 8)
        {
            return false;
        }

        for(int i = 0; i<password.length()-1; i++)
        {
            if(password.charAt(i) == password.charAt(i+1))
            {
                return false;
            }
        }

        for(int i = 0; i < password.length(); i++)
        {
            char c = password.charAt(i);
            if(Character.isUpperCase(c))
            {
                uc = true;
            }

             if(Character.isLowerCase(c))
            {
                lc = true;
            }

            if(Character.isDigit(c))
            {
                dig = true;
            }

            if(sp.indexOf(c) != -1)
            {
                spec = true;
            }
        }
        return uc && lc && dig && spec;
    }
}