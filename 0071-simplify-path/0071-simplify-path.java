class Solution {
    public String simplifyPath(String path) {
        Stack <String> s = new Stack<>();
        String[] arr = path.split("/");

        for(String str : arr)
        {
            if(str.equals("") || str.equals("."))
            {
                continue;
            }
            else if(str.equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else
            {
                s.push(str);
            }
        }

        if(s.isEmpty())
        {
            return "/";
        }

        StringBuilder result = new StringBuilder();

        for(String part : s)
        {
            result = result.append("/").append(part);
        }

        return result.toString();
    }
}