class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        int count = 0;

        while(low < high)
        {
            int sum = nums[low] + nums[high];
            if(sum == k)
            {
                count++;
                low++;
                high--;
            }
            if(sum < k)
            {
                low++;
            }
            if(sum > k)
            {
                high--;
            }
        }
        return count;
    }
}