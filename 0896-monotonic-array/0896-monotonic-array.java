class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag_inc = true;
        boolean flag_dec = true;

        for(int i = 0; i < nums.length -1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                flag_inc = false;
            }

            if(nums[i] < nums[i+1])
            {
                flag_dec = false;
            }
        }

        return flag_inc || flag_dec ;
    }
}