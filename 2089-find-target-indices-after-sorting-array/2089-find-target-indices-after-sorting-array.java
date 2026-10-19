class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[j] > nums[i])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(nums[i] == target)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}