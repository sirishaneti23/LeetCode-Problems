class Solution {
    public boolean checkDivisibility(int n) {
        
        int temp = n;
        int product = 1;
        int sum = 0;


        while(n > 0)
        {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n/= 10;
        }

        int s = sum + product;

        return (temp % s == 0);
    }
}