class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                nums[i] *= -1;
            }
        }
        Arrays.sort(nums);

        long score = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i < nums.length/2)
            {
                score -= (nums[i]*nums[i]);
            }
            else
            {
                score += (nums[i]*nums[i]);
            }
        }
        return score;
    }
}