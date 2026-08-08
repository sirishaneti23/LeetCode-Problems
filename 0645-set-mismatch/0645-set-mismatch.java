class Solution {
    public int[] findErrorNums(int[] nums) {        
        int n = nums.length;
        Arrays.sort(nums);
        int repeating = -1;
        int missing = -1;

        if (nums[0] != 1) 
        {
            missing = 1;
        }

        for (int i = 1; i < n; i++) 
        {
            if (nums[i] == nums[i - 1]) 
            {
                repeating = nums[i];
            }
            else if (nums[i] - nums[i - 1] > 1) 
            {
                missing = nums[i - 1] + 1;
            }
        }
        if (missing == -1 && nums[n - 1] != n) {
            missing = n;
        }

        return new int[] { repeating, missing};
    }

}