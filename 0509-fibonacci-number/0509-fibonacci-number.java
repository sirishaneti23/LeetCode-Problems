class Solution {
    public int fib(int n) {
        
        // Iterative approach
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        int fn1 = 1;
        int fn2 = 0;
        int fn = 0;
        for(int i = 2; i <= n; i++)
        {
            fn = fn1+fn2;
            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
        
        /*
        //Recursive approach
        if(n==0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fib(n-1) + fib(n-2);

        */

        /*
        //memoization and recursion

        int[] dp = new int[n+1];
        for(int i = 0; i <= n+1; i++)
        {
            dp[i] = -1;
        }
        return solve(n, dp);

        */
    }

    /*
    private int solve(int n, int[] dp)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }
        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }
    */
}