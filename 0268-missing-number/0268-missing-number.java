class Solution {
    public int missingNumber(int[] nums) {
        /*
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i)
            {
                return i;
            }
        }
        return nums.length;
        */

        HashSet <Integer> set = new HashSet<>();

        for(int n : nums)
        {
            set.add(n);
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return nums.length;
    }
}